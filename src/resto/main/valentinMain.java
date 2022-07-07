package resto.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.util.converter.LocalDateTimeStringConverter;
import resto.dao.*;
import resto.entidades.*;

public class valentinMain {

    public static void main(String[] args) {

        Conexion con = new Conexion();
        ReservaData rd = new ReservaData(con);

        // LocalDateTime time = LocalDateTime.parse("11:00");
        Reserva reser = new Reserva("valentin", Long.parseLong("44207512"), 
                                    LocalDate.parse("2022-07-06"), LocalDateTime.parse("11:00"), true);
        
        rd.agregarReserva(reser);
    }

}
