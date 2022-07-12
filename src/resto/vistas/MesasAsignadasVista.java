/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.vistas;

import java.awt.Color;
import java.awt.Window;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UltrabookSamsung
 */
public class MesasAsignadasVista extends javax.swing.JPanel {

    /**
     * Creates new form MesasAsignadasVista
     */
    public MesasAsignadasVista() {
        initComponents();
        
        agregarMesa.arreglarTabla(jScrollPane1);
        DefaultTableModel mesasNoAsignadas = (DefaultTableModel) agregarMesa.getModel();
    
        mesasDe.arreglarTabla(jScrollPane2);
        DefaultTableModel mesasAsignadas = (DefaultTableModel) mesasDe.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jlFlecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        agregarMesa = new resto.componentes.TablaPersonalizada();
        jScrollPane2 = new javax.swing.JScrollPane();
        mesasDe = new resto.componentes.TablaPersonalizada();
        jLabel1 = new javax.swing.JLabel();
        jbtnSacar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(780, 530));

        escritorio.setBackground(new java.awt.Color(252, 252, 252));

        jlFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
        jlFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlFlechaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 63, 50));
        jLabel2.setText("Mesas de ");

        jlNombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(114, 63, 50));
        jlNombre.setText("nombre");

        agregarMesa.setBackground(new java.awt.Color(204, 153, 0));
        agregarMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Mesa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(agregarMesa);

        mesasDe.setBackground(new java.awt.Color(204, 153, 0));
        mesasDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Mesa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(mesasDe);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 63, 50));
        jLabel1.setText("Agregar mesa");

        jbtnSacar.setBackground(new java.awt.Color(241, 207, 178));
        jbtnSacar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnSacarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnSacarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 63, 50));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sacar Mesa");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jbtnSacarLayout = new javax.swing.GroupLayout(jbtnSacar);
        jbtnSacar.setLayout(jbtnSacarLayout);
        jbtnSacarLayout.setHorizontalGroup(
            jbtnSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jbtnSacarLayout.setVerticalGroup(
            jbtnSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jbtnAgregar.setBackground(new java.awt.Color(241, 207, 178));
        jbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAgregarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 63, 50));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar Mesa");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jbtnAgregarLayout = new javax.swing.GroupLayout(jbtnAgregar);
        jbtnAgregar.setLayout(jbtnAgregarLayout);
        jbtnAgregarLayout.setHorizontalGroup(
            jbtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jbtnAgregarLayout.setVerticalGroup(
            jbtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlFlecha)
                .addContainerGap(754, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(jlNombre))
                    .addComponent(jbtnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlFlecha)
                .addGap(31, 31, 31)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlNombre)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSacarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSacarMouseEntered
        jbtnSacar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbtnSacarMouseEntered

    private void jbtnSacarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSacarMouseExited
        jbtnSacar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbtnSacarMouseExited

    private void jbtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseEntered
        jbtnAgregar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbtnAgregarMouseEntered

    private void jbtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseExited
        jbtnAgregar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbtnAgregarMouseExited

    private void jlFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFlechaMouseClicked
        MeseroVista mv = new MeseroVista();
        
        mv.setSize(780, 530);
        mv.setLocation(0, 0);   
        
        escritorio.removeAll();
        escritorio.add(mv);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_jlFlechaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private resto.componentes.TablaPersonalizada agregarMesa;
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jbtnAgregar;
    private javax.swing.JPanel jbtnSacar;
    private javax.swing.JLabel jlFlecha;
    private javax.swing.JLabel jlNombre;
    private resto.componentes.TablaPersonalizada mesasDe;
    // End of variables declaration//GEN-END:variables
}
