package resto.main;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.util.converter.LocalDateTimeStringConverter;
import resto.dao.*;
import resto.entidades.*;

public class valentinMain {

    public static void main(String[] args) {

        Conexion con = new Conexion();
        ReservaData rd = new ReservaData(con);
 
        /*
        System.out.println("------------------- crear reserva -------------------------");     
        Mesa mesa = new Mesa(1,2, true, true);        
Reserva res = new Reserva(mesa, "jose", Long.parseLong("44444444"), LocalDate.parse("2022-07-10"), LocalTime.parse("13:00"), true);   
        rd.agregarReserva(res);
        */
        
        System.out.println("---------------------- todas las reservas ----------------------------");
        
        ArrayList<Reserva> reservas = rd.obtenerReservas();
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
        
        System.out.println("---------------------- una reserva sola ------------------------------");
       
        Reserva reserva = rd.obtenerReserva(28);
        System.out.println(reserva.toString());
        
        
        /*
        System.out.println("-------------------- dsactivar reserva -------------------------");
        rd.desactivarReserva(25);
        */
        
        
        /*
        System.out.println("------------------- modificar reserva -------------------------");

        Mesa mesa = new Mesa(2,3, true, true);
Reserva reserva2 = new Reserva(24,mesa, "allan", Long.parseLong("11112222"), LocalDate.parse("2202-02-04"), LocalTime.parse("13:00"), true); 
        rd.modificarReserva(reserva2);
        */
  
        
        /*
        System.out.println("---------------------- ¿existe reserva? ----------------------");
         Mesa mesa = new Mesa(2,3, true, true);
Reserva reserva2 = new Reserva(24,mesa, "allan", Long.parseLong("11112222"), LocalDate.parse("2202-02-04"), LocalTime.parse("13:00"), true); 
        System.out.println(rd.existeReserva(reserva2));
        */
        
        
        /*
        System.out.println("----------------------- borrar reserva --------------------------");
        rd.borrarReserva(29);
        */
        
        
    }

}
