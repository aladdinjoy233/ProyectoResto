package resto.vistas;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import resto.dao.*;

public class IngresosVista extends javax.swing.JPanel {

  private Date hoy;
  private NumberFormat decimalFormatter = new DecimalFormat("#0.00");

  private Conexion con;
  private PedidoData pedidoData;

  public IngresosVista(Conexion con) {
    initComponents();

    this.con = con;
    pedidoData = new PedidoData(con);

    hoy = new Date();
    fechaInput.setDate(hoy);

    double montoTotal = pedidoData.obtenerTotalDelDia(hoy);
    total.setText("$" + decimalFormatter.format(montoTotal));

  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    fechaInput = new com.toedter.calendar.JDateChooser();
    lblFecha = new javax.swing.JLabel();
    lblTotal = new javax.swing.JLabel();
    total = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    lblTitulo.setBackground(new java.awt.Color(114, 63, 50));
    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
    lblTitulo.setForeground(new java.awt.Color(114, 63, 50));
    lblTitulo.setText("Ver ingresos");

    fechaInput.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
      public void propertyChange(java.beans.PropertyChangeEvent evt) {
        fechaInputPropertyChange(evt);
      }
    });

    lblFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblFecha.setForeground(new java.awt.Color(114, 63, 50));
    lblFecha.setText("Fecha:");

    lblTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblTotal.setForeground(new java.awt.Color(114, 63, 50));
    lblTotal.setText("Total del dia:");

    total.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    total.setForeground(new java.awt.Color(114, 63, 50));
    total.setText("$1.000");

    javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
    bg.setLayout(bgLayout);
    bgLayout.setHorizontalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(bgLayout.createSequentialGroup()
            .addComponent(lblTotal)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(total))
          .addGroup(bgLayout.createSequentialGroup()
            .addComponent(lblFecha)
            .addGap(18, 18, 18)
            .addComponent(fechaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(lblTitulo))
        .addContainerGap(500, Short.MAX_VALUE))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addComponent(lblTitulo)
        .addGap(61, 61, 61)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(fechaInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(57, 57, 57)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
          .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(270, 270, 270))
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

  private void fechaInputPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaInputPropertyChange
    double montoTotal = pedidoData.obtenerTotalDelDia(fechaInput.getDate());

    total.setText("$" + decimalFormatter.format(montoTotal));
  }//GEN-LAST:event_fechaInputPropertyChange


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private com.toedter.calendar.JDateChooser fechaInput;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JLabel total;
  // End of variables declaration//GEN-END:variables
}
