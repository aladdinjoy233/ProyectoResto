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
        ReservaData rd = new ReservaData(c);
        MesaData md = new MesaData(c);


    }

}
