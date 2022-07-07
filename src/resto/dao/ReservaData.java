package resto.dao;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.util.*;
import java.sql.*;
import resto.entidades.*;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ReservaData {

    //atrib
    private Connection con = null;
    //private MesaData mesaData;

    //construct
    public ReservaData(Conexion conexion) {
        con = conexion.getConexion();
    }

    //metod
    public boolean existeReserva(Reserva reserva) {
        boolean existe = false;

        String sql = "SELECT * FROM reserva WHERE numMesa = ? AND fecha = ? AND hora = ? AND activo = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, reserva.getMesa().getNumMesa());
            ps.setDate(2, Date.valueOf(reserva.getFecha()));
            ps.setTime(3,Time.valueOf(reserva.getHora()));
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
            JOptionPane.showMessageDialog(null, "Error al comparar Reserva\n"+ ex);
        }
        return existe;
    }

    public boolean agregarReserva(Reserva reserva) {

        if (existeReserva(reserva)) {
            JOptionPane.showMessageDialog(null, "ya existe esa reserva");
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
            JOptionPane.showMessageDialog(null, "Error al cargar la reseva\n"+ex);
        }
        return insert;
    }

  /*  public ArrayList<Reserva> obtenerReservas() {

        ArrayList<Reserva> reservas = new ArrayList<>();

        String sql = "SELECT * FROM reseva WHERE activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            Reserva reserva;

            while (rs.next()) {
                reserva = new Reserva();

                reserva.setIdReserva(rs.getInt("idReseva"));
                //Mesa mesa = obtenerMesa(rs.getInt("numMesa"));
                // reserva.setMesa(mesa);
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getLong("dni"));
                reserva.setFecha(LocalDate.parse("fecha"));
                reserva.setHora(LocalDateTime.parse("hora"));
                reserva.setActivo(rs.getBoolean("activo"));

                reservas.add(reserva);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reservas");
        }

        return reservas;
    }

    public Reserva obtenerReserva(int id) {

        Reserva reserva = new Reserva();

        String sql = "SELECT * FROM reserva WHERE id = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt("idReseva"));
                //Mesa mesa = obtenerMesa(rs.getInt("numMesa"));
                //reserva.setMesa(mesa);
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getLong("dni"));
                reserva.setFecha(LocalDate.parse("fecha"));
                reserva.setHora(LocalDateTime.parse("hora"));
                reserva.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reserva" + ex);
        }

        return reserva;
    }

    public boolean desactivarReserva(int id) {
        boolean borrado = false;

        String sql = "UPDATE reserva SET activo = 0 WHERE id = ?";

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

        String sql = "UPDATE reserva SET numMesa = ?, nombre = ?, dni = ?, fecha = ?, hora = ?"
                + ", activo = ? WHERE id = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, reserva.getMesa().getNumMesa());
            ps.setString(2, reserva.getNombre());
            ps.setLong(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setTime(5, reserva.getHora());
            ps.setBoolean(6, reserva.isActivo());
            ps.setInt(7, reserva.getIdReserva());

            if (ps.executeUpdate() != 0) {
                modificado = true;
            }

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modificado;
    }

    public void borrarReserva(int id) {

        String sql = "DELETE FROM reserva WHERE `reserva`.`id` = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La reserva ha sido eliminada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar reserva" + ex);
        }

    }
*/
}
