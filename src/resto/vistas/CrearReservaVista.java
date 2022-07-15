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
import java.util.logging.Level;
import java.util.logging.Logger;

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
    jCactivo = new resto.componentes.CheckboxPersonalizada();
    actualizar = new javax.swing.JPanel();
    jLabel11 = new javax.swing.JLabel();
    idDe = new javax.swing.JLabel();

    jToolBar1.setRollover(true);

    contenido.setBackground(new java.awt.Color(252, 252, 252));
    contenido.setPreferredSize(new java.awt.Dimension(780, 530));

    jTnombre.setBackground(new java.awt.Color(252, 252, 252));
    jTnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(114, 63, 50)));

    jTdni.setBackground(new java.awt.Color(252, 252, 252));
    jTdni.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(114, 63, 50)));

    jLabel2.setText("Nombre:");

    jLabel3.setText("Dni:");

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
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        agregarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        agregarMouseExited(evt);
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
        .addContainerGap(22, Short.MAX_VALUE))
    );

    jTcantidad.setBackground(new java.awt.Color(252, 252, 252));
    jTcantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(114, 63, 50)));

    jLabel7.setText("Cantidad personas:");

    limpiar.setBackground(new java.awt.Color(241, 207, 178));
    limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        limpiarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        limpiarMouseExited(evt);
      }
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
    atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    atras.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        atrasMouseClicked(evt);
      }
    });

    btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
    btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        .addContainerGap()
        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(23, Short.MAX_VALUE))
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
    jLabel9.setText("Crear rerserva");

    cbMesas.setBorder(null);
    cbMesas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbMesasActionPerformed(evt);
      }
    });

    jLabel10.setText("Mesas:");

    jCactivo.setForeground(new java.awt.Color(114, 63, 50));
    jCactivo.setText("Activo");
    jCactivo.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jCactivoMousePressed(evt);
      }
    });

    actualizar.setBackground(new java.awt.Color(241, 207, 178));
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

    jLabel11.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(114, 63, 50));
    jLabel11.setText("Actualizar");

    javax.swing.GroupLayout actualizarLayout = new javax.swing.GroupLayout(actualizar);
    actualizar.setLayout(actualizarLayout);
    actualizarLayout.setHorizontalGroup(
      actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizarLayout.createSequentialGroup()
        .addContainerGap(64, Short.MAX_VALUE)
        .addComponent(jLabel11)
        .addGap(59, 59, 59))
    );
    actualizarLayout.setVerticalGroup(
      actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(actualizarLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(17, Short.MAX_VALUE))
    );

    idDe.setText("-ID de: ");

    javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
    contenido.setLayout(contenidoLayout);
    contenidoLayout.setHorizontalGroup(
      contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(contenidoLayout.createSequentialGroup()
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(contenidoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(contenidoLayout.createSequentialGroup()
            .addGap(93, 93, 93)
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(idDe)
              .addGroup(contenidoLayout.createSequentialGroup()
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jLabel4)
              .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                  .addComponent(jTdni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenidoLayout.createSequentialGroup()
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                          .addComponent(jDfecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(jTcantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                          .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addGroup(contenidoLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5))
                          .addGroup(contenidoLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jCactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                          .addGroup(contenidoLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel10))))))
        .addContainerGap(43, Short.MAX_VALUE))
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
        .addGap(36, 36, 36)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jLabel5))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jCactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(16, 16, 16)
        .addComponent(idDe)
        .addGap(18, 18, 18)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        int countCaracter = 0;
        try {

            String nombre = jTnombre.getText();
            Long dni = Long.parseLong("0");

            for (int i = 0; i < jTdni.getText().length(); i++) {
                countCaracter++;
            }

            //valido que el dni tenga <= 11 cararcterers
            if (countCaracter <= 11) {
                dni = Long.parseLong(jTdni.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Su dni supera el limite permitido");
                return;
            }

            Boolean estado = jCactivo.isSelected();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            String fecha = formato.format(jDfecha.getDate());
            LocalDate fechaReserva = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalTime hora = LocalTime.parse((String) jFhora.getText());
            int cantidad = Integer.parseInt(jTcantidad.getText());
            if(cantidad <= 0){
                JOptionPane.showMessageDialog(null, "Cantidad de personas incorecta");
                return;
            }

            Mesa mesa = (Mesa) cbMesas.getSelectedItem();

            //----valido campos----//
            if (mesa.getCapacidad() < cantidad) {
                JOptionPane.showMessageDialog(null, "El numero de sillas no es suficiente para " + cantidad + " personas.\npor favor elija otra mesa!");
                mesa = null;
            } else if (nombre.length() > 50) {
                JOptionPane.showMessageDialog(null, "Su nombre tiene exceso de caracteres");
            } else {
                Reserva reserva = new Reserva(mesa, nombre, dni, fechaReserva, hora, estado);
                rd.agregarReserva(reserva);

                //---- Consigo el id para setearlo a un Label ----//    
                int id = rd.obtenerId(reserva);
                idDe.setText("-ID de " + nombre + ": " + id + ".");
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe introducir un dato valido");
        } catch (Exception ex) {
            Logger.getLogger(CrearReservaVista.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_agregarMouseClicked

    void setearSeleccionado(JPanel panel) {
        panel.setBackground(Color.decode("#F1CFB2"));
        tabSeleccionada = panel;
    }

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
        limpiarCampos();
    }//GEN-LAST:event_limpiarMousePressed

    private void cargarMesas() {
        ArrayList<Mesa> listaMesas = md.listadoMesasActivas();

        for (Mesa item : listaMesas) {
            cbMesas.addItem(item);
        }
    }

    private void cbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesasActionPerformed
    }//GEN-LAST:event_cbMesasActionPerformed

    private void jCactivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCactivoMousePressed
    }//GEN-LAST:event_jCactivoMousePressed

    private void agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseEntered
        // TODO add your handling code here:
        agregar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_agregarMouseEntered

    private void agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseExited
        // TODO add your handling code here:
        agregar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_agregarMouseExited

    private void limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseEntered
        // TODO add your handling code here:
        limpiar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_limpiarMouseEntered

    private void limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseExited
        // TODO add your handling code here:
        limpiar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_limpiarMouseExited

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
        setearSeleccionado(agregar);

        ActualizarReservaVista arv = new ActualizarReservaVista(con);
        arv.setSize(780, 530);
        arv.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(arv, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_actualizarMousePressed

  private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
    setearSeleccionado(atras);

        ReservaVista rv = new ReservaVista(con);
        rv.setSize(780, 530);
        rv.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(rv, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
  }//GEN-LAST:event_btnVolverMousePressed

    private void limpiarCampos() {
        jTnombre.setText("");
        jTdni.setText("");
        jTcantidad.setText("");
        jFhora.setText("");
        jDfecha.setDate(new Date());
        jCactivo.setSelected(true);

    }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel actualizar;
  private javax.swing.JPanel agregar;
  private javax.swing.JPanel atras;
  private javax.swing.JLabel btnVolver;
  private javax.swing.JComboBox<Mesa> cbMesas;
  private javax.swing.JPanel contenido;
  private javax.swing.JLabel idDe;
  private resto.componentes.CheckboxPersonalizada jCactivo;
  private com.toedter.calendar.JDateChooser jDfecha;
  private javax.swing.JFormattedTextField jFhora;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
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
