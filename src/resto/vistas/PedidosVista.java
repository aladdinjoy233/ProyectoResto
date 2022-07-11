package resto.vistas;

import javax.swing.table.DefaultTableModel;

public class PedidosVista extends javax.swing.JPanel {

  public PedidosVista() {
    initComponents();
    
    tablaPersonalizada1.arreglarTabla(jScrollPane1);

    DefaultTableModel model = (DefaultTableModel) tablaPersonalizada1.getModel();
    
    for (int i = 1; i <= 20; i++) {
      model.addRow(new Object[]{i, "Hola", "Allan", "Chau"});
      
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaPersonalizada1 = new resto.componentes.TablaPersonalizada();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    tablaPersonalizada1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(tablaPersonalizada1);

    javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
    bg.setLayout(bgLayout);
    bgLayout.setHorizontalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(58, 58, 58)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(91, Short.MAX_VALUE))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(64, 64, 64)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(188, Short.MAX_VALUE))
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


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JScrollPane jScrollPane1;
  private resto.componentes.TablaPersonalizada tablaPersonalizada1;
  // End of variables declaration//GEN-END:variables
}
