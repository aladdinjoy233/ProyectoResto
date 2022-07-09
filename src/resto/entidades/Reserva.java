package resto.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reserva {

    //atributos
    private int idReserva;
    private Mesa mesa;
    private String nombre;
    private Long dni;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean activo;

    //constructores
    public Reserva() {
    }


    public Reserva(Mesa mesa, String nombre, Long dni, LocalDate fecha, LocalTime hora, boolean activo) {
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.activo = activo;
    }

    public Reserva(int idReserva, Mesa mesa, String nombre, Long dni, LocalDate fecha, LocalTime hora, boolean activo) {
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.activo = activo;
    }
    
    //gett and sett

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
   
    
    
    // Metodos
    

    @Override
    public String toString() {
        return "Reserva{" + "Num mesa=" + mesa.getNumMesa() + ", nombre=" + nombre + ", dni=" + dni + ", fecha=" + fecha + ", hora=" + hora + ", activo=" + activo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.idReserva;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if (this.idReserva != other.idReserva) {
            return false;
        }
        return true;
    }

}
