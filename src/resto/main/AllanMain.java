package resto.main;

import resto.dao.*;
import resto.entidades.*;

public class AllanMain {

  public static void main(String[] args) {

    Conexion con = new Conexion();
    PedidoData pd = new PedidoData(con);
    DetalleData dd = new DetalleData(con);

    DetalleDelPedido detalle = dd.obtenerDetalle(1);

    detalle.setCantidad(6);

    dd.modificarDetalle(detalle);

  }

}
