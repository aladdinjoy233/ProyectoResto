package resto.entidades;

public class Mesa {

    //atributos
    private int numMesa;
    private int capacidad;
    private boolean estado;
    private boolean activo;

    //constructores
    public Mesa() {
    }

    public Mesa(int numMesa, int capacidad, boolean estado, boolean activo) {
        this.numMesa = numMesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.activo = activo;
    }

    public Mesa(int capacidad, boolean estado, boolean activo) {
        this.capacidad = capacidad;
        this.estado = estado;
        this.activo = activo;
    }

    //gett and sett
    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //metod
    @Override
    public String toString() {
        return "Num mesa: " + numMesa + ", Capacidad: " + capacidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Mesa other = (Mesa) obj;
        if (this.numMesa != other.numMesa) {
            return false;
        }
        return true;
    }

}
