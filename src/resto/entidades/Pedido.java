package resto.entidades;

import java.time.*;

public class Pedido {
  //atributos

  private int idPedido;
  private Mesa mesa;
  private Mesero mesero;
  private boolean pagado;
  private Double subtotal;
  private LocalDate fecha;
  private LocalTime hora;
  private boolean activo;

  //constructores
  public Pedido() {
  }

  public Pedido(Mesa mesa, Mesero mesero, boolean pagado, LocalDate fecha, LocalTime hora, boolean activo) {
    this.mesa = mesa;
    this.mesero = mesero;
    this.pagado = pagado;
    this.fecha = fecha;
    this.hora = hora;
    this.activo = activo;
    subtotal = null;
  }

  public Pedido(int idPedido, Mesa mesa, Mesero mesero, boolean pagado, LocalDate fecha, LocalTime hora, boolean activo) {
    this.idPedido = idPedido;
    this.mesa = mesa;
    this.mesero = mesero;
    this.pagado = pagado;
    this.fecha = fecha;
    this.hora = hora;
    this.activo = activo;
    subtotal = null;
  }

  public int getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(int idPedido) {
    this.idPedido = idPedido;
  }

  public Mesa getMesa() {
    return mesa;
  }

  public void setMesa(Mesa mesa) {
    this.mesa = mesa;
  }

  public Mesero getMesero() {
    return mesero;
  }

  public void setMesero(Mesero mesero) {
    this.mesero = mesero;
  }

  public boolean isPagado() {
    return pagado;
  }

  public void setPagado(boolean pagado) {
    this.pagado = pagado;
  }

  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
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

  //metodos
  @Override
  public String toString() {
    return "Pedido " + idPedido + ", mesa " + mesa.getNumMesa() + ", mesero: " + mesero.getNombre() + " " + mesero.getApellido() + ", pagado: " + pagado + ", fecha: " + fecha + ", hora: " + hora + ", activo: " + activo;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 53 * hash + this.idPedido;
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
    final Pedido other = (Pedido) obj;
    if (this.idPedido != other.idPedido) {
      return false;
    }
    return true;
  }

}
