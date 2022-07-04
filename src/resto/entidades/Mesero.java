package resto.entidades;

import java.util.Objects;

public class Mesero {

    //atributos
    private int idMesero;
    private String nombre;
    
    //constructores
    public Mesero() {
    }
   
    public Mesero(int idMesero, String nombre) {
        this.idMesero = idMesero;
        this.nombre = nombre;
    }

    public Mesero(String nombre) {
        this.nombre = nombre;
    }
    
    //getters&setters
    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos

    @Override
    public String toString() {
        return nombre + " ID: " + idMesero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idMesero;
        hash = 59 * hash + Objects.hashCode(this.nombre);
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
        final Mesero other = (Mesero) obj;
        if (this.idMesero != other.idMesero) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
        
}
