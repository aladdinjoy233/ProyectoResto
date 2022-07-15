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

  public ArrayList<Pedido> obtenerPedidosInActivos() {
    ArrayList<Pedido> pedidos = new ArrayList<>();

    String sql = "SELECT * FROM pedido WHERE activo = 0";

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
            + "WHERE detalle.idPedido = ? AND detalle.activo = 1 ";

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

  public boolean agregarPedido(Pedido pedido) {
    boolean agregado = false;

    String sql = "INSERT INTO pedido(numMesa, idMesero, pagado, fecha, hora, activo) VALUES (?, ?, ?, ?, ?, ?);";

    try {
      PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

      ps.setInt(1, pedido.getMesa().getNumMesa());
      ps.setInt(2, pedido.getMesero().getIdMesero());
      ps.setBoolean(3, pedido.isPagado());
      ps.setDate(4, Date.valueOf(pedido.getFecha()));
      ps.setTime(5, Time.valueOf(pedido.getHora()));
      ps.setBoolean(6, pedido.isActivo());

      ps.executeUpdate();
      ResultSet rs = ps.getGeneratedKeys();

      if (rs.next()) {
        pedido.setIdPedido(rs.getInt("idPedido"));
        agregado = true;
      }

      ps.close();

    } catch (SQLException e) {
      agregado = false;
      JOptionPane.showMessageDialog(null, "Error al agregar pedido " + e);
    }

    return agregado;
  }

  public boolean modificarPedido(Pedido pedido) {
    boolean modificado = false;

    String sql = "UPDATE pedido SET numMesa = ?, idMesero = ?, pagado = ?, fecha = ?, hora = ?, activo = ? WHERE idPedido = ?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, pedido.getMesa().getNumMesa());
      ps.setInt(2, pedido.getMesero().getIdMesero());
      ps.setBoolean(3, pedido.isPagado());
      ps.setDate(4, Date.valueOf(pedido.getFecha()));
      ps.setTime(5, Time.valueOf(pedido.getHora()));
      ps.setBoolean(6, pedido.isActivo());
      ps.setInt(7, pedido.getIdPedido());

      if (ps.executeUpdate() != 0) {
        modificado = true;
      }

      ps.close();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al modificar pedido " + e);
    }

    return modificado;
  }
}
