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

        //~~~~~~~~~~ crear reserva ~~~~~~~~~~~-//
        Mesa mesa = new Mesa(2, true, true);
        Reserva res = new Reserva(mesa, "valentin", Long.parseLong("44207512"), LocalDate.parse("2022-07-28"), LocalTime.parse("13:00"), true);
        //si no hay error la agrega
        rd.agregarReserva(res);
        System.out.println("Existe: " + rd.existeReserva(res));
        int idReserva = rd.obtenerId(res);
        //la desactivo
        rd.desactivarReserva(idReserva);
        //la activo y le cambio el dni
        Reserva resActualizada = new Reserva(idReserva, mesa, "valentin", Long.parseLong("12345678"), LocalDate.parse("2022-07-28"), LocalTime.parse("13:00"), true);
        rd.modificarReserva(resActualizada);
        //obtengo una reserva mediante el id
        Reserva reserva = rd.obtenerReserva(idReserva);
        //obtengo un array de reservas activas
        ArrayList<Reserva> misReservasActivas = rd.obtenerReservas();
        //obtengo un array de reservas inactivas
        ArrayList<Reserva> misReservasInactivas = rd.obtenerReservasInactivas();

    }

}
