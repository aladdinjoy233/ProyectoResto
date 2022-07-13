package resto.vistas;

import resto.dao.*;
import javax.swing.*;
import resto.entidades.*;
import java.util.*;
import java.time.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

public class ReservaVista extends javax.swing.JPanel {

    //atributos
    private javax.swing.JPanel tabSeleccionada;
    private Conexion con;
    private ReservaData rd;
    private MesaData md;
    private DefaultTableModel modelo;

    //constructor
    public ReservaVista(Conexion con) {

        initComponents();
        con = new Conexion();
        rd = new ReservaData(con);
        md = new MesaData(con);
        jTable.arreglarTabla(jScrollPane1);
        modelo = (DefaultTableModel) jTable.getModel();
        verActivas();
    }

    //funcionalidades
    void setearSeleccionado(JPanel panel) {
        panel.setBackground(Color.decode("#F1CFB2"));
        tabSeleccionada = panel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new resto.componentes.TablaPersonalizada();
        jLabel4 = new javax.swing.JLabel();
        agregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        actualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCinactivo = new resto.componentes.CheckboxPersonalizada();

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 63, 50));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Mesero");

        contenido.setBackground(new java.awt.Color(252, 252, 252));
        contenido.setPreferredSize(new java.awt.Dimension(780, 530));
        contenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contenidoMouseClicked(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num mesa", "Fecha", "Hora", "DNI", "Activo", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 63, 50));
        jLabel4.setText("Reservas");

        agregar.setBackground(new java.awt.Color(241, 207, 178));
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 63, 50));
        jLabel1.setText("Agregar reserva");

        javax.swing.GroupLayout agregarLayout = new javax.swing.GroupLayout(agregar);
        agregar.setLayout(agregarLayout);
        agregarLayout.setHorizontalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        agregarLayout.setVerticalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        actualizar.setBackground(new java.awt.Color(241, 207, 178));
        actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actualizarMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 63, 50));
        jLabel3.setText("Actualizar");

        javax.swing.GroupLayout actualizarLayout = new javax.swing.GroupLayout(actualizar);
        actualizar.setLayout(actualizarLayout);
        actualizarLayout.setHorizontalGroup(
            actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        actualizarLayout.setVerticalGroup(
            actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCinactivo.setForeground(new java.awt.Color(114, 63, 50));
        jCinactivo.setText("Ver pedidos inactivos");
        jCinactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCinactivoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCinactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCinactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenidoMouseClicked
        // TODO add your handling code here:  
    }//GEN-LAST:event_contenidoMouseClicked

    private void borrarFilas() {

        int a = modelo.getRowCount() - 1;
        for (int i = a; i > -1; i--) {
            modelo.removeRow(i);
        }
    }

    private void verInactivas() {
        borrarFilas();
        ArrayList<Reserva> reservas = rd.obtenerReservasInactivas();

        for (Reserva r : reservas) {
            modelo.addRow(new Object[]{r.getMesa().getNumMesa(), r.getFecha(), r.getHora(), r.getDni(), r.isActivo() ? "si" : "no", r.getIdReserva()});
        }
    }

    private void verActivas() {
        borrarFilas();
        ArrayList<Reserva> reservas = rd.obtenerReservas();

        for (Reserva r : reservas) {

            modelo.addRow(new Object[]{r.getMesa().getNumMesa(), r.getFecha(), r.getHora(), r.getDni(), r.isActivo() ? "si" : "no", r.getIdReserva()});
        }
    }

    private void agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseEntered
        agregar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_agregarMouseEntered

    private void agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseExited
        agregar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_agregarMouseExited

    private void actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseEntered
        // TODO add your handling code here:
        actualizar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_actualizarMouseEntered

    private void actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseExited
        // TODO add your handling code here:
        actualizar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_actualizarMouseExited

    private void actualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMousePressed
        // TODO add your handling code here:
        //int filaSeleccionada = jTable.getSelectedRow();
        //if (filaSeleccionada > -1) {
        ActualizarReserva();
        //} else {
        //    JOptionPane.showMessageDialog(null, "Seleccione una reserva para poder actualizar");
        //}
    }//GEN-LAST:event_actualizarMousePressed

    private void agregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMousePressed
        // TODO add your handling code here:

        setearSeleccionado(agregar);

        CrearReservaVista crv = new CrearReservaVista(con);
        crv.setSize(780, 530);
        crv.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(crv, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_agregarMousePressed

    private void jCinactivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCinactivoMousePressed
        if (jCinactivo.isSelected()) {
            verActivas();
        } else {
            verInactivas();
        }
    }//GEN-LAST:event_jCinactivoMousePressed

    private void ActualizarReserva() {
        int count = 0;
        

        try {

            for (int i = 0; i < jTable.getRowCount(); i++) {
                
                //consigo los datos de la tabla
                boolean estado;
                int numMesa = (int) jTable.getValueAt(i, 0);
                LocalDate fecha = LocalDate.parse(jTable.getValueAt(i, 1).toString());
                LocalTime hora = LocalTime.parse(jTable.getValueAt(i, 2).toString());
                Long dni = (Long) jTable.getValueAt(i, 3);
                int idReserva = (int) jTable.getValueAt(i, 5);

                if (jTable.getValueAt(i, 4).equals("si")) {
                    estado = true;
                } else if (jTable.getValueAt(i, 4).equals("no")) {
                    estado = false;
                } else {
                    estado = false;
                }

                Reserva reserva = rd.obtenerReserva(idReserva);
                Mesa mesa = md.obtenerMesa(numMesa);

                Reserva r = new Reserva(idReserva, mesa, reserva.getNombre(), dni, fecha, hora, estado);


                if (rd.modificarReserva(r)) {
                    count++;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex.getMessage());
        }

        if (count == jTable.getRowCount()) {
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Solo se actualizaron "+count+" de"+jTable.getRowCount()+" reservas\nla fecha/hora debe ser proxima a la actual ");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizar;
    private javax.swing.JPanel agregar;
    private javax.swing.JPanel contenido;
    private resto.componentes.CheckboxPersonalizada jCinactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private resto.componentes.TablaPersonalizada jTable;
    // End of variables declaration//GEN-END:variables
}
