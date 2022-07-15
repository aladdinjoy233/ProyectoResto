package resto.main;

import java.time.LocalDate;
import java.time.LocalTime;
import resto.dao.*;
import resto.entidades.Mesa;
import resto.entidades.*;
import java.util.*;

public class GrupoMain {

  public static void main(String[] args) {

    Conexion c = new Conexion();
    DetalleData detalleData = new DetalleData(c);
    MesaData mesaData = new MesaData(c);
    MeseroData meseroData = new MeseroData(c);
    PedidoData pedidoData = new PedidoData(c);
    ProductoData productoData = new ProductoData(c);
    ReservaData reservaData = new ReservaData(c);

  }

}
