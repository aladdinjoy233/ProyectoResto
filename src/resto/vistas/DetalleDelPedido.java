package resto.vistas;

import java.awt.BorderLayout;

public class DetalleDelPedido extends javax.swing.JPanel {

  public DetalleDelPedido() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    btnVolver = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
    lblTitulo.setText("Ver detalle del pedido");

    btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
    btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnVolverMousePressed(evt);
      }
    });

    javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
    bg.setLayout(bgLayout);
    bgLayout.setHorizontalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(btnVolver))
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(lblTitulo)))
        .addContainerGap(374, Short.MAX_VALUE))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(btnVolver)
        .addGap(4, 4, 4)
        .addComponent(lblTitulo))
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
    PedidosVista pv = new PedidosVista();
    pv.setSize(780, 530);
    pv.setLocation(0, 0);

    bg.removeAll();
    bg.add(pv, BorderLayout.CENTER);
    bg.revalidate();
    bg.repaint();
  }//GEN-LAST:event_btnVolverMousePressed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JLabel btnVolver;
  private javax.swing.JLabel lblTitulo;
  // End of variables declaration//GEN-END:variables
}
