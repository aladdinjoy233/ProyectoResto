
package resto.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import resto.dao.Conexion;
import resto.dao.ReservaData;
import resto.entidades.Mesa;
import resto.entidades.Reserva;

public class CrearReservaVista extends javax.swing.JPanel {

     private javax.swing.JPanel tabSeleccionada;
    private Conexion con;
    private ReservaData rd;
    
    public CrearReservaVista(Conexion con) {
        initComponents();
        con = new Conexion();
        rd = new ReservaData(con);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        contenido = new javax.swing.JPanel();
        jTnombre = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jCactivo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFhora = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        atras = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        jDfecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        contenido.setBackground(new java.awt.Color(252, 252, 252));
        contenido.setPreferredSize(new java.awt.Dimension(780, 530));

        jTnombre.setBackground(new java.awt.Color(217, 177, 142));
        jTnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jTdni.setBackground(new java.awt.Color(217, 177, 142));
        jTdni.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jCactivo.setBackground(new java.awt.Color(252, 252, 252));
        jCactivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCactivo.setText("Activo");

        jLabel2.setText("Nombre:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Fecha:");

        jFhora.setBackground(new java.awt.Color(217, 177, 142));
        try {
            jFhora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Hora:");

        jPanel1.setBackground(new java.awt.Color(241, 207, 178));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(114, 63, 50));
        jLabel6.setText("Agregar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTcantidad.setBackground(new java.awt.Color(217, 177, 142));
        jTcantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jLabel7.setText("Cantidad personas:");

        jPanel2.setBackground(new java.awt.Color(241, 207, 178));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(114, 63, 50));
        jLabel8.setText("Limpiar pantalla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );

        atras.setBackground(new java.awt.Color(252, 252, 252));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout atrasLayout = new javax.swing.GroupLayout(atras);
        atras.setLayout(atrasLayout);
        atrasLayout.setHorizontalGroup(
            atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atrasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVolver)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        atrasLayout.setVerticalGroup(
            atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(114, 63, 50));
        jLabel9.setText("Reservas");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTdni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenidoLayout.createSequentialGroup()
                                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(71, 71, 71)
                                .addComponent(jCactivo))
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDfecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        try{
        String nombre = jTnombre.getText();
        Long dni = Long.parseLong(jTdni.getText());
        Boolean estado = jCactivo.isSelected();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formato.format(jDfecha.getDate());
        LocalDate fechaReserva = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        
        LocalTime hora = LocalTime.parse(jFhora.getText());
        int cantidad = Integer.parseInt(jTcantidad.getText());
        
        Mesa mesa = new Mesa(1,cantidad, true, true);
        Reserva reserva = new Reserva(mesa, nombre, dni, fechaReserva, hora, estado);
        
        rd.agregarReserva(reserva);
        
        }catch(NumberFormatException ex){
             JOptionPane.showMessageDialog(null, "Debe introducir un numero");
        }catch(NullPointerException ex){
             JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_jPanel1MouseClicked

     void setearSeleccionado(JPanel panel) {
        panel.setBackground(Color.decode("#F1CFB2"));
        tabSeleccionada = panel;
    }
    
    private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
     
    }//GEN-LAST:event_btnVolverMousePressed

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        // TODO add your handling code here:
        setearSeleccionado(atras);

        ReservaVista rv = new ReservaVista(con);
        rv.setSize(780, 530);
        rv.setLocation(0, 0);

        contenido.removeAll();
        //contenido.add(vp, BorderLayout.CENTER);
        contenido.add(rv, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_atrasMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jPanel2MousePressed

  private void limpiarCampos(){
      jTnombre.setText("");
      jTdni.setText("");
      jTcantidad.setText("");
      jFhora.setText("");
      jDfecha.setDate(new Date());
      jCactivo.setSelected(true);
      
  }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atras;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel contenido;
    private javax.swing.JCheckBox jCactivo;
    private com.toedter.calendar.JDateChooser jDfecha;
    private javax.swing.JFormattedTextField jFhora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTcantidad;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
