package resto.entidades;

import java.text.*;

public class Producto {
//  Atributos
  private int codigo;
  private String nombre;
  private int cantidad = 1;
  private double precio;
  private boolean comestible;

//  Constructor
  public Producto() {
  }

  public Producto(String nombre, double precio, boolean comestible) {
    this.nombre = nombre;
    this.precio = precio;
    this.comestible = comestible;
  }

  public Producto(int codigo, String nombre, double precio, boolean comestible) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
    this.comestible = comestible;
  }

  public Producto(String nombre, int cantidad, double precio, boolean comestible) {
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;
    this.comestible = comestible;
  }

  public Producto(int codigo, String nombre, int cantidad, double precio, boolean comestible) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;
    this.comestible = comestible;
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

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
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

//  Metodos
  @Override
  public String toString() {
    NumberFormat formatter = new DecimalFormat("#0.00");

    return "==Producto==\n"
            + "Nombre: " + nombre
            + "\nCantidad: " + cantidad
            + "\nPrecio: $" + formatter.format(precio)
            + "\nCategoria: " + (comestible ? "comestible" : "bebida");
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
