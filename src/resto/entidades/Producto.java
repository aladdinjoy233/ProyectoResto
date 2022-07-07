package resto.entidades;

import java.text.*;

public class Producto {
//  Atributos

    private int codigo;
    private String nombre;
    private int stock;
    private double precio;
    private boolean comestible;
    private boolean activo;

//  Constructor
    public Producto() {
    }

    public Producto(int codigo, String nombre, int stock, double precio, boolean comestible, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.comestible = comestible;
        this.activo = activo;
    }

    public Producto(String nombre, int stock, double precio, boolean comestible, boolean activo) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.comestible = comestible;
        this.activo = activo;
    }

//  Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

//  Metodos
    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.00");

        return "==Producto==\n"
                + "Nombre: " + nombre
                + "\nStock: " + stock
                + "\nPrecio: $" + formatter.format(precio)
                + "\nCategoria: " + (comestible ? "comestible" : "bebida\n");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.codigo;
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
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

}
