/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.vistas;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resto.dao.Conexion;
import resto.dao.MesaData;
import resto.entidades.Mesa;

/**
 *
 * @author Edder
 */
public class MesaVista extends javax.swing.JPanel {

    //Atributos
    private MesaData mesadata;
    private DefaultTableModel model;

    /**
     * Creates new form MesaVista
     */
    //Constructor
    public MesaVista(Conexion coneccion) {
        initComponents();
        mesadata = new MesaData(coneccion);
        model = (DefaultTableModel) tablaMesas.getModel();
        tablaMesas.arreglarTabla(jScrollPanel);
        verActivas();
    }

    public void armarCabeceraTabla() {

        ArrayList<Object> columns = new ArrayList();
        columns.add("N° de Mesa");
        columns.add("Capacidad");
        columns.add("Ocupado");
        columns.add("Activo");

        for (Object it : columns) {
            model.addColumn(it);
        }
        tablaMesas.setModel(model);
    }

    private void borrarFilas() {
        int a = model.getRowCount() - 1;
        for (int i = a; i > -1; i--) {
            model.removeRow(i);
        }
    }

    private void verInactivas() {
        mVbtnReactivar.setVisible(true);
        mVbtnActualizar.setVisible(false);
        mVbtnBorrar.setVisible(false);
        borrarFilas();
        ArrayList<Mesa> mesas = mesadata.listadoMesasInactivas();

        for (Mesa m : mesas) {
            model.addRow(new Object[]{m.getNumMesa(), m.getCapacidad(), m.isEstado() ? "Si" : "No", m.isActivo() ? "Si" : "No"});
        }
    }

    private void verActivas() {
        mVbtnReactivar.setVisible(false);
        mVbtnActualizar.setVisible(true);
        mVbtnBorrar.setVisible(true);
        borrarFilas();
        ArrayList<Mesa> mesas = mesadata.listadoMesasActivas();

        for (Mesa m : mesas) {
            model.addRow(new Object[]{m.getNumMesa(), m.getCapacidad(), m.isEstado() ? "Si" : "No", m.isActivo() ? "Si" : "No"});
        }
    }

    private void actualizarMesas() {
        int count = 0;
        try {
            for (int i = 0; i < tablaMesas.getRowCount(); i++) {

                //consigo los datos de la tabla
                Mesa nMesa = new Mesa();
                nMesa.setNumMesa(Integer.parseInt(model.getValueAt(i, 0).toString()));
                nMesa.setCapacidad(Integer.parseInt(model.getValueAt(i, 1).toString()));
                

                if (tablaMesas.getValueAt(i, 2).equals("Si")) {
                    nMesa.setEstado(true);
                } else if (tablaMesas.getValueAt(i, 2).equals("No")) {
                    nMesa.setEstado(false);
                } else {
                    nMesa.setEstado(false);;
                }
                if (tablaMesas.getValueAt(i, 3).equals("Si")) {
                    nMesa.setActivo(true);
                } else if (tablaMesas.getValueAt(i, 3).equals("No")) {
                    nMesa.setActivo(true);
                } else {
                    nMesa.setActivo(true);
                }

                if (mesadata.modificarMesaVista(nMesa)) {
                    count++;
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex.getMessage());
        }

        if (count == tablaMesas.getRowCount()) {
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Solo se actualizaron " + count + " de " + tablaMesas.getRowCount()
                    + " reservas\n1) La fecha/hora debe ser proxima a la actual");

        }

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
        jScrollPanel = new javax.swing.JScrollPane();
        tablaMesas = new resto.componentes.TablaPersonalizada();
        jpFondoAgregar = new javax.swing.JPanel();
        mVbtnAgregar = new javax.swing.JLabel();
        jpFondoActualizar = new javax.swing.JPanel();
        mVbtnActualizar = new javax.swing.JLabel();
        jpFondoBorrar = new javax.swing.JPanel();
        mVbtnBorrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mVmesasInactivas = new resto.componentes.CheckboxPersonalizada();
        jpFondoReactivar = new javax.swing.JPanel();
        mVbtnReactivar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(780, 530));

        escritorio.setBackground(new java.awt.Color(240, 239, 239));

        tablaMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° de Mesa", "Capacidad", "Ocupada", "Activa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanel.setViewportView(tablaMesas);

        jpFondoAgregar.setBackground(new java.awt.Color(241, 207, 178));

        mVbtnAgregar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        mVbtnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mVbtnAgregar.setText("Agregar Mesa");
        mVbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mVbtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mVbtnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mVbtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mVbtnAgregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpFondoAgregarLayout = new javax.swing.GroupLayout(jpFondoAgregar);
        jpFondoAgregar.setLayout(jpFondoAgregarLayout);
        jpFondoAgregarLayout.setHorizontalGroup(
            jpFondoAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        jpFondoAgregarLayout.setVerticalGroup(
            jpFondoAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpFondoActualizar.setBackground(new java.awt.Color(241, 207, 178));

        mVbtnActualizar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        mVbtnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mVbtnActualizar.setText("Actualizar Mesa");
        mVbtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mVbtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mVbtnActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mVbtnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mVbtnActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpFondoActualizarLayout = new javax.swing.GroupLayout(jpFondoActualizar);
        jpFondoActualizar.setLayout(jpFondoActualizarLayout);
        jpFondoActualizarLayout.setHorizontalGroup(
            jpFondoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpFondoActualizarLayout.setVerticalGroup(
            jpFondoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpFondoBorrar.setBackground(new java.awt.Color(241, 207, 178));

        mVbtnBorrar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        mVbtnBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mVbtnBorrar.setText("Borrar Mesa");
        mVbtnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mVbtnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mVbtnBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mVbtnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mVbtnBorrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpFondoBorrarLayout = new javax.swing.GroupLayout(jpFondoBorrar);
        jpFondoBorrar.setLayout(jpFondoBorrarLayout);
        jpFondoBorrarLayout.setHorizontalGroup(
            jpFondoBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpFondoBorrarLayout.setVerticalGroup(
            jpFondoBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 63, 50));
        jLabel4.setText("Mesas");

        mVmesasInactivas.setText("Mostrar Mesas Inactivas");
        mVmesasInactivas.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        mVmesasInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVmesasInactivasActionPerformed(evt);
            }
        });

        jpFondoReactivar.setBackground(new java.awt.Color(241, 207, 178));

        mVbtnReactivar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        mVbtnReactivar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mVbtnReactivar.setText("Reactivar Mesa");
        mVbtnReactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mVbtnReactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mVbtnReactivarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mVbtnReactivarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mVbtnReactivarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpFondoReactivarLayout = new javax.swing.GroupLayout(jpFondoReactivar);
        jpFondoReactivar.setLayout(jpFondoReactivarLayout);
        jpFondoReactivarLayout.setHorizontalGroup(
            jpFondoReactivarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnReactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpFondoReactivarLayout.setVerticalGroup(
            jpFondoReactivarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mVbtnReactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(458, 458, 458)
                        .addComponent(mVmesasInactivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(escritorioLayout.createSequentialGroup()
                            .addComponent(jpFondoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpFondoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpFondoBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpFondoReactivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mVmesasInactivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpFondoAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFondoActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFondoBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFondoReactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void mVbtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnAgregarMouseEntered
        jpFondoAgregar.setBackground(Color.decode("#D9B18E"));

    }//GEN-LAST:event_mVbtnAgregarMouseEntered

    private void mVbtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnAgregarMouseExited
        jpFondoAgregar.setBackground(Color.decode("#F1CFB2"));

    }//GEN-LAST:event_mVbtnAgregarMouseExited

    private void mVbtnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnActualizarMouseEntered
        jpFondoActualizar.setBackground(Color.decode("#D9B18E"));

    }//GEN-LAST:event_mVbtnActualizarMouseEntered

    private void mVbtnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnActualizarMouseExited
        jpFondoActualizar.setBackground(Color.decode("#F1CFB2"));

    }//GEN-LAST:event_mVbtnActualizarMouseExited

    private void mVbtnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnBorrarMouseEntered
        jpFondoBorrar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_mVbtnBorrarMouseEntered

    private void mVbtnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnBorrarMouseExited
        jpFondoBorrar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_mVbtnBorrarMouseExited

    private void mVbtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnAgregarMouseClicked
        Conexion coneccion = new Conexion();
        CrearMesasVista cmv = new CrearMesasVista(coneccion);

        cmv.setSize(780, 530);
        cmv.setLocation(0, 0);

        escritorio.removeAll();
        escritorio.add(cmv);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_mVbtnAgregarMouseClicked

    private void mVbtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnActualizarMouseClicked
        // TODO add your handling code here:
        actualizarMesas();
    }//GEN-LAST:event_mVbtnActualizarMouseClicked

    private void mVbtnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnBorrarMouseClicked
        // TODO add your handling code here:
        int fSelect = tablaMesas.getSelectedRow();
        if (fSelect > -1) {
            try {
                Mesa nMesa = new Mesa();
                nMesa.setNumMesa(Integer.parseInt(model.getValueAt(fSelect, 0).toString()));
                mesadata.borrarMesa(nMesa);

                if (mVmesasInactivas.isSelected()) {
                    verInactivas();
                } else {
                    verActivas();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al Borrar una Mesa. " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Mesa para Borar.");
        }

    }//GEN-LAST:event_mVbtnBorrarMouseClicked

    private void mVmesasInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVmesasInactivasActionPerformed
        // TODO add your handling code here:
        if (mVmesasInactivas.isSelected()) {
            verInactivas();
        } else {
            verActivas();
        }
    }//GEN-LAST:event_mVmesasInactivasActionPerformed

    private void mVbtnReactivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnReactivarMouseClicked
        // TODO add your handling code here:
        int fSelect = tablaMesas.getSelectedRow();
        if (fSelect > -1) {
            try {
                Mesa nMesa = new Mesa();
                nMesa.setNumMesa(Integer.parseInt(model.getValueAt(fSelect, 0).toString()));
                mesadata.activarMesa(nMesa);

                if (mVmesasInactivas.isSelected()) {
                    verInactivas();
                } else {
                    verActivas();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al Reactivar una Mesa. " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Mesa para Reactivar.");
        }

    }//GEN-LAST:event_mVbtnReactivarMouseClicked

    private void mVbtnReactivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnReactivarMouseEntered
        // TODO add your handling code here:
        jpFondoReactivar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_mVbtnReactivarMouseEntered

    private void mVbtnReactivarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVbtnReactivarMouseExited
        // TODO add your handling code here:
        jpFondoReactivar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_mVbtnReactivarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JPanel jpFondoActualizar;
    private javax.swing.JPanel jpFondoAgregar;
    private javax.swing.JPanel jpFondoBorrar;
    private javax.swing.JPanel jpFondoReactivar;
    private javax.swing.JLabel mVbtnActualizar;
    private javax.swing.JLabel mVbtnAgregar;
    private javax.swing.JLabel mVbtnBorrar;
    private javax.swing.JLabel mVbtnReactivar;
    private resto.componentes.CheckboxPersonalizada mVmesasInactivas;
    private resto.componentes.TablaPersonalizada tablaMesas;
    // End of variables declaration//GEN-END:variables
}
