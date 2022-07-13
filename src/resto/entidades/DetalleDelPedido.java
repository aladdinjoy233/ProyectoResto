package resto.entidades;

public class DetalleDelPedido {
    
    //atributos
    
    private int idDetalle;
    private Producto producto;
    private Pedido pedido;
    private int cantidad;
    private boolean activo;
    
    //constructores

    public DetalleDelPedido() {
    }

    public DetalleDelPedido(int idDetalle, Producto producto, Pedido pedido, int cantidad, boolean activo) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.activo = activo;
    }

    public DetalleDelPedido(Producto producto, Pedido pedido, int cantidad, boolean activo) {
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.activo = activo;
    }
    
    //gett and sett

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
      return "== Detalle Del Pedido == " + "\nProducto: " + producto.getNombre() + "\nCantidad: " + cantidad + "\nID del pedido: " + pedido.getIdPedido();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.idDetalle;
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
        final DetalleDelPedido other = (DetalleDelPedido) obj;
        if (this.idDetalle != other.idDetalle) {
            return false;
        }
        return true;
    }
    
    
    
}
