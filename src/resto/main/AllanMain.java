package resto.main;

import resto.dao.*;

public class AllanMain {

  public static void main(String[] args) {

    Conexion con = new Conexion();
    PedidoData pd = new PedidoData(con);
    DetalleData dd = new DetalleData(con);

    System.out.println(dd.obtenerDetallesDePedido(1));

  }

}
