package resto.vistas;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import resto.dao.*;
import resto.entidades.*;

public class DetallePedido extends javax.swing.JPanel {

  private Conexion con;
  private Pedido pedido;
  private PedidoData pedidoData;
  private DetalleData detalleData;
  private DefaultTableModel model;

  public DetallePedido(Conexion con, Pedido pedido) {
    initComponents();

    this.con = con;
    detalleData = new DetalleData(con);
    pedidoData = new PedidoData(con);
    
    tablaDetalles.arreglarTabla(jScrollPane1);

    model = (DefaultTableModel) tablaDetalles.getModel();

    this.pedido = pedido;

    cargarDatos();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    btnVolver = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaDetalles = new resto.componentes.TablaPersonalizada();
    mostrarSubtotal = new javax.swing.JPanel();
    precioTotal = new javax.swing.JLabel();
    subtotalLabel = new javax.swing.JLabel();
    lblNumMesa = new javax.swing.JLabel();
    numMesa = new javax.swing.JLabel();
    lblID = new javax.swing.JLabel();
    pedidoID = new javax.swing.JLabel();
    lblCobrado = new javax.swing.JLabel();
    isCobrado = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    lblTitulo.setBackground(new java.awt.Color(114, 63, 50));
    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
    lblTitulo.setForeground(new java.awt.Color(114, 63, 50));
    lblTitulo.setText("Ver detalle del pedido");

    btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
    btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnVolverMousePressed(evt);
      }
    });

    tablaDetalles.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Producto", "Precio c/u", "Cantidad", "Precio Total"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tablaDetalles);

    mostrarSubtotal.setBackground(new java.awt.Color(225, 225, 225));

    precioTotal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    precioTotal.setForeground(new java.awt.Color(114, 63, 50));
    precioTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    precioTotal.setText("$0.00");
    precioTotal.setToolTipText("Subtotal calculado en el momento del cobro");

    javax.swing.GroupLayout mostrarSubtotalLayout = new javax.swing.GroupLayout(mostrarSubtotal);
    mostrarSubtotal.setLayout(mostrarSubtotalLayout);
    mostrarSubtotalLayout.setHorizontalGroup(
      mostrarSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(precioTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
    );
    mostrarSubtotalLayout.setVerticalGroup(
      mostrarSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(precioTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
    );

    subtotalLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    subtotalLabel.setForeground(new java.awt.Color(114, 63, 50));
    subtotalLabel.setText("Subtotal: ");

    lblNumMesa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblNumMesa.setForeground(new java.awt.Color(114, 63, 50));
    lblNumMesa.setText("Numero de la mesa: ");

    numMesa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    numMesa.setForeground(new java.awt.Color(114, 63, 50));
    numMesa.setText("1");

    lblID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblID.setForeground(new java.awt.Color(114, 63, 50));
    lblID.setText("ID del pedido: ");

    pedidoID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    pedidoID.setForeground(new java.awt.Color(114, 63, 50));
    pedidoID.setText("1");

    lblCobrado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblCobrado.setForeground(new java.awt.Color(114, 63, 50));
    lblCobrado.setText("Esta cobrado?");

    isCobrado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    isCobrado.setForeground(new java.awt.Color(114, 63, 50));
    isCobrado.setText("Oui");

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
              .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(bgLayout.createSequentialGroup()
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(lblID)
                        .addGap(9, 9, 9)
                        .addComponent(pedidoID))
                      .addComponent(lblNumMesa))
                    .addGap(8, 8, 8)
                    .addComponent(numMesa))
                  .addGroup(bgLayout.createSequentialGroup()
                    .addComponent(lblCobrado)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(isCobrado)))
                .addGap(57, 57, 57)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(bgLayout.createSequentialGroup()
                    .addGap(340, 340, 340)
                    .addComponent(mostrarSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(bgLayout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(subtotalLabel))))
              .addComponent(lblTitulo))))
        .addGap(50, 50, 50))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(btnVolver)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblTitulo)
        .addGap(45, 45, 45)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(210, 210, 210)
            .addComponent(mostrarSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(bgLayout.createSequentialGroup()
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblID)
                  .addComponent(pedidoID))
                .addGap(11, 11, 11)
                .addComponent(lblNumMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(lblCobrado)
                  .addComponent(isCobrado)))
              .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(numMesa)))
            .addGap(130, 130, 130)
            .addComponent(subtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

  public void cargarDatos() {
    
    NumberFormat decimalFormatter = new DecimalFormat("#0.00");
    ArrayList<DetalleDelPedido> detalles = detalleData.obtenerDetallesDePedido(pedido.getIdPedido());

    detalles.forEach(detalle -> {
      double precio = detalle.getProducto().getPrecio();
      int cantidad = detalle.getCantidad();
      
      model.addRow(new Object[] {
        detalle.getProducto().getNombre(),
        "$" + decimalFormatter.format(precio),
        cantidad,
        "$" + decimalFormatter.format(precio * cantidad)
      });
    });
    
    double subtotal;

    if (pedido.isPagado()) {
      subtotal = pedido.getSubtotal();
    } else {
      subtotal = pedidoData.obtenerSubtotalDelPedido(pedido.getIdPedido());
    }
    
    precioTotal.setText("$" + decimalFormatter.format(subtotal));
    
    pedidoID.setText("" + pedido.getIdPedido());
    numMesa.setText("" + pedido.getMesa().getNumMesa());
    
    isCobrado.setText(pedido.isPagado() ? "Si" : "No");
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JLabel btnVolver;
  private javax.swing.JLabel isCobrado;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblCobrado;
  private javax.swing.JLabel lblID;
  private javax.swing.JLabel lblNumMesa;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JPanel mostrarSubtotal;
  private javax.swing.JLabel numMesa;
  private javax.swing.JLabel pedidoID;
  private javax.swing.JLabel precioTotal;
  private javax.swing.JLabel subtotalLabel;
  private resto.componentes.TablaPersonalizada tablaDetalles;
  // End of variables declaration//GEN-END:variables
}
