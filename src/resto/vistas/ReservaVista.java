package resto.vistas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import resto.dao.Conexion;
import resto.dao.MesaData;
import resto.dao.ReservaData;
import resto.entidades.Mesa;
import resto.entidades.Reserva;

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

    void setearSeleccionado(JPanel panel) {
        panel.setBackground(Color.decode("#F1CFB2"));
        tabSeleccionada = panel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jCinactivo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new resto.componentes.TablaPersonalizada();
        jLabel4 = new javax.swing.JLabel();
        agregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        actualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        jCinactivo.setBackground(new java.awt.Color(252, 252, 252));
        jCinactivo.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jCinactivo.setForeground(new java.awt.Color(114, 63, 50));
        jCinactivo.setText("ver reservas inactivas");
        jCinactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCinactivoMousePressed(evt);
            }
        });
        jCinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCinactivoActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(204, 153, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num mesa", "Fecha", "Hora", "DNI", "Activo", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Boolean.class, java.lang.Integer.class
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenidoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCinactivo)))
                        .addGap(42, 42, 42))))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCinactivo)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
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

    public void armarCabeceraTabla() {

        ArrayList<Object> columns = new ArrayList<Object>();
        columns.add("Num mesa");
        columns.add("Fechha");
        columns.add("Hora");
        columns.add("DNI");
        columns.add("Activo");

        for (Object it : columns) {
            modelo.addColumn(it);
        }
        jTable.setModel(modelo);
    }

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
            modelo.addRow(new Object[]{r.getMesa().getNumMesa(), r.getFecha(), r.getHora(), r.getDni(), r.isActivo(), r.getIdReserva()});
        }
    }

    private void verActivas() {

        borrarFilas();
        ArrayList<Reserva> reservas = rd.obtenerReservas();

        for (Reserva r : reservas) {

            modelo.addRow(new Object[]{r.getMesa().getNumMesa(), r.getFecha(), r.getHora(), r.getDni(), r.isActivo(), r.getIdReserva()});
        }
    }

    private void jCinactivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCinactivoMousePressed
        // TODO add your handling code here:
        if (jCinactivo.isSelected()) {
            verInactivas();
        } else {
            verActivas();
        }
    }//GEN-LAST:event_jCinactivoMousePressed

    private void jCinactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCinactivoActionPerformed
        // TODO add your handling code here:
        if (jCinactivo.isSelected()) {
            verInactivas();
        } else {
            verActivas();
        }
    }//GEN-LAST:event_jCinactivoActionPerformed

    private void agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseEntered
       
    }//GEN-LAST:event_agregarMouseEntered

    private void agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseExited
        
    }//GEN-LAST:event_agregarMouseExited

    private void actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarMouseEntered

    private void actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarMouseExited

    private void actualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMousePressed
        // TODO add your handling code here:
        int filaSeleccionada = jTable.getSelectedRow();
        ActualizarReserva(filaSeleccionada);
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

    private void ActualizarReserva(int filaSeleccionada) {

        try {

            int numMesa = (int) jTable.getValueAt(filaSeleccionada, 0);
            LocalDate fecha = LocalDate.parse(jTable.getValueAt(filaSeleccionada, 1).toString());
            
//            String horaStr =  (String) ;
//            LocalTime hora = LocalTime.parse(horaStr);
            LocalTime hora = LocalTime.parse(jTable.getValueAt(filaSeleccionada, 2).toString());
            
            Long dni = (Long) jTable.getValueAt(filaSeleccionada, 3);
            Boolean estado = (Boolean) jTable.getValueAt(filaSeleccionada, 4);
            int idReserva = (int) jTable.getValueAt(filaSeleccionada, 5);

            Reserva reserva = rd.obtenerReserva(idReserva);
            Mesa mesa = md.obtenerMesa(numMesa);

            Reserva r = new Reserva(idReserva, mesa, reserva.getNombre(), dni, fecha, hora, estado);

            
            if(rd.modificarReserva(r)){
            JOptionPane.showMessageDialog(null, "Reserva actualizada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar reserva");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizar;
    private javax.swing.JPanel agregar;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnAgregar1;
    private javax.swing.JPanel btnAgregar2;
    private javax.swing.JPanel contenido;
    private javax.swing.JCheckBox jCinactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private resto.componentes.TablaPersonalizada jTable;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblAgregar1;
    private javax.swing.JLabel lblAgregar2;
    // End of variables declaration//GEN-END:variables
}
