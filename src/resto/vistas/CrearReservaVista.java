package resto.vistas;

import java.util.*;
import resto.dao.*;
import javax.swing.*;
import java.time.*;
import resto.entidades.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class CrearReservaVista extends javax.swing.JPanel {

    //atributos
    private javax.swing.JPanel tabSeleccionada;
    private Conexion con;
    private ReservaData rd;
    private MesaData md;

    //constructor
    public CrearReservaVista(Conexion con) {
        initComponents();
        con = new Conexion();
        rd = new ReservaData(con);
        md = new MesaData(con);
        jCactivo.setSelected(true);
        cargarMesas();
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
        agregar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        limpiar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        atras = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        jDfecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        cbMesas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        contenido.setBackground(new java.awt.Color(252, 252, 252));
        contenido.setPreferredSize(new java.awt.Dimension(780, 530));

        jTnombre.setBackground(new java.awt.Color(252, 252, 252));
        jTnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jTdni.setBackground(new java.awt.Color(252, 252, 252));
        jTdni.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jCactivo.setBackground(new java.awt.Color(252, 252, 252));
        jCactivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCactivo.setText("Activo");
        jCactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCactivoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Fecha:");

        jFhora.setBackground(new java.awt.Color(252, 252, 252));
        try {
            jFhora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Hora:");

        agregar.setBackground(new java.awt.Color(241, 207, 178));
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(114, 63, 50));
        jLabel6.setText("Agregar");

        javax.swing.GroupLayout agregarLayout = new javax.swing.GroupLayout(agregar);
        agregar.setLayout(agregarLayout);
        agregarLayout.setHorizontalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        agregarLayout.setVerticalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTcantidad.setBackground(new java.awt.Color(252, 252, 252));
        jTcantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jLabel7.setText("Cantidad personas:");

        limpiar.setBackground(new java.awt.Color(241, 207, 178));
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                limpiarMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(114, 63, 50));
        jLabel8.setText("Limpiar pantalla");

        javax.swing.GroupLayout limpiarLayout = new javax.swing.GroupLayout(limpiar);
        limpiar.setLayout(limpiarLayout);
        limpiarLayout.setHorizontalGroup(
            limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, limpiarLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        limpiarLayout.setVerticalGroup(
            limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, limpiarLayout.createSequentialGroup()
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

        cbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMesasActionPerformed(evt);
            }
        });

        jLabel10.setText("Mesas:");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jDfecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(agregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4))
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenidoLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenidoLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jCactivo))))
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contenidoLayout.createSequentialGroup()
                                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel9))
                                        .addGap(209, 209, 209))
                                    .addGroup(contenidoLayout.createSequentialGroup()
                                        .addComponent(jTnombre)
                                        .addGap(38, 38, 38)))
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(cbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        // TODO add your handling code here:
        try {
            String nombre = jTnombre.getText();
            Long dni = Long.parseLong(jTdni.getText());
            Boolean estado = jCactivo.isSelected();

            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            String fecha = formato.format(jDfecha.getDate());
            LocalDate fechaReserva = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            LocalTime hora = LocalTime.parse((String) jFhora.getText());

            int cantidad = Integer.parseInt(jTcantidad.getText());

            Mesa mesa = (Mesa) cbMesas.getSelectedItem();

            if (mesa.getCapacidad() < cantidad) {
                JOptionPane.showMessageDialog(null, "El numero de sillas no es suficiente para " + cantidad + " personas.\npor favor elija otra mesa!");
                mesa = null;
            } else {
                Reserva reserva = new Reserva(mesa, nombre, dni, fechaReserva, hora, estado);
                rd.agregarReserva(reserva);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe introducir un numero");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_agregarMouseClicked

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
        contenido.add(rv, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_atrasMouseClicked

    private void limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMousePressed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_limpiarMousePressed

    private void cargarMesas() {
        ArrayList<Mesa> listaMesas = md.listadoMesasActivas();

        for (Mesa item : listaMesas) {
            cbMesas.addItem(item);
        }
    }

    private void cbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesasActionPerformed
        // TODO add your handling code here:
        cargarMesas();
    }//GEN-LAST:event_cbMesasActionPerformed

    private void jCactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCactivoActionPerformed

    private void limpiarCampos() {
        jTnombre.setText("");
        jTdni.setText("");
        jTcantidad.setText("");
        jFhora.setText("");
        jDfecha.setDate(new Date());
        jCactivo.setSelected(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregar;
    private javax.swing.JPanel atras;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JComboBox<Mesa> cbMesas;
    private javax.swing.JPanel contenido;
    private javax.swing.JCheckBox jCactivo;
    private com.toedter.calendar.JDateChooser jDfecha;
    private javax.swing.JFormattedTextField jFhora;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTcantidad;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel limpiar;
    // End of variables declaration//GEN-END:variables
}
