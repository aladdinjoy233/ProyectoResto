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
            JOptionPane.showMessageDialog(null, "Error al buscar la Mesa" + mesa.getNumMesa());
        }
        return result;
    }

    public boolean crearMesa(Mesa mesa) {
        boolean result = true;
        if (buscarMesa(mesa.getNumMesa())) {
            JOptionPane.showMessageDialog(null, "La Mesa N°" + mesa.getNumMesa() + " ya Existe");
            return false;
        }
        String sql = "Insert Into mesa(numMesa, capacidad, estado, activo) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = coneccion.prepareStatement(sql);

            ps.setInt(1, mesa.getNumMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setBoolean(4, mesa.isActivo());

             if(ps.executeUpdate() != 0){
                result = true;
                JOptionPane.showMessageDialog(null, "La Mesa N° "+ mesa.getNumMesa() + " se Creo Correctamente");
            }
                        
            ps.close();

        } catch (SQLException ex) {
            result = false;
            JOptionPane.showMessageDialog(null, "Error al crear la Mesa N°" + mesa.getNumMesa());
        }

        return result;
    }
    
    public boolean modificarMesa(Mesa mesa){
        boolean result = false;
        if (!(buscarMesa(mesa.getNumMesa()))) {
            JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " no existe");
            return false;
        }
        
        String sql = "UPDATE mesa SET capacidad = ?, estado = ?, activo = ?  WHERE numMesa = ?";
        try {
            PreparedStatement ps = coneccion.prepareStatement(sql);
            
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, mesa.isEstado());
            ps.setBoolean(3, mesa.isActivo());
            ps.setInt(4,mesa.getNumMesa());
            
            if(ps.executeUpdate() != 0){
                result = true;
                JOptionPane.showMessageDialog(null, "La Mesa N° "+ mesa.getNumMesa() + " se Modifico Correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar la Mesa.");
        }
        return result;
    }
    
    public boolean borrarMesa(Mesa mesa){
        boolean result = false;
        if (!(buscarMesa(mesa.getNumMesa()))) {
            JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " no existe");
            return false;
        }
        
        String sql = "DELETE FROM mesa WHERE numMesa = ?";
        try {
            PreparedStatement ps = coneccion.prepareStatement(sql);
            
            ps.setInt(1, mesa.getNumMesa());
            
             if(ps.executeUpdate() != 0){
                result = true;
                JOptionPane.showMessageDialog(null, "La Mesa N° "+ mesa.getNumMesa() + " se a Borrado Correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Borrar la Mesa.");
        }
        
        return result;
    }

}
