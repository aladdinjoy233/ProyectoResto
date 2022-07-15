package resto.entidades;

import java.util.Objects;

public class Mesero {

    //atributos
    private int idMesero;
    private String nombre;
    private String apellido;
    private long dni;
    private long telefono;
    private boolean activo;

    //constructores

    public Mesero() {
    }

    public Mesero(int idMesero, String nombre, String apellido, long dni, long telefono, boolean activo) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Mesero(String nombre, String apellido, long dni, long telefono, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
   

    //metodos

    @Override
    public String toString() {
        return  nombre + " " + apellido;
//                + "\nID: " + idMesero
//                + "\nDNI: " + dni
//                + "\nTelefono: " + telefono
//                + "\nEstado: " + (activo ? "activo\n" : "no activo\n")
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.dni);
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
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    
    
        
}
