package resto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import resto.entidades.*;

public class DetalleData {

//  Atributos
  private Connection con = null;
  private ProductoData productoData;
  private PedidoData pedidoData;

//  Constructores
  public DetalleData(Conexion conexion) {
    con = conexion.getConexion();
    productoData = new ProductoData(conexion);
    pedidoData = new PedidoData(conexion);
  }

//  Metodos
  public DetalleDelPedido obtenerDetalle(int id) {
    DetalleDelPedido detalle = new DetalleDelPedido();

    String sql = "SELECT * FROM detalle WHERE idDetalle = ?";

    try {

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, id);

      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        detalle.setIdDetalle(rs.getInt("idDetalle"));
        
        Producto prod = productoData.obtenerProducto(rs.getInt("codigoProducto"));
        detalle.setProducto(prod);
        
        Pedido ped = pedidoData.obtenerPedido(rs.getInt("idPedido"));
        detalle.setPedido(ped);
        
        detalle.setCantidad(rs.getInt("cantidad"));
        
        detalle.setActivo(rs.getBoolean("activo"));
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener detalle del pedido " + ex);
    }

    return detalle;
  }
}
