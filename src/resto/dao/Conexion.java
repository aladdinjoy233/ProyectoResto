package resto.dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
  
  private String url = "jdbc:mysql://localhost/resto";
  private String usuario = "root";
  private String password = "";

  private Connection conexion;

  public Conexion() {

    try {
      Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException exc) {
      JOptionPane.showMessageDialog(null, "Error al cargar driver");
    }

  }

  public Connection getConexion() {

    try {
      if (conexion == null) {
        // Setup the connection with the DB
        conexion = DriverManager
                .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + usuario + "&password=" + password);
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
    }

    return conexion;
  }
}
