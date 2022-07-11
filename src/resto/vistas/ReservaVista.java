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

    private javax.swing.JPanel tabSeleccionada;
    private Conexion con;
    private ReservaData rd;
    private MesaData md;
    private DefaultTableModel modelo;

    public ReservaVista(Conexion con) {
        initComponents();
        con = new Conexion();
        rd = new ReservaData(con);
        md = new MesaData(con);
        modelo = (DefaultTableModel) jTable.getModel();

        jTable.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 12));
        jTable.getTableHeader().setOpaque(false);
        jTable.getTableHeader().setBackground(Color.GREEN);
        jTable.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable.setRowHeight(25);
        
        verActivas();

    }

    void setearSeleccionado(JPanel panel) {
        panel.setBackground(Color.decode("#F1CFB2"));
        tabSeleccionada = panel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jCinactivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        añadir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        actualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        contenido.setBackground(new java.awt.Color(255, 204, 204));
        contenido.setPreferredSize(new java.awt.Dimension(780, 530));
        contenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contenidoMouseClicked(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(255, 204, 204));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Num mesa", "Fecha", "Hora", "DNI", "Activo", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Boolean.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setFocusable(false);
        jTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable.setRowHeight(25);
        jTable.setShowVerticalLines(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        jCinactivo.setBackground(new java.awt.Color(255, 204, 204));
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Reservas");

        añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirMouseClicked(evt);
            }
        });

        jLabel2.setText("Añadir reserva");

        javax.swing.GroupLayout añadirLayout = new javax.swing.GroupLayout(añadir);
        añadir.setLayout(añadirLayout);
        añadirLayout.setHorizontalGroup(
            añadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, añadirLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );
        añadirLayout.setVerticalGroup(
            añadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(añadirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actualizarMousePressed(evt);
            }
        });

        jLabel3.setText("Actualizar");

        javax.swing.GroupLayout actualizarLayout = new javax.swing.GroupLayout(actualizar);
        actualizar.setLayout(actualizarLayout);
        actualizarLayout.setHorizontalGroup(
            actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        actualizarLayout.setVerticalGroup(
            actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCinactivo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCinactivo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
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
        initComponents();
        setearSeleccionado(contenido);

        VistaPrincipal vp = new VistaPrincipal();
        ReservaVista rv = new ReservaVista(con);     //prueba para ver la reserva
        rv.setSize(780, 530);
        rv.setLocation(0, 0);

        contenido.removeAll();
        //contenido.add(vp, BorderLayout.CENTER);
        contenido.add(rv, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_contenidoMouseClicked

    private void añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseClicked
        // TODO add your handling code here:

        setearSeleccionado(añadir);

        CrearReservaVista crv = new CrearReservaVista(con);
        crv.setSize(780, 530);
        crv.setLocation(0, 0);

        contenido.removeAll();
        //contenido.add(vp, BorderLayout.CENTER);
        contenido.add(crv, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_añadirMouseClicked

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

    private void ActualizarReserva(int filaSeleccionada){
        
        try{
            
        int numMesa = (int) jTable.getValueAt(filaSeleccionada, 0);


        LocalDate fecha = (LocalDate) jTable.getValueAt(filaSeleccionada, 1);
        LocalTime hora =(LocalTime) jTable.getValueAt(filaSeleccionada, 2);
        Long dni = (Long) jTable.getValueAt(filaSeleccionada, 3);
        Boolean estado = (Boolean) jTable.getValueAt(filaSeleccionada, 4);
        int idReserva = (int) jTable.getValueAt(filaSeleccionada, 5);
        
        Reserva reserva = rd.obtenerReserva(idReserva);
        Mesa mesa = md.obtenerMesa(numMesa);
        
        Reserva r = new Reserva(idReserva, mesa, reserva.getNombre(), dni, fecha, hora, estado);
        
        rd.modificarReserva(r);
          System.out.println(r.toString());
        JOptionPane.showMessageDialog(null, "actualizado");
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error "+ex);
                }
        
    }
     
    
    private void actualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMousePressed
        // TODO add your handling code here:
        int filaSeleccionada = jTable.getSelectedRow();
        ActualizarReserva(filaSeleccionada);
    }//GEN-LAST:event_actualizarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizar;
    private javax.swing.JPanel añadir;
    private javax.swing.JPanel contenido;
    private javax.swing.JCheckBox jCinactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
