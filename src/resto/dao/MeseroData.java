package resto.dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import resto.entidades.Mesero;

public class MeseroData {

    //atributo
    private Connection con = null;
    
    //constructor
    public MeseroData(Conexion c) {
        con = c.getConexion();
    }
    
    //metodos
    public boolean agregarMesero(Mesero mesero){ //agrega mesero si el dni no se repite
       boolean agregado = false;
       
       try{
           String sql = "INSERT INTO mesero(nombre, apellido, dni, telefono, activo) VALUES ( ? , ? , ? , ? , ? );";
           PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
           ps.setString(1, mesero.getNombre());
           ps.setString(2, mesero.getApellido());
           ps.setLong(3, mesero.getDni());
           ps.setLong(4, mesero.getTelefono());
           ps.setInt(5, mesero.isActivo() ? 1 : 0);
           
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();

           if (rs.next()) {
            mesero.setIdMesero(rs.getInt(1));
            agregado = true;
           }
           
           ps.close();
           
       }catch(SQLException e){
           agregado = false;
           
           if (e instanceof java.sql.SQLIntegrityConstraintViolationException) {
            JOptionPane.showMessageDialog(null, "Ya existe un mesero con ese DNI");
            
           } else {
            JOptionPane.showMessageDialog(null, "Error al agregar mesero " + e);
            
           }
       }
       
       return agregado;
    }
    
    public ArrayList<Mesero> obtenerMeseros(){ //devuelve solo los meseros activos
        ArrayList<Mesero> meseros = new ArrayList();
        
        try{
            String sql = "SELECT * FROM mesero WHERE activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(!rs.next()){                
                JOptionPane.showMessageDialog(null, "No se encontraron meseros activos.");
                
                ps.close();
                return meseros;
                
            }
            
            rs.previous();            
            Mesero mesero;
            
            while(rs.next()){
                mesero = new Mesero();
                
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getLong("dni"));
                mesero.setTelefono(rs.getLong("telefono"));
                mesero.setActivo(rs.getBoolean("activo"));
                
                meseros.add(mesero);                
            }
            
            ps.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener meseros " + e);
            
        }
        
        return meseros;
    }
    
        public ArrayList<Mesero> obtenerMeserosNoActivos(){ //devuelve solo los meseros no activos
        ArrayList<Mesero> meseros = new ArrayList();
        
        try{
            String sql = "SELECT * FROM mesero WHERE activo = 0;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(!rs.next()){                
                JOptionPane.showMessageDialog(null, "No se encontraron meseros inactivos.");
                
                ps.close();
                return meseros;
                
            }
            
            rs.previous();            
            Mesero mesero;
            
            while(rs.next()){
                mesero = new Mesero();
                
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getLong("dni"));
                mesero.setTelefono(rs.getLong("telefono"));
                mesero.setActivo(rs.getBoolean("activo"));
                
                meseros.add(mesero);                
            }
            
            ps.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener meseros " + e);
            
        }
        
        return meseros;
    }
    
    public ArrayList<Mesero> obtenerTodosMeseros(){ //devuelve los meseros activos y no activos
        ArrayList<Mesero> meseros = new ArrayList();
        
        try{
            String sql = "SELECT * FROM mesero;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(!rs.next()){                
                JOptionPane.showMessageDialog(null, "No hay meseros en la base de datos");
                
                ps.close();
                return meseros;
                
            }
            
            rs.previous();            
            Mesero mesero;
            
            while(rs.next()){
                mesero = new Mesero();
                
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getLong("dni"));
                mesero.setTelefono(rs.getLong("telefono"));
                mesero.setActivo(rs.getBoolean("activo"));
                
                meseros.add(mesero);                
            }
            
            ps.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener meseros " + e);
            
        }
        
        return meseros;
    }    
    
    public Mesero obtenerMesero(int id){
        Mesero mesero = null;
        
        try{
            String sql = "SELECT * FROM mesero WHERE idMesero = ?;";  
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                mesero = new Mesero();
                
                mesero.setIdMesero(id);
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getLong("dni"));
                mesero.setTelefono(rs.getLong("telefono"));
                mesero.setActivo(rs.getBoolean("activo"));
                                
            }
            
            ps.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener mesero" + e);
        }
        
        return mesero;
    }
    
    public boolean desactivarMesero(int id){
        boolean desactivado = false;
        
        try{
            String sql = "UPDATE mesero SET activo = 0 WHERE idMesero = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            if(ps.executeUpdate() != 0){
                desactivado = true;
            }
            
            ps.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al desactivar mesero" + e);
        }
        
        return desactivado;
    }
    
    public boolean modificarMesero(Mesero mesero){
        boolean modificado = false;
        
        try{
            String sql = "UPDATE mesero SET nombre = ? , apellido = ? , dni = ? , telefono = ? , activo = ? WHERE idMesero = ? ;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setLong(3, mesero.getDni());
            ps.setLong(4, mesero.getTelefono());
            ps.setBoolean(5, mesero.isActivo());
            ps.setInt(6, mesero.getIdMesero());
            
            if(ps.executeUpdate() != 0){
                modificado = true;
            }
            
            ps.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar mesero" + e);
        }
        
        return modificado;
    }
    
}
