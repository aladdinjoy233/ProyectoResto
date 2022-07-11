package resto.vistas;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class PedidosVista extends javax.swing.JPanel {

  public PedidosVista() {
    initComponents();
    
    tablaPedidos.arreglarTabla(jScrollPane1);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaPedidos = new resto.componentes.TablaPersonalizada();
    btnAgregar = new javax.swing.JPanel();
    lblAgregar = new javax.swing.JLabel();
    btnModificar = new javax.swing.JPanel();
    lblModificar = new javax.swing.JLabel();
    btnDetalle = new javax.swing.JPanel();
    lblDetalle = new javax.swing.JLabel();
    btnCobrar = new javax.swing.JPanel();
    lblCobrar = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
    lblTitulo.setText("Manejar Pedidos");

    tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Mesa", "Fecha", "Hora", "Pagado", "Subtotal", "Activo"
      }
    ));
    tablaPedidos.setPreferredSize(new java.awt.Dimension(290, 100));
    jScrollPane1.setViewportView(tablaPedidos);

    btnAgregar.setBackground(new java.awt.Color(241, 207, 178));
    btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnAgregarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnAgregarMouseExited(evt);
      }
    });

    lblAgregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblAgregar.setText("Agregar pedido");

    javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
    btnAgregar.setLayout(btnAgregarLayout);
    btnAgregarLayout.setHorizontalGroup(
      btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
    );
    btnAgregarLayout.setVerticalGroup(
      btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(lblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    });

    lblModificar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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
      .addComponent(lblModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    });

    lblDetalle.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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
      .addComponent(lblDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    });

    lblCobrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCobrarLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(lblCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
    bg.setLayout(bgLayout);
    bgLayout.setHorizontalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(bgLayout.createSequentialGroup()
            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(lblTitulo)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(55, Short.MAX_VALUE))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addComponent(lblTitulo)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnCobrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(100, Short.MAX_VALUE))
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
    btnModificar.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnModificarMouseEntered

  private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
    btnModificar.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnModificarMouseExited

  private void btnDetalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleMouseEntered
    btnDetalle.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnDetalleMouseEntered

  private void btnDetalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleMouseExited
    btnDetalle.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnDetalleMouseExited

  private void btnCobrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseEntered
    btnCobrar.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnCobrarMouseEntered

  private void btnCobrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseExited
    btnCobrar.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnCobrarMouseExited


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JPanel btnAgregar;
  private javax.swing.JPanel btnCobrar;
  private javax.swing.JPanel btnDetalle;
  private javax.swing.JPanel btnModificar;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblAgregar;
  private javax.swing.JLabel lblCobrar;
  private javax.swing.JLabel lblDetalle;
  private javax.swing.JLabel lblModificar;
  private javax.swing.JLabel lblTitulo;
  private resto.componentes.TablaPersonalizada tablaPedidos;
  // End of variables declaration//GEN-END:variables
}
