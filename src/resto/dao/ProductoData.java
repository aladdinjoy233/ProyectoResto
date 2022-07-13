package resto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import resto.entidades.Producto;

/**
 *
 * @author Valeria
 */
public class ProductoData {
    //Atributos
    private Connection con = null;
    
    //Constructor
    public ProductoData(Conexion conexion) {
        con = conexion.getConexion();
    }

    public ProductoData() {
    }
    
    //Metodos
    public boolean existeProducto(Producto producto){
        boolean existe = false;
        
        String sql = "SELECT * FROM producto WHERE nombre = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, producto.getNombre());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() && producto.getNombre().equalsIgnoreCase(rs.getString("nombre"))){
                existe = true;
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al comparar productos" + ex);
        }
        
        return existe;
    }
    
    public boolean agregarProducto(Producto producto){
        
        if(existeProducto(producto)){
            JOptionPane.showMessageDialog(null, "El producto ingresado ya existe");
            return false;
        }
        
        boolean insert = true;
        
        String sql = "INSERT INTO producto(nombre,stock,precio,comestible,activo) VALUES (?,?,?,?,?);";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isComestible());
            ps.setBoolean(5, producto.isActivo());
            
            ps.executeUpdate();
            
            ResultSet  rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                producto.setCodigo(rs.getInt(1));
            }else{
                insert = false;
            }
            
            ps.close();
            
        }catch(SQLException ex){
            insert = false;
            JOptionPane.showMessageDialog(null, "Error al cargar el producto" + ex);
        }
        
        return insert;
    }
    
    public Producto obtenerProducto(int codigo){
        Producto producto = new Producto();
        
        String sql = "SELECT * FROM producto WHERE codigo = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setComestible(rs.getBoolean("comestible"));
                producto.setActivo(rs.getBoolean("activo"));    
            }else{
                JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
            }
            
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener el producto" + ex);
        }
        
        return producto;
    }
    
    public ArrayList<Producto> obtenerProductos(boolean activo){
        ArrayList<Producto> productos = new ArrayList<>();
        
        String sql = "SELECT * FROM producto WHERE activo = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setBoolean(1, activo);
            
            ResultSet rs = ps.executeQuery();
            
            Producto producto;
            
            while(rs.next()){
                producto = new Producto();
                
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setComestible(rs.getBoolean("comestible"));
                producto.setActivo(rs.getBoolean("activo"));
                
                productos.add(producto);
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener los productos" + ex);
        }
        
        return productos;
    }
    
    public boolean modificarProducto(Producto producto){
        boolean update = false;
        
        String sql = "UPDATE producto SET nombre = ?, stock = ?, precio = ?, comestible = ?, activo = ? WHERE codigo = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isComestible());
            ps.setBoolean(5, producto.isActivo());
            ps.setInt(6, producto.getCodigo());
            
            if(ps.executeUpdate()!=0){
                update = true;
            }else{
                JOptionPane.showMessageDialog(null,"El producto que se desea modificar no existe");
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return update;
    }
    
    public boolean desactivarProducto(int codigo){
        boolean desactivado = false;
        
        String sql = "UPDATE producto SET activo = 0 WHERE codigo = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, codigo);
            
            if(ps.executeUpdate()!=0){
                desactivado = true;
            }else{
                JOptionPane.showMessageDialog(null, "El producto que intenta desactivar no existe");
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener producto" + ex);
        }
        
        return desactivado;
    }
    
    public boolean eliminarProducto(int codigo){
        boolean delete = false;
        
        String sql = "DELETE FROM producto WHERE codigo = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, codigo);
            
            if(ps.executeUpdate()!=0){
                delete = true;
            }else{
                JOptionPane.showMessageDialog(null, "El producto que intenta eliminar no existe");
            }
            
            ps.close();
                      
        }catch(SQLException ex){
            if(ex instanceof java.sql.SQLIntegrityConstraintViolationException){
                JOptionPane.showMessageDialog(null,"Error al eliminar. El producto es empleado por otras areas");
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar el producto" + ex);
            }
        }
        
        return delete;
    }
}
