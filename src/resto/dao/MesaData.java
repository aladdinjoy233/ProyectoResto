package resto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import resto.entidades.Mesa;

/**
 *
 * @author edder
 */
public class MesaData {

    //Atributos
    private Connection coneccion = null;

    //Constructor
    public MesaData(Conexion coneccion) {
        this.coneccion = coneccion.getConexion();
    }

    //Metodos
    public boolean buscarMesa(int numMesa) {
        boolean result = false;
        Mesa mesa = new Mesa();
        mesa.setNumMesa(numMesa);
        String sql = "SELECT * FROM mesa WHERE numMesa = ?;";
        try {
            PreparedStatement ps = coneccion.prepareStatement(sql);

            ps.setInt(1, mesa.getNumMesa());

            ResultSet rs = ps.executeQuery();
            if (rs.next() && mesa.getNumMesa() == (rs.getInt("numMesa"))) {
                result = true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la Mesa" + ex);
        }
        return result;
    }

    public boolean crearMesa(Mesa mesa) {
        boolean result = true;
        if (buscarMesa(mesa.getNumMesa())) {
            JOptionPane.showMessageDialog(null, "La Mesa ya existe");
            return false;
        }
        String sql = "Insert Into mesa(numMesa, capacidad, estado, activo) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = coneccion.prepareStatement(sql);

            ps.setInt(1, mesa.getNumMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setBoolean(4, mesa.isActivo());

            ps.executeUpdate();
                        
            ps.close();

        } catch (SQLException ex) {
            result = false;
            JOptionPane.showMessageDialog(null, "Error al crear la Mesa" + ex);
        }

        return result;
    }

}
