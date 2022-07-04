package resto.entidades;

import java.time.*;

public class Pedido {
    private int idPedido;
    private Producto producto;
    private Mesa mesa;
    private Mesero mesero;
    private boolean pagado;
    private LocalDate fecha;
    private LocalTime hora;

    public Pedido() {
    }

    public Pedido(Producto producto, Mesa mesa, Mesero mesero, boolean pagado, LocalDate fecha, LocalTime hora) {
        this.producto = producto;
        this.mesa = mesa;
        this.mesero = mesero;
        this.pagado = pagado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Pedido(int idPedido, Producto producto, Mesa mesa, Mesero mesero, boolean pagado, LocalDate fecha, LocalTime hora) {
        this.idPedido = idPedido;
        this.producto = producto;
        this.mesa = mesa;
        this.mesero = mesero;
        this.pagado = pagado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", producto=" + producto + ", mesa=" + mesa + ", mesero=" + mesero + ", pagado=" + pagado + ", fecha=" + fecha + ", hora=" + hora + '}';
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
