package resto.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import resto.dao.*;
import resto.entidades.Pedido;

public class PedidosVista extends javax.swing.JPanel {

  boolean quiereDesactivados = false;

  private Conexion con;
  private PedidoData pedData;
  private DefaultTableModel model;
  private ArrayList<Pedido> pedidos;

  public PedidosVista(Conexion con) {
    initComponents();

    this.con = con;

    pedData = new PedidoData(con);

    model = (DefaultTableModel) tablaPedidos.getModel();
    
    tablaPedidos.arreglarTabla(jScrollPane2);

    cargarDatos(quiereDesactivados);
    
    disableAll();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    btnAgregar = new javax.swing.JPanel();
    lblAgregar = new javax.swing.JLabel();
    btnModificar = new javax.swing.JPanel();
    lblModificar = new javax.swing.JLabel();
    btnDetalle = new javax.swing.JPanel();
    lblDetalle = new javax.swing.JLabel();
    btnCobrar = new javax.swing.JPanel();
    lblCobrar = new javax.swing.JLabel();
    checkboxInactivos = new resto.componentes.CheckboxPersonalizada();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaPedidos = new resto.componentes.TablaPersonalizada();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    lblTitulo.setBackground(new java.awt.Color(114, 63, 50));
    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
    lblTitulo.setForeground(new java.awt.Color(114, 63, 50));
    lblTitulo.setText("Manejar Pedidos");

    btnAgregar.setBackground(new java.awt.Color(241, 207, 178));
    btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnAgregarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnAgregarMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnAgregarMousePressed(evt);
      }
    });

    lblAgregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lblAgregar.setForeground(new java.awt.Color(114, 63, 50));
    lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblAgregar.setText("Agregar pedido");
    lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
    btnAgregar.setLayout(btnAgregarLayout);
    btnAgregarLayout.setHorizontalGroup(
      btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
    );
    btnAgregarLayout.setVerticalGroup(
      btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    btnModificar.setBackground(new java.awt.Color(241, 207, 178));
    btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnModificarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnModificarMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnModificarMousePressed(evt);
      }
    });

    lblModificar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lblModificar.setForeground(new java.awt.Color(114, 63, 50));
    lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblModificar.setText("Modificar");

    javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
    btnModificar.setLayout(btnModificarLayout);
    btnModificarLayout.setHorizontalGroup(
      btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
    );
    btnModificarLayout.setVerticalGroup(
      btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    btnDetalle.setBackground(new java.awt.Color(241, 207, 178));
    btnDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnDetalleMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnDetalleMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnDetalleMousePressed(evt);
      }
    });

    lblDetalle.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lblDetalle.setForeground(new java.awt.Color(114, 63, 50));
    lblDetalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblDetalle.setText("Ver detalle");

    javax.swing.GroupLayout btnDetalleLayout = new javax.swing.GroupLayout(btnDetalle);
    btnDetalle.setLayout(btnDetalleLayout);
    btnDetalleLayout.setHorizontalGroup(
      btnDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    btnDetalleLayout.setVerticalGroup(
      btnDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    btnCobrar.setBackground(new java.awt.Color(241, 207, 178));
    btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnCobrar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnCobrarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnCobrarMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnCobrarMousePressed(evt);
      }
    });

    lblCobrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lblCobrar.setForeground(new java.awt.Color(114, 63, 50));
    lblCobrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblCobrar.setText("Cobrar");

    javax.swing.GroupLayout btnCobrarLayout = new javax.swing.GroupLayout(btnCobrar);
    btnCobrar.setLayout(btnCobrarLayout);
    btnCobrarLayout.setHorizontalGroup(
      btnCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    btnCobrarLayout.setVerticalGroup(
      btnCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblCobrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    checkboxInactivos.setForeground(new java.awt.Color(114, 63, 50));
    checkboxInactivos.setText("Ver pedidos inactivos");
    checkboxInactivos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        checkboxInactivosMousePressed(evt);
      }
    });

    tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Mesa", "Fecha", "Hora", "Pagado", "Subtotal", "Activo"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tablaPedidosMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        tablaPedidosMouseReleased(evt);
      }
    });
    jScrollPane2.setViewportView(tablaPedidos);

    javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
    bg.setLayout(bgLayout);
    bgLayout.setHorizontalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(bgLayout.createSequentialGroup()
            .addComponent(lblTitulo)
            .addGap(248, 248, 248)
            .addComponent(checkboxInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(bgLayout.createSequentialGroup()
            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane2))
        .addGap(55, 55, 55))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblTitulo)
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addComponent(checkboxInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(13, 13, 13)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnCobrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(87, Short.MAX_VALUE))
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

  private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
    btnAgregar.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnAgregarMouseEntered

  private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
    btnAgregar.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnAgregarMouseExited

  private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
    if (tablaPedidos.getSelectedRows().length == 1) {
      btnModificar.setBackground(Color.decode("#D9B18E"));
    }
  }//GEN-LAST:event_btnModificarMouseEntered

  private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
    if (tablaPedidos.getSelectedRows().length == 1) {
      btnModificar.setBackground(Color.decode("#F1CFB2"));
    }
  }//GEN-LAST:event_btnModificarMouseExited

  private void btnDetalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleMouseEntered
    if (tablaPedidos.getSelectedRows().length == 1) {
      btnDetalle.setBackground(Color.decode("#D9B18E"));
    }
  }//GEN-LAST:event_btnDetalleMouseEntered

  private void btnDetalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleMouseExited
    if (tablaPedidos.getSelectedRows().length == 1) {
      btnDetalle.setBackground(Color.decode("#F1CFB2"));
    }
  }//GEN-LAST:event_btnDetalleMouseExited

  private void btnCobrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseEntered
    Pedido pedidoSeleccionada = null;

    try {
      pedidoSeleccionada = pedidos.get(tablaPedidos.getSelectedRow());

      if (tablaPedidos.getSelectedRows().length == 1 && !pedidoSeleccionada.isPagado()) {
        btnCobrar.setBackground(Color.decode("#D9B18E"));
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      if (tablaPedidos.getSelectedRows().length == 1) {
        btnCobrar.setBackground(Color.decode("#D9B18E"));
      }
    }
  }//GEN-LAST:event_btnCobrarMouseEntered

  private void btnCobrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseExited
    Pedido pedidoSeleccionada = null;

    try {
      pedidoSeleccionada = pedidos.get(tablaPedidos.getSelectedRow());

      if (tablaPedidos.getSelectedRows().length == 1 && !pedidoSeleccionada.isPagado()) {
        btnCobrar.setBackground(Color.decode("#F1CFB2"));
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      if (tablaPedidos.getSelectedRows().length == 1) {
        btnCobrar.setBackground(Color.decode("#F1CFB2"));
      }
    }
  }//GEN-LAST:event_btnCobrarMouseExited

  private void btnDetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleMousePressed
    if (tablaPedidos.getSelectedRows().length != 1) {
      return;
    }
    
    Pedido selectedPedido = pedidos.get(tablaPedidos.getSelectedRow());

    DetallePedido dp = new DetallePedido(con, selectedPedido);
    dp.setSize(780, 530);
    dp.setLocation(0, 0);
    
    bg.removeAll();
    bg.add(dp, BorderLayout.CENTER);
    bg.revalidate();
    bg.repaint();
  }//GEN-LAST:event_btnDetalleMousePressed

  private void checkboxInactivosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkboxInactivosMousePressed

    quiereDesactivados = !checkboxInactivos.isSelected();

    cargarDatos(quiereDesactivados);

  }//GEN-LAST:event_checkboxInactivosMousePressed

  private void btnCobrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMousePressed
    if (tablaPedidos.getSelectedRows().length != 1) {
      return;
    }
    
    Pedido pedidoSeleccionada = pedidos.get(tablaPedidos.getSelectedRow());
    
    if (pedidoSeleccionada.isPagado()) {
      return;
    }
    
    int idPedidoSeleccionada = pedidos.get(tablaPedidos.getSelectedRow()).getIdPedido();
    
    pedData.cobrarPedido(idPedidoSeleccionada);
    
    cargarDatos(quiereDesactivados);
  }//GEN-LAST:event_btnCobrarMousePressed

  private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
    AccionesPedido ap = new AccionesPedido(con, null);
    ap.setSize(780, 530);
    ap.setLocation(0, 0);
    
    bg.removeAll();
    bg.add(ap, BorderLayout.CENTER);
    bg.revalidate();
    bg.repaint();
  }//GEN-LAST:event_btnAgregarMousePressed

  private void tablaPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidosMousePressed
    if (tablaPedidos.getSelectedRows().length == 1) {
      enableAll();
    } else {
      disableAll();
    }

    Pedido pedidoSeleccionada = null;

    try {
      pedidoSeleccionada = pedidos.get(tablaPedidos.getSelectedRow());

      if (pedidoSeleccionada.isPagado()) {
        disableButton(btnCobrar, lblCobrar);
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
    }
  }//GEN-LAST:event_tablaPedidosMousePressed

  private void tablaPedidosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidosMouseReleased
    if (tablaPedidos.getSelectedRows().length == 1) {
      enableAll();
    } else {
      disableAll();
    }

    Pedido pedidoSeleccionada = null;

    try {
      pedidoSeleccionada = pedidos.get(tablaPedidos.getSelectedRow());

      if (pedidoSeleccionada.isPagado()) {
        disableButton(btnCobrar, lblCobrar);
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
    }
  }//GEN-LAST:event_tablaPedidosMouseReleased

  private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
    if (tablaPedidos.getSelectedRows().length != 1) {
      return;
    }
    
    Pedido pedidoSeleccionada = pedidos.get(tablaPedidos.getSelectedRow());
    
    AccionesPedido ap = new AccionesPedido(con, pedidoSeleccionada);
    ap.setSize(780, 530);
    ap.setLocation(0, 0);
    
    bg.removeAll();
    bg.add(ap, BorderLayout.CENTER);
    bg.revalidate();
    bg.repaint();
  }//GEN-LAST:event_btnModificarMousePressed

  private void cargarDatos(boolean conDesactivos) {
    
    model.setRowCount(0);
    
    NumberFormat decimalFormatter = new DecimalFormat("#0.00");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    pedidos = new ArrayList<>();

    if (conDesactivos) {
      pedidos = pedData.obtenerPedidosInActivos();
    } else {
      pedidos = pedData.obtenerPedidosActivos();
    }

    Collections.sort(pedidos, new Comparator<Pedido>() {
      @Override
      public int compare(Pedido t, Pedido t1) {
        return t.getFecha().compareTo(t1.getFecha());
      }
    });

    pedidos.forEach(pedido -> {
      
      double precio;

      if (pedido.isPagado()) {
        precio = pedido.getSubtotal();
      } else {
        precio = pedData.obtenerSubtotalDelPedido(pedido.getIdPedido());
      }

      model.addRow(new Object[]{
        pedido.getMesa().getNumMesa(),
        pedido.getFecha().format(dateFormatter),
        pedido.getHora().format(timeFormatter),
        pedido.isPagado() ? "Si" : "No",
        ("$" + decimalFormatter.format(precio)),
        pedido.isActivo() ? "Si" : "No"
      });

    });

    disableAll();
  }
  
  public void disableButton(JPanel panel, JLabel label) {
    panel.setBackground(Color.LIGHT_GRAY);
    label.setForeground(Color.GRAY);
  }
  
  public void enableButton(JPanel panel, JLabel label) {
    panel.setBackground(Color.decode("#F1CFB2"));
    label.setForeground(Color.decode("#723F32"));
  }
  
  public void disableAll() {
    disableButton(btnDetalle, lblDetalle);
    disableButton(btnModificar, lblModificar);
    disableButton(btnCobrar, lblCobrar);
  }
  
  public void enableAll() {
    enableButton(btnDetalle, lblDetalle);
    enableButton(btnModificar, lblModificar);
    enableButton(btnCobrar, lblCobrar);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JPanel btnAgregar;
  private javax.swing.JPanel btnCobrar;
  private javax.swing.JPanel btnDetalle;
  private javax.swing.JPanel btnModificar;
  private resto.componentes.CheckboxPersonalizada checkboxInactivos;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel lblAgregar;
  private javax.swing.JLabel lblCobrar;
  private javax.swing.JLabel lblDetalle;
  private javax.swing.JLabel lblModificar;
  private javax.swing.JLabel lblTitulo;
  private resto.componentes.TablaPersonalizada tablaPedidos;
  // End of variables declaration//GEN-END:variables
}
