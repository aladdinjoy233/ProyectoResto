package resto.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
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

  public ArrayList<DetalleDelPedido> obtenerDetallesDePedido(int idPedido) {
    ArrayList<DetalleDelPedido> detalles = new ArrayList<>();

    String sql = "SELECT * FROM detalle WHERE idPedido = ? AND activo = 1";

    try {

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, idPedido);

      ResultSet rs = ps.executeQuery();

      DetalleDelPedido detalle;

      while (rs.next()) {
        detalle = new DetalleDelPedido();

        detalle.setIdDetalle(rs.getInt("idDetalle"));

        Producto prod = productoData.obtenerProducto(rs.getInt("codigoProducto"));
        detalle.setProducto(prod);

        Pedido ped = pedidoData.obtenerPedido(rs.getInt("idPedido"));
        detalle.setPedido(ped);

        detalle.setCantidad(rs.getInt("cantidad"));

        detalle.setActivo(rs.getBoolean("activo"));

        detalles.add(detalle);
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener detalles de un pedido " + ex);
    }

    return detalles;
  }

  public boolean agregarDetalle(DetalleDelPedido detalle) {
    boolean agregado = false;

    String sql = "INSERT INTO detalle(codigoProducto, idPedido, cantidad, activo) VALUES (?, ?, ?, ?);";

    try {
      PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

      ps.setInt(1, detalle.getProducto().getCodigo());
      ps.setInt(2, detalle.getPedido().getIdPedido());
      ps.setInt(3, detalle.getCantidad());
      ps.setBoolean(4, detalle.isActivo());

      ps.executeUpdate();
      ResultSet rs = ps.getGeneratedKeys();

      if (rs.next()) {
        detalle.setIdDetalle(rs.getInt("idDetalle"));
        agregado = true;
      }

      ps.close();

    } catch (SQLException e) {
      agregado = false;
      JOptionPane.showMessageDialog(null, "Error al agregar detalle del pedido " + e);
    }

    return agregado;
  }

  public boolean modificarDetalle(DetalleDelPedido detalle) {
    boolean modificado = false;

    String sql = "UPDATE detalle SET codigoProducto = ?, idPedido = ?, cantidad = ?, activo = ? WHERE idDetalle = ?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, detalle.getProducto().getCodigo());
      ps.setInt(2, detalle.getPedido().getIdPedido());
      ps.setInt(3, detalle.getCantidad());
      ps.setBoolean(4, detalle.isActivo());
      ps.setInt(5, detalle.getIdDetalle());

      if (ps.executeUpdate() != 0) {
        modificado = true;
      }

      ps.close();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al modificar pedido " + e);
    }

    return modificado;
  }

  public boolean desactivarDetalle(int id) {
    boolean desactivado = false;

    String sql = "UPDATE detalle SET activo = 0 WHERE idDetalle = ?;";

    try {
      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, id);

      if (ps.executeUpdate() != 0) {
        desactivado = true;
      }

      ps.close();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al desactivar mesero" + e);
    }

    return desactivado;
  }
}
