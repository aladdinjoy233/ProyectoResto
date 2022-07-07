package resto.main;

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
        Mesa mesa = new Mesa(1,2, true, true);        

Reserva res = new Reserva(mesa, "valeria", Long.parseLong("33333333"), LocalDate.parse("2025-02-04"), LocalTime.parse("13:00"), true);
        System.out.println(res.toString());
        
        rd.agregarReserva(res);
       */ 
    }

}
