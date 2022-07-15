package resto.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import resto.dao.Conexion;
import resto.dao.MesaData;
import resto.dao.ReservaData;
import resto.entidades.Mesa;
import resto.entidades.Reserva;

public class ActualizarReservaVista extends javax.swing.JPanel {

    //atributos
    private javax.swing.JPanel tabSeleccionada;
    private Conexion con;
    private ReservaData rd;
    private MesaData md;

    public ActualizarReservaVista(Conexion con) {
        initComponents();
        initComponents();
        con = new Conexion();
        rd = new ReservaData(con);
        md = new MesaData(con);
        cargarMesas();
        actualizar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    contenido = new javax.swing.JPanel();
    jTnombre = new javax.swing.JTextField();
    jTdni = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jFhora = new javax.swing.JFormattedTextField();
    jLabel5 = new javax.swing.JLabel();
    actualizar = new javax.swing.JPanel();
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
    buscarXId = new javax.swing.JPanel();
    jLabel12 = new javax.swing.JLabel();
    jTid = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    numMesa = new javax.swing.JLabel();

    contenido.setBackground(new java.awt.Color(252, 252, 252));
    contenido.setPreferredSize(new java.awt.Dimension(780, 530));

    jTnombre.setBackground(new java.awt.Color(252, 252, 252));
    jTnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(114, 63, 50)));
    jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        jTnombreKeyTyped(evt);
      }
    });

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

    actualizar.setBackground(new java.awt.Color(241, 207, 178));
    actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        actualizarMouseClicked(evt);
      }
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

    jLabel6.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(114, 63, 50));
    jLabel6.setText("Actualizar");

    javax.swing.GroupLayout actualizarLayout = new javax.swing.GroupLayout(actualizar);
    actualizar.setLayout(actualizarLayout);
    actualizarLayout.setHorizontalGroup(
      actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(actualizarLayout.createSequentialGroup()
        .addGap(58, 58, 58)
        .addComponent(jLabel6)
        .addContainerGap(63, Short.MAX_VALUE))
    );
    actualizarLayout.setVerticalGroup(
      actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(actualizarLayout.createSequentialGroup()
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
    jLabel9.setText("Actualizar reserva");

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

    buscarXId.setBackground(new java.awt.Color(241, 207, 178));
    buscarXId.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        buscarXIdMouseEntered(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        buscarXIdMousePressed(evt);
      }
    });

    jLabel12.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(114, 63, 50));
    jLabel12.setText("Buscar");

    javax.swing.GroupLayout buscarXIdLayout = new javax.swing.GroupLayout(buscarXId);
    buscarXId.setLayout(buscarXIdLayout);
    buscarXIdLayout.setHorizontalGroup(
      buscarXIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(buscarXIdLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(jLabel12)
        .addContainerGap(16, Short.MAX_VALUE))
    );
    buscarXIdLayout.setVerticalGroup(
      buscarXIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(buscarXIdLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(jLabel12)
        .addContainerGap(15, Short.MAX_VALUE))
    );

    jTid.setBackground(new java.awt.Color(252, 252, 252));
    jTid.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(114, 63, 50)));

    jLabel13.setText("Id:");

    jLabel14.setText("Numero de mesa:");

    numMesa.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
    numMesa.setForeground(new java.awt.Color(114, 63, 50));

    javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
    contenido.setLayout(contenidoLayout);
    contenidoLayout.setHorizontalGroup(
      contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(contenidoLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(contenidoLayout.createSequentialGroup()
        .addGap(93, 93, 93)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(contenidoLayout.createSequentialGroup()
            .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
          .addGroup(contenidoLayout.createSequentialGroup()
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
              .addComponent(jTdni, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
              .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel2)
                  .addComponent(jLabel9)
                  .addComponent(jLabel3)
                  .addGroup(contenidoLayout.createSequentialGroup()
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jTcantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel5)
                      .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addComponent(jLabel4)
                  .addGroup(contenidoLayout.createSequentialGroup()
                    .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(jCactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(306, 306, 306))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(contenidoLayout.createSequentialGroup()
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(numMesa))
                  .addGroup(contenidoLayout.createSequentialGroup()
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel13)
                      .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(buscarXId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
              .addGroup(contenidoLayout.createSequentialGroup()
                .addComponent(cbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())))))
    );
    contenidoLayout.setVerticalGroup(
      contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(contenidoLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(4, 4, 4)
        .addComponent(jLabel9)
        .addGap(18, 18, 18)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(contenidoLayout.createSequentialGroup()
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(jLabel13))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(buscarXId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel14)
          .addComponent(numMesa))
        .addGap(1, 1, 1)
        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(contenidoLayout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel7)
              .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(40, 40, 40)
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(contenidoLayout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(46, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 780, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 530, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
  }// </editor-fold>//GEN-END:initComponents

    void setearSeleccionado(JPanel panel) {
        panel.setBackground(Color.decode("#F1CFB2"));
        tabSeleccionada = panel;
    }

    private void actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarMouseClicked

    private void limpiarCampos() {
        jTnombre.setText("");
        jTdni.setText("");
        jTcantidad.setText("");
        jFhora.setText("");
        jDfecha.setDate(new Date());
        jCactivo.setSelected(true);
        jTid.setText("");
        numMesa.setText("");
        actualizar.setVisible(false);

    }

    private void limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMousePressed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_limpiarMousePressed

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

    private void cargarMesas() {
        ArrayList<Mesa> listaMesas = md.listadoMesasActivas();

        for (Mesa item : listaMesas) {
            cbMesas.addItem(item);
        }
    }


    private void cbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbMesasActionPerformed

    private void jCactivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCactivoMousePressed

    }//GEN-LAST:event_jCactivoMousePressed

    private void llenarCampos(int id) {
        Reserva reserva = rd.obtenerReserva(id);

        jTnombre.setText(reserva.getNombre());
        jTdni.setText(reserva.getDni() + "");
        jFhora.setText(reserva.getHora() + "");
        jDfecha.setDate(java.sql.Date.valueOf(reserva.getFecha()));
        jCactivo.setSelected(reserva.isActivo());
        numMesa.setText(reserva.getMesa().getNumMesa() + "");
        Mesa mesa = md.obtenerMesa(reserva.getMesa().getNumMesa());
        jTcantidad.setText(mesa.getCapacidad() + "");

    }

    private void buscarXIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarXIdMousePressed
        // TODO add your handling code here:
        actualizar.setVisible(true);

        int idReserva = Integer.parseInt(jTid.getText());
        llenarCampos(idReserva);
    }//GEN-LAST:event_buscarXIdMousePressed

    private void actualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMousePressed

        int countCaracter = 0;
        
        try {
            int id = Integer.parseInt(jTid.getText());
            Reserva r = rd.obtenerReserva(id);
            Long dni = Long.parseLong("0"); 
            String nombre = jTnombre.getText();
            
            for(int i=0;i<jTdni.getText().length();i++){
                countCaracter++;
            }
            
            if(countCaracter <= 11){
            dni = Long.parseLong(jTdni.getText());    
            }else{
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
                JOptionPane.showMessageDialog(null, "Cantidad de personas incorrecta");
            }
   
            Mesa mesa = (Mesa) cbMesas.getSelectedItem();

            //----valido campos----//
            
            if (mesa.getCapacidad() < cantidad) {
                JOptionPane.showMessageDialog(null, "El numero de sillas no es suficiente para " + cantidad + " personas.\npor favor elija otra mesa!");
                mesa = null;
            } else if (nombre.length() > 50) {
                JOptionPane.showMessageDialog(null, "Su nombre tiene exceso de caracteres");
            } else {
                Reserva reserva = new Reserva(r.getIdReserva(), mesa, nombre, dni, fechaReserva, hora, estado);
                rd.modificarReserva(reserva);
                return;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe introducir un numero");
        }
    }//GEN-LAST:event_actualizarMousePressed

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped

    }//GEN-LAST:event_jTnombreKeyTyped

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

    private void buscarXIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarXIdMouseEntered
        // TODO add your handling code here:
        buscarXId.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_buscarXIdMouseEntered


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel actualizar;
  private javax.swing.JPanel atras;
  private javax.swing.JLabel btnVolver;
  private javax.swing.JPanel buscarXId;
  private javax.swing.JComboBox<Mesa> cbMesas;
  private javax.swing.JPanel contenido;
  private resto.componentes.CheckboxPersonalizada jCactivo;
  private com.toedter.calendar.JDateChooser jDfecha;
  private javax.swing.JFormattedTextField jFhora;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField jTcantidad;
  private javax.swing.JTextField jTdni;
  private javax.swing.JTextField jTid;
  private javax.swing.JTextField jTnombre;
  private javax.swing.JPanel limpiar;
  private javax.swing.JLabel numMesa;
  // End of variables declaration//GEN-END:variables
}
