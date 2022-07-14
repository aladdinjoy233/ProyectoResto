/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.vistas;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import resto.dao.Conexion;
import resto.dao.ProductoData;
import resto.entidades.Producto;

/**
 *
 * @author Valeria
 */
public class ProductoVista extends javax.swing.JPanel {

    private ProductoData pd;
    private DefaultTableModel modelo;
    
    public ProductoVista(Conexion con) {
        initComponents();
        
        pd  = new ProductoData(con);
        jtProductos.arreglarTabla(jScrollPane2);
        modelo = new DefaultTableModel();
        armarCabecera();
        mostrarProductos();

        deshabilitarBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        escritorio = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new resto.componentes.TablaPersonalizada();
        jpFondoAgregar = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JLabel();
        jpFondoActualizar = new javax.swing.JPanel();
        jbActualizar = new javax.swing.JLabel();
        jpFondoBorrar = new javax.swing.JPanel();
        jbBorrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jchActivo = new resto.componentes.CheckboxPersonalizada();

        setPreferredSize(new java.awt.Dimension(780, 530));

        escritorio.setBackground(new java.awt.Color(240, 239, 239));
        escritorio.setEnabled(false);

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtProductosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtProductosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtProductos);

        jpFondoAgregar.setBackground(new java.awt.Color(241, 207, 178));
        jpFondoAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbAgregar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(114, 63, 50));
        jbAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbAgregar.setText("Agregar Producto");
        jbAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAgregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpFondoAgregarLayout = new javax.swing.GroupLayout(jpFondoAgregar);
        jpFondoAgregar.setLayout(jpFondoAgregarLayout);
        jpFondoAgregarLayout.setHorizontalGroup(
            jpFondoAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        jpFondoAgregarLayout.setVerticalGroup(
            jpFondoAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpFondoActualizar.setBackground(new java.awt.Color(241, 207, 178));
        jpFondoActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbActualizar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jbActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbActualizar.setText("Actualizar Producto");
        jbActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpFondoActualizarLayout = new javax.swing.GroupLayout(jpFondoActualizar);
        jpFondoActualizar.setLayout(jpFondoActualizarLayout);
        jpFondoActualizarLayout.setHorizontalGroup(
            jpFondoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpFondoActualizarLayout.setVerticalGroup(
            jpFondoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpFondoBorrar.setBackground(new java.awt.Color(241, 207, 178));
        jpFondoBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbBorrar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jbBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbBorrar.setText("Borrar Producto");
        jbBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBorrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpFondoBorrarLayout = new javax.swing.GroupLayout(jpFondoBorrar);
        jpFondoBorrar.setLayout(jpFondoBorrarLayout);
        jpFondoBorrarLayout.setHorizontalGroup(
            jpFondoBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpFondoBorrarLayout.setVerticalGroup(
            jpFondoBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 63, 50));
        jLabel4.setText("Productos");

        jchActivo.setText("Ver productos inactivos");
        jchActivo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jchActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jpFondoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpFondoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpFondoBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jchActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpFondoAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFondoActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFondoBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void jbAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseEntered
       jpFondoAgregar.setBackground(Color.decode("#D9B18E"));
        
    }//GEN-LAST:event_jbAgregarMouseEntered

    private void jbAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseExited
       jpFondoAgregar.setBackground(Color.decode("#F1CFB2"));
       
    }//GEN-LAST:event_jbAgregarMouseExited

    private void jbActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbActualizarMouseEntered
        if (jtProductos.getSelectedRows().length == 1) {
                jpFondoActualizar.setBackground(Color.decode("#D9B18E"));
        }
       
    }//GEN-LAST:event_jbActualizarMouseEntered

    private void jbActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbActualizarMouseExited
        if (jtProductos.getSelectedRows().length == 1) {
            jpFondoActualizar.setBackground(Color.decode("#F1CFB2"));
        }
    }//GEN-LAST:event_jbActualizarMouseExited

    private void jbBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBorrarMouseEntered
        if (jtProductos.getSelectedRows().length == 1) {
                jpFondoBorrar.setBackground(Color.decode("#D9B18E"));
        }
        
    }//GEN-LAST:event_jbBorrarMouseEntered

    private void jbBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBorrarMouseExited
        if (jtProductos.getSelectedRows().length == 1) {
            jpFondoBorrar.setBackground(Color.decode("#F1CFB2"));
        }
        
    }//GEN-LAST:event_jbBorrarMouseExited

    private void jbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseClicked
        AgregarProductoVista apv = new AgregarProductoVista();
        
        apv.setSize(780, 530);
        apv.setLocation(0, 0);
        
        escritorio.removeAll();
        escritorio.add(apv);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_jbAgregarMouseClicked

    private void jchActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchActivoActionPerformed
        borrarFilas();
        
        ArrayList<Producto> listaProductos = pd.obtenerProductos(!jchActivo.isSelected());
        
        for (Producto p : listaProductos) {
            modelo.addRow(new Object[] {p.getCodigo(),p.getNombre(),p.getStock(),p.getPrecio(),(p.isComestible()? "Comidas" : "Bebidas"),(p.isActivo() ? "Si" : "No")});
        }
        deshabilitarBotones();
    }//GEN-LAST:event_jchActivoActionPerformed

    private void jbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbActualizarMouseClicked
        if(jbActualizar.isEnabled()){          
            int filaSeleccionada = jtProductos.getSelectedRow();
            int codigo = -1;
            
            if(filaSeleccionada != -1){
                codigo = (Integer)jtProductos.getValueAt(filaSeleccionada, 0);
            } 
            
            ActualizarProductoVista apv = new ActualizarProductoVista(codigo);
        
            apv.setSize(780, 530);
            apv.setLocation(0, 0);

            escritorio.removeAll();
            escritorio.add(apv);
            escritorio.revalidate();
            escritorio.repaint();
        }
        
        
    }//GEN-LAST:event_jbActualizarMouseClicked

    private void jbBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBorrarMouseClicked
        if(jbBorrar.isEnabled()){
            int filaSeleccionada = jtProductos.getSelectedRow();
            int codigo = -1;
            
            if(filaSeleccionada != -1){
                codigo = (Integer)jtProductos.getValueAt(filaSeleccionada, 0);
            }
            
            pd.desactivarProducto(codigo);
            JOptionPane.showMessageDialog(this, "Producto eliminado exitosamente.");
            mostrarProductos();
        }
    }//GEN-LAST:event_jbBorrarMouseClicked

    private void jtProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMousePressed
        if (jtProductos.getSelectedRows().length == 1) {
            habilitarBotones();
          } else {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jtProductosMousePressed

    private void jtProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseReleased
        if (jtProductos.getSelectedRows().length == 1) {
            habilitarBotones();
          } else {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jtProductosMouseReleased
     
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<Object>();
        
        columnas.add("Código");
        columnas.add("Nombre");
        columnas.add("Stock");
        columnas.add("Precio");
        columnas.add("Categoría");
        columnas.add("Activo");
        
        for (Object c : columnas) {
            modelo.addColumn(c);
        }
        
        jtProductos.setModel(modelo);
    }

    private void borrarFilas(){
        int f = modelo.getRowCount()- 1;
        
        for (int i = f; i >= 0 ; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void mostrarProductos(){
        borrarFilas();
        
        ArrayList<Producto> listaProductos = pd.obtenerProductos(!jchActivo.isSelected());
        
        for (Producto p : listaProductos) {
            modelo.addRow(new Object[] {p.getCodigo(),p.getNombre(),p.getStock(),p.getPrecio(),(p.isComestible()? "Comidas" : "Bebidas"),(p.isActivo() ? "Si" : "No")});
        }
        deshabilitarBotones();
    }
    
  public void deshabilitarBoton(JPanel panel, JLabel label) {
    panel.setBackground(Color.LIGHT_GRAY);
    label.setForeground(Color.GRAY);
  }
  
  public void habilitarBoton(JPanel panel, JLabel label) {
    panel.setBackground(Color.decode("#F1CFB2"));
    label.setForeground(Color.decode("#723F32"));
  }
  
  public void deshabilitarBotones() {
    deshabilitarBoton(jpFondoActualizar,jbActualizar);
    deshabilitarBoton(jpFondoBorrar, jbBorrar);  
  }
  
  public void habilitarBotones() {
    habilitarBoton(jpFondoActualizar,jbActualizar);
    habilitarBoton(jpFondoBorrar, jbBorrar);
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jbActualizar;
    private javax.swing.JLabel jbAgregar;
    private javax.swing.JLabel jbBorrar;
    private resto.componentes.CheckboxPersonalizada jchActivo;
    private javax.swing.JPanel jpFondoActualizar;
    private javax.swing.JPanel jpFondoAgregar;
    private javax.swing.JPanel jpFondoBorrar;
    private resto.componentes.TablaPersonalizada jtProductos;
    // End of variables declaration//GEN-END:variables
}
