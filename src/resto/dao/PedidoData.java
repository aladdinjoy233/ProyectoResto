package resto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import resto.entidades.*;

public class PedidoData {

//  Atributos
  private Connection con = null;
  private MesaData mesaData;
  private MeseroData meseroData;

//  Constructores
  public PedidoData(Conexion conexion) {
    con = conexion.getConexion();
    mesaData = new MesaData(conexion);
    meseroData = new MeseroData(conexion);
  }

//  Metodos
  public Pedido obtenerPedido(int id) {
    Pedido pedido = new Pedido();

    String sql = "SELECT * FROM pedido WHERE idPedido = ?";

    try {

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, id);

      ResultSet rs = ps.executeQuery();

      if (rs.next()) {

        pedido.setIdPedido(rs.getInt("idPedido"));

        Mesa mesa = mesaData.obtenerMesa(rs.getInt("numMesa"));
        pedido.setMesa(mesa);

        Mesero mesero = meseroData.obtenerMesero(rs.getInt("idMesero"));
        pedido.setMesero(mesero);

        pedido.setPagado(rs.getBoolean("pagado"));

        pedido.setFecha(rs.getDate("fecha").toLocalDate());

        pedido.setHora(rs.getTime("hora").toLocalTime());

        pedido.setActivo(rs.getBoolean("activo"));

      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener pedido " + ex);
    }

    return pedido;
  }

  public ArrayList<Pedido> obtenerPedidos() {
    ArrayList<Pedido> pedidos = new ArrayList<>();

    String sql = "SELECT * FROM pedido";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();

      Pedido pedido;

      while (rs.next()) {
        pedido = new Pedido();
        pedido.setIdPedido(rs.getInt("idPedido"));

        Mesa mesa = mesaData.obtenerMesa(rs.getInt("numMesa"));
        pedido.setMesa(mesa);

        Mesero mesero = meseroData.obtenerMesero(rs.getInt("idMesero"));
        pedido.setMesero(mesero);

        pedido.setPagado(rs.getBoolean("pagado"));

        pedido.setFecha(rs.getDate("fecha").toLocalDate());

        pedido.setHora(rs.getTime("hora").toLocalTime());

        pedido.setActivo(rs.getBoolean("activo"));

        pedidos.add(pedido);
      }

      ps.close();

    } catch (SQLException exc) {
      JOptionPane.showMessageDialog(null, "No se pudo obtener pedidos " + exc);
    }

    return pedidos;
  }

  public ArrayList<Pedido> obtenerPedidosActivos() {
    ArrayList<Pedido> pedidos = new ArrayList<>();

    String sql = "SELECT * FROM pedido WHERE activo = 1";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();

      Pedido pedido;

      while (rs.next()) {
        pedido = new Pedido();
        pedido.setIdPedido(rs.getInt("idPedido"));
        
        Mesa mesa = mesaData.obtenerMesa(rs.getInt("numMesa"));
        pedido.setMesa(mesa);

        Mesero mesero = meseroData.obtenerMesero(rs.getInt("idMesero"));
        pedido.setMesero(mesero);

        pedido.setPagado(rs.getBoolean("pagado"));

        pedido.setFecha(rs.getDate("fecha").toLocalDate());

        pedido.setHora(rs.getTime("hora").toLocalTime());

        pedido.setActivo(rs.getBoolean("activo"));
        
        pedidos.add(pedido);
      }

      ps.close();

    } catch (SQLException exc) {
      JOptionPane.showMessageDialog(null, "No se pudo obtener pedidos " + exc);
    }

    return pedidos;
  }

  public double obtenerSubtotalDelPedido(int id) {
    double total = 0;

    String sql
            = "SELECT producto.precio, detalle.cantidad "
            + "FROM producto "
            + "INNER JOIN detalle ON detalle.codigoProducto = producto.codigo "
            + "WHERE detalle.idPedido = ?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      
      ps.setInt(1, id);

      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        total += (rs.getFloat("precio") * rs.getInt("cantidad"));
      }

      ps.close();

    } catch (SQLException exc) {
      JOptionPane.showMessageDialog(null, "No se pudo obtener pedidos " + exc);
    }

    return total;
  }

  public boolean cobrarPedido(int id) {
    boolean cobrado = false;

    String sql = "UPDATE pedido SET pagado = 1 WHERE idPedido = ?";

    try {

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, id);

      if (ps.executeUpdate() != 0) {
        cobrado = true;
        JOptionPane.showMessageDialog(null, "El pedido fue cobrado con exito");
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al cobrar pedido " + ex);
    }

    return cobrado;
  }
}
