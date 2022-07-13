package resto.vistas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resto.dao.Conexion;
import resto.dao.MeseroData;
import resto.entidades.Mesero;

public class MeseroVista extends javax.swing.JPanel {

    private DefaultTableModel model;
    private MeseroData md;
    
  public MeseroVista(Conexion con) {
    initComponents();
    
    md = new MeseroData(con);
    
    tablaPersonalizada1.arreglarTabla(jScrollPane1);
    model = (DefaultTableModel) tablaPersonalizada1.getModel();
    
    verMeserosActivos();
    
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonalizada1 = new resto.componentes.TablaPersonalizada();
        jLabel1 = new javax.swing.JLabel();
        jcbInactivos = new javax.swing.JCheckBox();
        jbtnAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtnActualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jbtnVer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(780, 530));

        escritorio.setBackground(new java.awt.Color(252, 252, 252));

        tablaPersonalizada1.setBackground(new java.awt.Color(204, 153, 0));
        tablaPersonalizada1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI", "Telefono", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonalizada1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 63, 50));
        jLabel1.setText("Meseros");

        jcbInactivos.setBackground(new java.awt.Color(252, 252, 252));
        jcbInactivos.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jcbInactivos.setForeground(new java.awt.Color(114, 63, 50));
        jcbInactivos.setText("Ver meseros inactivos");
        jcbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbInactivosActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 63, 50));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Mesero");

        javax.swing.GroupLayout jbtnAgregarLayout = new javax.swing.GroupLayout(jbtnAgregar);
        jbtnAgregar.setLayout(jbtnAgregarLayout);
        jbtnAgregarLayout.setHorizontalGroup(
            jbtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jbtnAgregarLayout.setVerticalGroup(
            jbtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jbtnActualizar.setBackground(new java.awt.Color(241, 207, 178));
        jbtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnActualizarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 63, 50));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Actualizar");

        javax.swing.GroupLayout jbtnActualizarLayout = new javax.swing.GroupLayout(jbtnActualizar);
        jbtnActualizar.setLayout(jbtnActualizarLayout);
        jbtnActualizarLayout.setHorizontalGroup(
            jbtnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jbtnActualizarLayout.setVerticalGroup(
            jbtnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jbtnVer.setBackground(new java.awt.Color(241, 207, 178));
        jbtnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnVerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnVerMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 63, 50));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ver mesas asignadas");

        javax.swing.GroupLayout jbtnVerLayout = new javax.swing.GroupLayout(jbtnVer);
        jbtnVer.setLayout(jbtnVerLayout);
        jbtnVerLayout.setHorizontalGroup(
            jbtnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jbtnVerLayout.setVerticalGroup(
            jbtnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbInactivos))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbInactivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void jbtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseEntered
        jbtnAgregar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbtnAgregarMouseEntered

    private void jbtnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnActualizarMouseEntered
        jbtnActualizar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbtnActualizarMouseEntered

    private void jbtnVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVerMouseEntered
        jbtnVer.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbtnVerMouseEntered

    private void jbtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseExited
        jbtnAgregar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbtnAgregarMouseExited

    private void jbtnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnActualizarMouseExited
        jbtnActualizar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbtnActualizarMouseExited

    private void jbtnVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVerMouseExited
        jbtnVer.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbtnVerMouseExited

    private void jbtnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVerMouseClicked
        MesasAsignadasVista ma = new MesasAsignadasVista();
        
        ma.setSize(780, 530);
        ma.setLocation(0, 0);   
        
        escritorio.removeAll();
        escritorio.add(ma);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_jbtnVerMouseClicked

    private void jcbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbInactivosActionPerformed
        botonInactivos();
    }//GEN-LAST:event_jcbInactivosActionPerformed

    private void jbtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnActualizarMouseClicked
        
        boolean meserosModificados = false;
        
        for(int i = 0; i < model.getRowCount(); i++){
                
            Mesero m = new Mesero();
            
            try{
            m.setIdMesero((Integer) model.getValueAt(i, 0));
            m.setNombre((String) model.getValueAt(i, 1));
            m.setApellido((String) model.getValueAt(i, 2));
            m.setDni((Long) model.getValueAt(i, 3));
            m.setTelefono((Long) model.getValueAt(i, 4));
            m.setActivo((boolean) model.getValueAt(i, 5));
            
            if(m.getNombre().trim().isEmpty()|| m.getApellido().trim().isEmpty()){ //valido que el nombre y el apellido no esten en blanco
                meserosModificados = false;
                JOptionPane.showMessageDialog(this, "Error! Dato/s no ingresado/s en fila " + (i + 1));
                
                if(i > 0){ //si no hubo errores antes aviso que se modificaron esos datos
                    JOptionPane.showMessageDialog(this, "Se actualizaran solo los datos anteriores a la fila " + (i + 1));
                }
                
                break;
            }
            
            if(md.modificarMesero(m)){
                meserosModificados = true;
            } 
            
            } catch(java.lang.ClassCastException e){ //valido numeros y que no esten en blanco
                meserosModificados = false;
                JOptionPane.showMessageDialog(this, "Error! Dato ingresado no valido en fila " + (i + 1));
                
                if(i > 0){ //si no hubo errores antes aviso que se modificaron esos datos
                    JOptionPane.showMessageDialog(this, "Se actualizaran solo los datos anteriores a la fila " + (i + 1));
                }
                
                break;
            } 
            
                           
        }
        
        if(meserosModificados){
            JOptionPane.showMessageDialog(this, "Mesero/s actualizado/s con exito");
        }
        
        
        if(jcbInactivos.isSelected()){ //si se produjo algun error la tabla vuelve a la normalidad, sino se actualiza
            verTodosMeseros();
        } else{
            verMeserosActivos();
        }
                
    }//GEN-LAST:event_jbtnActualizarMouseClicked

    private void borrarFilas(){
        int a = model.getRowCount() - 1;
        
        for (int i = a; i > -1 ; i--){
            model.removeRow(i);
        }
    }
    
    private void verMeserosActivos(){
        borrarFilas();
        
        ArrayList<Mesero> lista = md.obtenerMeseros();
        
        Collections.sort(lista, new Comparator<Mesero>(){ //ordenar meseros por el nombre
            @Override
            public int compare(Mesero m, Mesero m1){
                return m.getNombre().compareTo(m1.getNombre());
            }
        });
        
        for(Mesero m : lista){
            model.addRow(new Object[]{m.getIdMesero(),m.getNombre(),m.getApellido(),m.getDni(),m.getTelefono(),m.isActivo()});
        }
        
    }
    
    private void verTodosMeseros(){
        borrarFilas();
        
        ArrayList<Mesero> lista = md.obtenerTodosMeseros();
        
        Collections.sort(lista, new Comparator<Mesero>(){ //ordenar meseros por el nombre
            @Override
            public int compare(Mesero m, Mesero m1){
                return m.getNombre().compareTo(m1.getNombre());
            }
        });
        
        for(Mesero m : lista){
            model.addRow(new Object[]{m.getIdMesero(),m.getNombre(),m.getApellido(),m.getDni(),m.getTelefono(),m.isActivo()});
        }        
    }
    
    private void botonInactivos(){
        if(jcbInactivos.isSelected()){
          verTodosMeseros();
        } else{
          verMeserosActivos();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jbtnActualizar;
    private javax.swing.JPanel jbtnAgregar;
    private javax.swing.JPanel jbtnVer;
    private javax.swing.JCheckBox jcbInactivos;
    private resto.componentes.TablaPersonalizada tablaPersonalizada1;
    // End of variables declaration//GEN-END:variables
}
