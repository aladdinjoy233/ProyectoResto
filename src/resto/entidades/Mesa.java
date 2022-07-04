package resto.entidades;

public class Mesa {
    private int numMesa;
    private Reserva reserva;
    private int capacidad;
    private boolean ocupado;
    private boolean atendido;
    private Mesero mesero;

    public Mesa() {
    }

    public Mesa(Reserva reserva, int capacidad, boolean ocupado, boolean atendido, Mesero mesero) {
        this.reserva = reserva;
        this.capacidad = capacidad;
        this.ocupado = ocupado;
        this.atendido = atendido;
        this.mesero = mesero;
    }

    public Mesa(int numMesa, Reserva reserva, int capacidad, boolean ocupado, boolean atendido, Mesero mesero) {
        this.numMesa = numMesa;
        this.reserva = reserva;
        this.capacidad = capacidad;
        this.ocupado = ocupado;
        this.atendido = atendido;
        this.mesero = mesero;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }
    
    
    
}

