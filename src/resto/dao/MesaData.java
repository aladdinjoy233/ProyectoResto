package resto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import resto.entidades.Mesa;
import resto.entidades.Mesero;

/**
 *
 * @author edder
 */
public class MesaData {

  //Atributos
  private Connection coneccion = null;
  private MeseroData meseroData;

  //Constructor
  public MesaData(Conexion coneccion) {
    this.coneccion = coneccion.getConexion();
    meseroData = new MeseroData(coneccion);
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

  public boolean crearMesaVista(Mesa mesa) {
    boolean result = true;

    String sql = "Insert Into mesa(capacidad, estado, activo) VALUES (?,?,?)";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

      ps.setInt(1, mesa.getCapacidad());
      ps.setBoolean(2, mesa.isEstado());
      ps.setBoolean(3, mesa.isActivo());

      ps.executeUpdate();
      ResultSet rs = ps.getGeneratedKeys();

      if (rs.next()) {
        mesa.setNumMesa(rs.getInt(1));
        JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " se Creo Correctamente. ");
      } else {
        result = false;
      }

      ps.close();

    } catch (SQLException ex) {
      result = false;
      JOptionPane.showMessageDialog(null, "Error al crear la Mesa. " + ex);
    }

    return result;
  }
  
  public boolean crearMesa(Mesa mesa) {
    boolean result = true;

    String sql = "Insert Into mesa(IdMesero, capacidad, estado, activo) VALUES (?,?,?,?)";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

      ps.setInt(1, mesa.getMesero().getIdMesero());
      ps.setInt(1, mesa.getCapacidad());
      ps.setBoolean(2, mesa.isEstado());
      ps.setBoolean(3, mesa.isActivo());

      ps.executeUpdate();
      ResultSet rs = ps.getGeneratedKeys();

      if (rs.next()) {
        mesa.setNumMesa(rs.getInt(1));
        JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " se Creo Correctamente. ");
      } else {
        result = false;
      }

      ps.close();

    } catch (SQLException ex) {
      result = false;
      JOptionPane.showMessageDialog(null, "Error al crear la Mesa. " + ex);
    }

    return result;
  }

  public boolean modificarMesa(Mesa mesa) {
    boolean result = false;
    if (!(buscarMesa(mesa.getNumMesa()))) {
      JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " no existe");
      return false;
    }

    String sql = "UPDATE mesa SET idMesero = ?, capacidad = ?, estado = ?, activo = ?  WHERE numMesa = ?";
    try {
      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, mesa.getMesero().getIdMesero());
      ps.setInt(2, mesa.getCapacidad());
      ps.setBoolean(3, mesa.isEstado());
      ps.setBoolean(4, mesa.isActivo());
      ps.setInt(5, mesa.getNumMesa());

      if (ps.executeUpdate() != 0) {
        result = true;
        JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " se Modifico Correctamente");
      }
      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al Modificar la Mesa.");
    }
    return result;
  }
  
  public boolean modificarMesaVista(Mesa mesa) {
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
      ps.setInt(4, mesa.getNumMesa());

      if (ps.executeUpdate() != 0) {
        result = true;
      }
      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al Modificar la Mesa.");
    }
    return result;
  }

  public boolean borrarMesa(Mesa mesa) {
    boolean result = false;
    if (!(buscarMesa(mesa.getNumMesa()))) {
      JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " no existe");
      return false;
    }

    String sql = "UPDATE mesa SET activo = 0 WHERE numMesa = ?";
    try {

      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, mesa.getNumMesa());

      if (ps.executeUpdate() != 0) {
        result = true;
        JOptionPane.showMessageDialog(null, "La Mesa se a Borrado. ");
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener una Mesa" + ex);
    }

    return result;
  }

  public boolean activarMesa(Mesa mesa) {
    boolean result = false;
    if (!(buscarMesa(mesa.getNumMesa()))) {
      JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " no existe");
      return false;
    }

    String sql = "UPDATE mesa SET activo = 1 WHERE numMesa = ?";
    try {

      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, mesa.getNumMesa());

      if (ps.executeUpdate() != 0) {
        result = true;
        JOptionPane.showMessageDialog(null, "La Mesa se a Reestablecido. ");
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener una Mesa" + ex);
    }

    return result;
  }

  public Mesa obtenerMesa(int numMesa) {
    Mesa mesa = new Mesa();

    String sql = "SELECT * FROM mesa WHERE numMesa = ?;";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, numMesa);

      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        Mesero mesero = meseroData.obtenerMesero(rs.getInt("idMesero"));
        mesa.setMesero(mesero);
        mesa.setNumMesa(rs.getInt("numMesa"));
        mesa.setCapacidad(rs.getInt("capacidad"));
        mesa.setEstado(rs.getBoolean("estado"));
        mesa.setActivo(rs.getBoolean("activo"));

      } else {
        JOptionPane.showMessageDialog(null, "La Mesa " + numMesa + " no existe.");
      }

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener la Mesa " + ex);
    }

    return mesa;
  }

  public ArrayList<Mesa> listadoMesasActivas() {
    ArrayList<Mesa> mesas = new ArrayList();
    String sql = "SELECT * FROM mesa WHERE activo = 1;";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql);

      ResultSet rs = ps.executeQuery();
      Mesa mesa;

      if (!rs.next()) {
        JOptionPane.showMessageDialog(null, "No hay Mesas Activas");
        ps.close();
        return mesas;
      }

      rs.previous();

      while (rs.next()) {
        mesa = new Mesa();

        Mesero mesero = meseroData.obtenerMesero(rs.getInt("idMesero"));
        mesa.setMesero(mesero);

        mesa.setNumMesa(rs.getInt("numMesa"));
        mesa.setCapacidad(rs.getInt("capacidad"));
        mesa.setEstado(rs.getBoolean("estado"));
        mesa.setActivo(rs.getBoolean("activo"));

        mesas.add(mesa);
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener las Mesas " + ex);
    }

    return mesas;
  }

  public ArrayList<Mesa> listadoMesasInactivas() {
    ArrayList<Mesa> mesas = new ArrayList();
    String sql = "SELECT * FROM mesa WHERE activo = 0;";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql);

      ResultSet rs = ps.executeQuery();
      Mesa mesa;

      if (!rs.next()) {
        JOptionPane.showMessageDialog(null, "No hay Mesas Inactivas");
        ps.close();
        return mesas;
      }

      rs.previous();

      while (rs.next()) {
        mesa = new Mesa();

        Mesero mesero = meseroData.obtenerMesero(rs.getInt("idMesero"));
        mesa.setMesero(mesero);

        mesa.setNumMesa(rs.getInt("numMesa"));
        mesa.setCapacidad(rs.getInt("capacidad"));
        mesa.setEstado(rs.getBoolean("estado"));
        mesa.setActivo(rs.getBoolean("activo"));

        mesas.add(mesa);
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener las Mesas " + ex);
    }

    return mesas;
  }

  public ArrayList<Mesa> buscarMesaXcapacidad(int capacidad) {
    ArrayList<Mesa> mesas = new ArrayList();

    String sql = "SELECT * FROM mesa WHERE capacidad >= ?;";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, capacidad);

      ResultSet rs = ps.executeQuery();
      Mesa mesa;

      if (!rs.next()) {
        JOptionPane.showMessageDialog(null, "No hay Mesas en la base de datos");
        ps.close();
        return mesas;
      }

      rs.previous();

      while (rs.next()) {
        mesa = new Mesa();

        Mesero mesero = meseroData.obtenerMesero(rs.getInt("idMesero"));
        mesa.setMesero(mesero);

        mesa.setNumMesa(rs.getInt("numMesa"));
        mesa.setCapacidad(rs.getInt("capacidad"));
        mesa.setEstado(rs.getBoolean("estado"));
        mesa.setActivo(rs.getBoolean("activo"));

        mesas.add(mesa);
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al consultar las Mesas" + ex);
    }

    return mesas;
  }

//  Metodos para la vista de mesero
  public ArrayList<Mesa> obtenerMesasSinMesero() {
    ArrayList<Mesa> mesas = new ArrayList<>();

    String sql = "SELECT * FROM mesa WHERE idMesero is NULL AND activo = 1";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql);

      ResultSet rs = ps.executeQuery();
      Mesa mesa;

      if (!rs.next()) {
        ps.close();
        return mesas;
      }

      rs.previous();

      while (rs.next()) {
        mesa = new Mesa();

        Mesero meseroBD = meseroData.obtenerMesero(rs.getInt("idMesero"));
        mesa.setMesero(meseroBD);

        mesa.setNumMesa(rs.getInt("numMesa"));
        mesa.setCapacidad(rs.getInt("capacidad"));
        mesa.setEstado(rs.getBoolean("estado"));
        mesa.setActivo(rs.getBoolean("activo"));

        mesas.add(mesa);
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al consultar las Mesas" + ex);
    }

    return mesas;
  }
  
    

  public ArrayList<Mesa> obtenerMesasDelMesero(Mesero mesero) {
    ArrayList<Mesa> mesas = new ArrayList<>();

    String sql = "SELECT * FROM mesa WHERE idMesero = ? AND activo = 1";

    try {
      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, mesero.getIdMesero());

      ResultSet rs = ps.executeQuery();
      Mesa mesa;

      if (!rs.next()) {
        ps.close();
        return mesas;
      }

      rs.previous();

      while (rs.next()) {
        mesa = new Mesa();

        Mesero meseroBD = meseroData.obtenerMesero(rs.getInt("idMesero"));
        mesa.setMesero(meseroBD);

        mesa.setNumMesa(rs.getInt("numMesa"));
        mesa.setCapacidad(rs.getInt("capacidad"));
        mesa.setEstado(rs.getBoolean("estado"));
        mesa.setActivo(rs.getBoolean("activo"));

        mesas.add(mesa);
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al consultar las Mesas" + ex);
    }

    return mesas;
  }

  public boolean sacarMesero(Mesa m){
        boolean meseroSacado = false;
        
        try{
            String sql = "UPDATE mesa SET idMesero = NULL WHERE mesa.numMesa = ?;";
            
            PreparedStatement ps = coneccion.prepareStatement(sql);
            ps.setInt(1, m.getNumMesa());
            
            if(ps.executeUpdate() != 0){
                meseroSacado = true;
                JOptionPane.showMessageDialog(null, "Mesero eliminado de la mesa " + m.getNumMesa());
            }
            
            ps.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al consultar las Mesas " + e);
        }
        
        return meseroSacado;
  }
  
  public boolean agregarMesero(Mesa m, Mesero me){
      boolean meseroAgregado = false;
      
      try{
          String sql = "UPDATE mesa SET idMesero = ? WHERE mesa.numMesa = ?;";
          
          PreparedStatement ps = coneccion.prepareStatement(sql);
          ps.setInt(1, me.getIdMesero());
          ps.setInt(2, m.getNumMesa());
          
          if(ps.executeUpdate() != 0){
              meseroAgregado = true;
              JOptionPane.showMessageDialog(null, "Mesero agregado exitosamente a la mesa " + m.getNumMesa());
          }
          
          ps.close();
          
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Error al consultar las Mesas " + e);
      }
      
      return meseroAgregado;
  }
 
  public boolean ocuparMesa(Mesa mesa) {
    boolean result = false;
    if (!(buscarMesa(mesa.getNumMesa()))) {
      JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " no existe");
      return false;
    }

    String sql = "UPDATE mesa SET estado = 1 WHERE numMesa = ?";
    try {

      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, mesa.getNumMesa());

      if (ps.executeUpdate() != 0) {
        result = true;
        JOptionPane.showMessageDialog(null, "La Mesa se a Ocupado. ");
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener una Mesa" + ex);
    }

    return result;
  }
  
  public boolean desocuparMesa(Mesa mesa) {
    boolean result = false;
    if (!(buscarMesa(mesa.getNumMesa()))) {
      JOptionPane.showMessageDialog(null, "La Mesa N° " + mesa.getNumMesa() + " no existe");
      return false;
    }

    String sql = "UPDATE mesa SET estado = 0 WHERE numMesa = ?";
    try {

      PreparedStatement ps = coneccion.prepareStatement(sql);

      ps.setInt(1, mesa.getNumMesa());

      if (ps.executeUpdate() != 0) {
        result = true;
        JOptionPane.showMessageDialog(null, "La Mesa se a Desocupado. ");
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener una Mesa" + ex);
    }

    return result;
  }
}
