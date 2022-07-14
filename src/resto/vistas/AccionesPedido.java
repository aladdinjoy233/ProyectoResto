package resto.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resto.dao.*;
import resto.entidades.*;

public class AccionesPedido extends javax.swing.JPanel {

  NumberFormat decimalFormatter = new DecimalFormat("#0.00");

  private Conexion con;
  private ProductoData productoData;
  private DetalleData detalleData;
  private DefaultTableModel modelSeleccionar;
  private DefaultTableModel modelAgregados;
  ArrayList<Producto> productosDisponibles;
  ArrayList<DetalleDelPedido> productosAgregados;

  public AccionesPedido(Conexion con, Pedido pedido) {
    initComponents();

    tablaSeleccionarProducto.arreglarTabla(jScrollPane1);
    tablaPedidosAgregados.arreglarTabla(jScrollPane2);

    modelSeleccionar = (DefaultTableModel) tablaSeleccionarProducto.getModel();
    modelAgregados = (DefaultTableModel) tablaPedidosAgregados.getModel();

    this.con = con;
    productoData = new ProductoData(con);
    detalleData = new DetalleData(con);

    if (pedido == null) {
      productosAgregados = new ArrayList<DetalleDelPedido>();
    } else {
      productosAgregados = detalleData.obtenerDetallesDePedido(pedido.getIdPedido());
    }

    productosDisponibles = productoData.obtenerProductos(true);

    cargarDatos();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    btnVolver = new javax.swing.JLabel();
    lblTitulo = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaSeleccionarProducto = new resto.componentes.TablaPersonalizada();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaPedidosAgregados = new resto.componentes.TablaPersonalizada();
    btnAgregarProducto = new javax.swing.JPanel();
    lblAgregar = new javax.swing.JLabel();
    btnSacarProducto = new javax.swing.JPanel();
    lblSacar = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
    btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnVolverMousePressed(evt);
      }
    });

    lblTitulo.setBackground(new java.awt.Color(114, 63, 50));
    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
    lblTitulo.setForeground(new java.awt.Color(114, 63, 50));
    lblTitulo.setText("Crear pedido");

    tablaSeleccionarProducto.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Producto", "Categoria", "Stock", "Precio"
      }
    ));
    jScrollPane1.setViewportView(tablaSeleccionarProducto);

    tablaPedidosAgregados.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Producto", "Cantidad"
      }
    ));
    jScrollPane2.setViewportView(tablaPedidosAgregados);

    btnAgregarProducto.setBackground(new java.awt.Color(241, 207, 178));
    btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnAgregarProductoMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnAgregarProductoMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnAgregarProductoMousePressed(evt);
      }
    });

    lblAgregar.setForeground(new java.awt.Color(114, 63, 50));
    lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblAgregar.setText("Agregar producto");

    javax.swing.GroupLayout btnAgregarProductoLayout = new javax.swing.GroupLayout(btnAgregarProducto);
    btnAgregarProducto.setLayout(btnAgregarProductoLayout);
    btnAgregarProductoLayout.setHorizontalGroup(
      btnAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
    );
    btnAgregarProductoLayout.setVerticalGroup(
      btnAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
    );

    btnSacarProducto.setBackground(new java.awt.Color(241, 207, 178));
    btnSacarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnSacarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnSacarProductoMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnSacarProductoMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnSacarProductoMousePressed(evt);
      }
    });

    lblSacar.setForeground(new java.awt.Color(114, 63, 50));
    lblSacar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblSacar.setText("Sacar producto");

    javax.swing.GroupLayout btnSacarProductoLayout = new javax.swing.GroupLayout(btnSacarProducto);
    btnSacarProducto.setLayout(btnSacarProductoLayout);
    btnSacarProductoLayout.setHorizontalGroup(
      btnSacarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
    );
    btnSacarProductoLayout.setVerticalGroup(
      btnSacarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
    bg.setLayout(bgLayout);
    bgLayout.setHorizontalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(btnVolver))
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblTitulo)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnSacarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(272, 272, Short.MAX_VALUE))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(btnVolver)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblTitulo)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSacarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(60, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
    PedidosVista pv = new PedidosVista(con);
    pv.setSize(780, 530);
    pv.setLocation(0, 0);

    bg.removeAll();
    bg.add(pv, BorderLayout.CENTER);
    bg.revalidate();
    bg.repaint();
  }//GEN-LAST:event_btnVolverMousePressed

  private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
    btnAgregarProducto.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnAgregarProductoMouseEntered

  private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
    btnAgregarProducto.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnAgregarProductoMouseExited

  private void btnSacarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarProductoMouseEntered
    btnSacarProducto.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnSacarProductoMouseEntered

  private void btnSacarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarProductoMouseExited
    btnSacarProducto.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnSacarProductoMouseExited

  private void btnAgregarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMousePressed
    if (tablaSeleccionarProducto.getSelectedRows().length != 1) {
      return;
    }
    
    int filaSeleccionada = tablaSeleccionarProducto.getSelectedRow();
    Producto productoSeleccionado = productosDisponibles.get(filaSeleccionada);
    int stock = productoSeleccionado.getStock();
    
    if (stock <= 0) {
      JOptionPane.showMessageDialog(this, "No hay mas stock");
      rerenderTables();
      return;
    }

    productosDisponibles.get(tablaSeleccionarProducto.getSelectedRow()).setStock(stock - 1);

//    Checkear si el producto esta en la lista de productos agregados
    boolean existe = false;
    int indice = 0;
    int cantidad = 0;
    for (DetalleDelPedido detalle : productosAgregados) {
      if (detalle.getProducto().equals(productoSeleccionado)) {
        existe = true;
        cantidad = detalle.getCantidad();
        break;
      }
      indice++;
    }
    
    if (existe) {
      productosAgregados.get(indice).setCantidad(cantidad + 1);
    } else {
      DetalleDelPedido detalle = new DetalleDelPedido(productoSeleccionado, null, 1, true);
      productosAgregados.add(detalle);
    }
    
    rerenderTables();
    tablaSeleccionarProducto.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
  }//GEN-LAST:event_btnAgregarProductoMousePressed

  private void btnSacarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarProductoMousePressed
    if (tablaPedidosAgregados.getSelectedRows().length != 1) {
      return;
    }

    int filaSeleccionada = tablaPedidosAgregados.getSelectedRow();
    DetalleDelPedido detalleSeleccionado = productosAgregados.get(filaSeleccionada);
    int cantidad = detalleSeleccionado.getCantidad();
    
    if (cantidad == 1) {
      productosAgregados.remove(filaSeleccionada);
    } else {
      productosAgregados.get(filaSeleccionada).setCantidad(cantidad - 1);
    }
    
    int indiceProducto = 0;
    int stock = 0;
    for (Producto productoDisponible : productosDisponibles) {
      if (productoDisponible.equals(detalleSeleccionado.getProducto())) {
        stock = productoDisponible.getStock();
        break;
      }
      indiceProducto++;
    }

    productosDisponibles.get(indiceProducto).setStock(stock + 1);

    rerenderTables();
    if (cantidad != 1) {
      tablaPedidosAgregados.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);    
    }
  }//GEN-LAST:event_btnSacarProductoMousePressed

  public void cargarDatos() {

    Collections.sort(productosDisponibles, new Comparator<Producto>() {
      @Override
      public int compare(Producto t, Producto t1) {
        return t.getNombre().compareToIgnoreCase(t1.getNombre());
      }
    });

    rerenderTables();
  }

  public void rerenderTables() {
    modelSeleccionar.setRowCount(0);
    modelAgregados.setRowCount(0);
    
    productosDisponibles.forEach(producto -> {
      modelSeleccionar.addRow(new Object[]{
        producto.getNombre(),
        producto.isComestible() ? "Comida" : "Bebida",
        producto.getStock(),
        "$" + decimalFormatter.format(producto.getPrecio())
      });
    });
    
    productosAgregados.forEach(detalle -> {
      modelAgregados.addRow(new Object[]{
        detalle.getProducto().getNombre(),
        detalle.getCantidad()
      });
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JPanel btnAgregarProducto;
  private javax.swing.JPanel btnSacarProducto;
  private javax.swing.JLabel btnVolver;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel lblAgregar;
  private javax.swing.JLabel lblSacar;
  private javax.swing.JLabel lblTitulo;
  private resto.componentes.TablaPersonalizada tablaPedidosAgregados;
  private resto.componentes.TablaPersonalizada tablaSeleccionarProducto;
  // End of variables declaration//GEN-END:variables
}
