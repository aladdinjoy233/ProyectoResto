package resto.dao;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.util.*;
import java.sql.*;
import resto.entidades.*;
import java.sql.Date;
import javax.swing.JOptionPane;

public class ReservaData {

    //atrib
    private Connection con = null;
    private MesaData md;

    //construct
    public ReservaData(Conexion conexion) {
        con = conexion.getConexion();
        this.md = new MesaData(conexion);
    }

    //metod
    public boolean existeReserva(Reserva reserva) {
        boolean existe = false;

        String sql = "SELECT * FROM reserva WHERE numMesa = ? AND fecha = ? AND hora = ? AND activo = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, reserva.getMesa().getNumMesa());
            ps.setDate(2, Date.valueOf(reserva.getFecha()));
            ps.setTime(3, Time.valueOf(reserva.getHora()));
            ps.setBoolean(4, reserva.isActivo());

            ResultSet rs = ps.executeQuery();

            if (rs.next() && reserva.getMesa().getNumMesa() == rs.getInt("numMesa")
                    && Date.valueOf(reserva.getFecha()).equals(rs.getDate("fecha"))
                    && Time.valueOf(reserva.getHora()).equals(rs.getTime("hora"))
                    && reserva.isActivo() == rs.getBoolean("activo")) {
                existe = true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al comparar Reserva\n" + ex);
        }
        return existe;
    }

    public boolean agregarReserva(Reserva reserva) {

        LocalDate hoy = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        if (existeReserva(reserva)) {
            JOptionPane.showMessageDialog(null, "ya existe esa reserva");
            return false;
        } else if (reserva.getFecha().isBefore(hoy) || reserva.getFecha().equals(hoy) && reserva.getHora().isBefore(horaActual)) {
            JOptionPane.showMessageDialog(null, "la fecha/hora debe ser proxima a la actual");
            return false;
        }

        boolean insert = true;

        String sql = "INSERT INTO reserva (numMesa, nombre, dni, fecha, hora, activo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, reserva.getMesa().getNumMesa());
            ps.setString(2, reserva.getNombre());
            ps.setLong(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setTime(5, Time.valueOf(reserva.getHora()));
            ps.setBoolean(6, reserva.isActivo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
            } else {
                insert = false;
            }

            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva agregada exitosamente");
        } catch (SQLException ex) {
            insert = false;
            JOptionPane.showMessageDialog(null, "Error al cargar la reseva\n" + ex);
        }
        return insert;
    }

    public ArrayList<Reserva> obtenerReservas() {

        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        Mesa mesa;

        String sql = "SELECT * FROM reserva WHERE activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                reserva = new Reserva();
                mesa = new Mesa();

                reserva.setIdReserva(rs.getInt("idReserva"));

                mesa = md.obtenerMesa(rs.getInt("numMesa"));

                reserva.setMesa(mesa);
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getLong("dni"));
                reserva.setFecha(rs.getDate("fecha").toLocalDate());
                reserva.setHora(rs.getTime("hora").toLocalTime());
                reserva.setActivo(rs.getBoolean("activo"));

                reservas.add(reserva);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reservas" + ex);
        }

        return reservas;
    }

    public Reserva obtenerReserva(int idReserva) {

        Reserva reserva = new Reserva();
        Mesa mesa = new Mesa();

        String sql = "SELECT * FROM reserva WHERE idReserva = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idReserva);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt("idReserva"));

                mesa = md.obtenerMesa(rs.getInt("numMesa"));
                reserva.setMesa(mesa);

                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getLong("dni"));
                reserva.setFecha(rs.getDate("fecha").toLocalDate());
                reserva.setHora(rs.getTime("hora").toLocalTime());
                reserva.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe dicha reserva");
                return reserva = null;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reserva " + ex);
        }

        return reserva;
    }

    public boolean desactivarReserva(int id) {
        boolean borrado = false;

        String sql = "UPDATE reserva SET activo = 0 WHERE idReserva = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                borrado = true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reserva" + ex);
        }
        return borrado;
    }

    public boolean modificarReserva(Reserva reserva) {
        boolean modificado = false;
        LocalDate hoy = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        if (existeReserva(reserva)) {
            return modificado;
        }

        if (reserva.getFecha().isBefore(hoy) || reserva.getFecha().equals(hoy) && reserva.getHora().isBefore(horaActual)) {
            JOptionPane.showMessageDialog(null, "la fecha/hora debe ser proxima a la actual");
            return modificado;
        }

        String sql = "UPDATE reserva SET numMesa = ?, nombre = ?, dni = ?, fecha = ?, hora = ?, activo = ? WHERE idReserva = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, reserva.getMesa().getNumMesa());
            ps.setString(2, reserva.getNombre());
            ps.setLong(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setTime(5, Time.valueOf(reserva.getHora()));
            ps.setBoolean(6, reserva.isActivo());
            ps.setInt(7, reserva.getIdReserva());

            if (ps.executeUpdate() != 0) {
                modificado = true;
            }

            ps.close();

            JOptionPane.showMessageDialog(null, "Reserva actualizada exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar reserva\n" + ex);
        }
        return modificado;
    }

    public void borrarReserva(int idReserva) {

        String sql = "DELETE FROM reserva WHERE `reserva`.`idReserva` = ?";

        try {
            Reserva reserva = obtenerReserva(idReserva);
            if (reserva != null) {

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idReserva);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "La reserva ha sido eliminada");

                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar reserva\n" + ex);
        }

    }

    public ArrayList<Reserva> obtenerReservasInactivas() {

        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        Mesa mesa;

        String sql = "SELECT * FROM reserva WHERE activo = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                reserva = new Reserva();
                mesa = new Mesa();

                reserva.setIdReserva(rs.getInt("idReserva"));

                mesa = md.obtenerMesa(rs.getInt("numMesa"));

                reserva.setMesa(mesa);
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getLong("dni"));
                reserva.setFecha(rs.getDate("fecha").toLocalDate());
                reserva.setHora(rs.getTime("hora").toLocalTime());
                reserva.setActivo(rs.getBoolean("activo"));

                reservas.add(reserva);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reservas" + ex);
        }

        return reservas;
    }

    public int obtenerId(Reserva reserva) {
        int id;
        Reserva aux = null;
        Mesa mesa;

        String sql = "SELECT * FROM reserva WHERE numMesa = ? AND nombre = ? AND dni = ? AND fecha = ? AND hora = ? AND activo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, reserva.getMesa().getNumMesa());
            ps.setString(2, reserva.getNombre());
            ps.setLong(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setTime(5, Time.valueOf(reserva.getHora()));
            ps.setBoolean(6, reserva.isActivo());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                aux = new Reserva();
                mesa = new Mesa();

                aux.setIdReserva(rs.getInt("idReserva"));

                mesa = md.obtenerMesa(rs.getInt("numMesa"));

                aux.setMesa(mesa);
                aux.setNombre(rs.getString("nombre"));
                aux.setDni(rs.getLong("dni"));
                aux.setFecha(rs.getDate("fecha").toLocalDate());
                aux.setHora(rs.getTime("hora").toLocalTime());
                aux.setActivo(rs.getBoolean("activo"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reservas" + ex);
        }

        id = aux.getIdReserva();
        
        return id;
    }

}
