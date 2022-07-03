package resto.entidades;

import java.time.LocalDate;

public class Reserva {

    //atributos
    private int idReserva;
    private String nombre;
    private Long dni;
    private LocalDate fecha;
    private int hora;
    private boolean vigente;

    //constructores
    public Reserva() {
    }

    public Reserva(String nombre, Long dni, LocalDate fecha, int hora, boolean vigente) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.vigente = vigente;
    }

    public Reserva(int idReserva, String nombre, Long dni, LocalDate fecha, int hora, boolean vigente) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.vigente = vigente;
    }

    //gett and sett
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    // Metodos
    @Override
    public String toString() {
        return nombre + ", " + dni + ", " + fecha + ", " + hora + ", vigente=" + vigente + '}';
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
