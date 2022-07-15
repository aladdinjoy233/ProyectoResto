package resto.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import resto.dao.Conexion;
import resto.dao.MesaData;
import resto.dao.MeseroData;
import resto.dao.PedidoData;
import resto.entidades.Mesa;
import resto.entidades.Mesero;
import resto.entidades.Pedido;

public class HistorialVista extends javax.swing.JPanel {

  private Conexion con;
  private MesaData md;
  private MeseroData ms;
  private PedidoData pedData;
  private DefaultTableModel model;
  private ArrayList<Pedido> pedidos;
  private ArrayList<Mesa> mesas;
  private ArrayList<Mesero> meseros;

  public HistorialVista(Conexion con) {
    initComponents();
    this.con = con;
    model = (DefaultTableModel) tablaPedidos.getModel();
    tablaPedidos.arreglarTabla(jScrollPane1);
    pedData = new PedidoData(con);
    md = new MesaData(con);
    ms = new MeseroData(con);

    cargarDatos();
    cargarMesas();
    cargarMeseros();
    resetearCampos();

    if (tablaPedidos.getSelectedRows().length == 1) {
      enableButton(jpFondoVerDetalle, jbVerDetalle);
    } else {
      disableButton(jpFondoVerDetalle, jbVerDetalle);
    }

    enableButton(jpFondoBuscar, jbBuscar);
    enableButton(jpFondoResetear, jbResetear);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    escritorio = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaPedidos = new resto.componentes.TablaPersonalizada();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jdtHasta = new com.toedter.calendar.JDateChooser();
    jdtDesde = new com.toedter.calendar.JDateChooser();
    jcbMesas = new javax.swing.JComboBox<>();
    jpFondoBuscar = new javax.swing.JPanel();
    jbBuscar = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jcbMesero = new javax.swing.JComboBox<>();
    jLabel6 = new javax.swing.JLabel();
    jcbPagados = new javax.swing.JComboBox<>();
    jLabel7 = new javax.swing.JLabel();
    jcbActivos = new javax.swing.JComboBox<>();
    jpFondoResetear = new javax.swing.JPanel();
    jbResetear = new javax.swing.JLabel();
    jpFondoVerDetalle = new javax.swing.JPanel();
    jbVerDetalle = new javax.swing.JLabel();
    jftHoraHasta = new javax.swing.JFormattedTextField();
    jftHoraDesde = new javax.swing.JFormattedTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(780, 530));

    escritorio.setBackground(new java.awt.Color(240, 239, 239));

    tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null}
      },
      new String [] {
        "Mesa", "Mesero", "Fecha", "Hora", "Pagado", "Total", "Activo"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tablaPedidosMousePressed(evt);
      }
    });
    jScrollPane1.setViewportView(tablaPedidos);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(114, 63, 50));
    jLabel1.setText("Historial de Pedidos");

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(114, 63, 50));
    jLabel2.setText("Mesas");

    jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(114, 63, 50));
    jLabel3.setText("Desde");

    jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(114, 63, 50));
    jLabel4.setText("Hasta");

    jcbMesas.setBorder(null);
    jcbMesas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbMesasActionPerformed(evt);
      }
    });

    jpFondoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    jbBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jbBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jbBuscar.setText("Buscar");
    jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        jbBuscarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        jbBuscarMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jbBuscarMousePressed(evt);
      }
    });

    javax.swing.GroupLayout jpFondoBuscarLayout = new javax.swing.GroupLayout(jpFondoBuscar);
    jpFondoBuscar.setLayout(jpFondoBuscarLayout);
    jpFondoBuscarLayout.setHorizontalGroup(
      jpFondoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jpFondoBuscarLayout.setVerticalGroup(
      jpFondoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
    );

    jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(114, 63, 50));
    jLabel5.setText("Mesero");

    jcbMesero.setBorder(null);
    jcbMesero.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbMeseroActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(114, 63, 50));
    jLabel6.setText("Pagados");

    jcbPagados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

    jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(114, 63, 50));
    jLabel7.setText("Activos");

    jcbActivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

    jpFondoResetear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    jbResetear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jbResetear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jbResetear.setText("Resetear");
    jbResetear.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        jbResetearMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        jbResetearMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jbResetearMousePressed(evt);
      }
    });

    javax.swing.GroupLayout jpFondoResetearLayout = new javax.swing.GroupLayout(jpFondoResetear);
    jpFondoResetear.setLayout(jpFondoResetearLayout);
    jpFondoResetearLayout.setHorizontalGroup(
      jpFondoResetearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jbResetear, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jpFondoResetearLayout.setVerticalGroup(
      jpFondoResetearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jbResetear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
    );

    jpFondoVerDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    jbVerDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jbVerDetalle.setForeground(new java.awt.Color(114, 63, 50));
    jbVerDetalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jbVerDetalle.setText("Ver Detalles");
    jbVerDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jbVerDetalleMousePressed(evt);
      }
    });

    javax.swing.GroupLayout jpFondoVerDetalleLayout = new javax.swing.GroupLayout(jpFondoVerDetalle);
    jpFondoVerDetalle.setLayout(jpFondoVerDetalleLayout);
    jpFondoVerDetalleLayout.setHorizontalGroup(
      jpFondoVerDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jbVerDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
    );
    jpFondoVerDetalleLayout.setVerticalGroup(
      jpFondoVerDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jbVerDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
    );

    jftHoraHasta.setBackground(new java.awt.Color(252, 252, 252));
    try {
      jftHoraHasta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    jftHoraDesde.setBackground(new java.awt.Color(252, 252, 252));
    try {
      jftHoraDesde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    jLabel8.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
    jLabel8.setText("Hora desde");

    jLabel9.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
    jLabel9.setText("Hora hasta");

    javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
    escritorio.setLayout(escritorioLayout);
    escritorioLayout.setHorizontalGroup(
      escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(escritorioLayout.createSequentialGroup()
        .addGap(53, 53, 53)
        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(escritorioLayout.createSequentialGroup()
            .addComponent(jLabel1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(escritorioLayout.createSequentialGroup()
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jdtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jcbPagados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jftHoraDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jftHoraHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jdtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jpFondoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFondoResetear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(45, Short.MAX_VALUE))))
      .addGroup(escritorioLayout.createSequentialGroup()
        .addGap(344, 344, 344)
        .addComponent(jpFondoVerDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    escritorioLayout.setVerticalGroup(
      escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(escritorioLayout.createSequentialGroup()
        .addGap(54, 54, 54)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(escritorioLayout.createSequentialGroup()
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jdtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jLabel4))
            .addGap(7, 7, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jftHoraHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbPagados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jftHoraDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8)
                .addComponent(jLabel9)))
            .addGap(18, 18, 18)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFondoResetear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jpFondoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))))
          .addGroup(escritorioLayout.createSequentialGroup()
            .addComponent(jdtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addGap(13, 13, 13)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jpFondoVerDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(29, 29, 29))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  }// </editor-fold>//GEN-END:initComponents

    private void jcbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesasActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jcbMesasActionPerformed

    private void jcbMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeseroActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jcbMeseroActionPerformed

    private void jbBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMousePressed
      String activo = null, pagado = null,horaDesde=null,horaHasta=null;
      String desde = null, hasta = null;
      Mesa mesa;
      Mesero mesero;

      if (tablaPedidos.getSelectedRows().length == 1) {
        enableButton(jpFondoVerDetalle, jbVerDetalle);
      } else {
        disableButton(jpFondoVerDetalle, jbVerDetalle);
      }

      if (jcbActivos.getSelectedItem() != null) {
        activo = jcbActivos.getSelectedItem().toString();
      }

      if (jcbPagados.getSelectedItem() != null) {
        pagado = jcbPagados.getSelectedItem().toString();
      }

      mesa = (Mesa) jcbMesas.getSelectedItem();
      mesero = (Mesero) jcbMesero.getSelectedItem();

      SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

      if (jdtDesde.getDate() != null) {
        String fecha1 = formato.format(jdtDesde.getDate());
        desde = LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
      }

      if (jdtHasta.getDate() != null) {
        String fecha2 = formato.format(jdtHasta.getDate());
        hasta = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
      }
      
      if (jftHoraDesde.getText().trim().length()>1){
          horaDesde = LocalTime.parse((String) jftHoraDesde.getText()).toString();
      }
      
      if (jftHoraDesde.getText().trim().length()>1){
          horaHasta = LocalTime.parse((String) jftHoraHasta.getText()).toString();
      }
      
      if (jdtDesde.getDate() != null && jdtHasta.getDate() == null) {
        hasta = desde;
      }

      buscar(activo, pagado, mesa, mesero, desde, hasta,horaDesde,horaHasta);
    }//GEN-LAST:event_jbBuscarMousePressed

    private void jbResetearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbResetearMousePressed
      if (tablaPedidos.getSelectedRows().length == 1) {
        enableButton(jpFondoVerDetalle, jbVerDetalle);
      } else {
        disableButton(jpFondoVerDetalle, jbVerDetalle);
      }
      resetearCampos();
      //cargarDatos();
    }//GEN-LAST:event_jbResetearMousePressed

    private void jbBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseEntered
      jpFondoBuscar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbBuscarMouseEntered

    private void jbBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseExited
      jpFondoBuscar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbBuscarMouseExited

    private void jbResetearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbResetearMouseEntered
      jpFondoResetear.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbResetearMouseEntered

    private void jbResetearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbResetearMouseExited
      jpFondoResetear.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbResetearMouseExited

    private void tablaPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidosMousePressed
      if (tablaPedidos.getSelectedRows().length == 1) {
        enableButton(jpFondoVerDetalle, jbVerDetalle);
      } else {
        disableButton(jpFondoVerDetalle, jbVerDetalle);
      }
    }//GEN-LAST:event_tablaPedidosMousePressed

    private void jbVerDetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVerDetalleMousePressed
      if (tablaPedidos.getSelectedRows().length != 1) {
        return;
      }

      Pedido selectedPedido = pedidos.get(tablaPedidos.getSelectedRow());

      DetallesPedidoHistorial dph = new DetallesPedidoHistorial(con, selectedPedido);
      dph.setSize(780, 530);
      dph.setLocation(0, 0);
      
      escritorio.setPreferredSize(new Dimension(780, 530));
        escritorio.setMinimumSize(new Dimension(780, 530));
        escritorio.setMaximumSize(new Dimension(780, 530));

      escritorio.removeAll();
      escritorio.add(dph, BorderLayout.CENTER);
      escritorio.revalidate();
      escritorio.repaint();
    }//GEN-LAST:event_jbVerDetalleMousePressed

  private void cargarDatos() {

    model.setRowCount(0);

    NumberFormat decimalFormatter = new DecimalFormat("#0.00");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    pedidos = new ArrayList<>();

    pedidos = pedData.obtenerPedidos();

    Collections.sort(pedidos, new Comparator<Pedido>() {
      @Override
      public int compare(Pedido t, Pedido t1) {
        return t.getFecha().compareTo(t1.getFecha());
      }
    });

    pedidos.forEach(pedido -> {
      
      double precio;

      if (pedido.isPagado()) {
        precio = pedido.getSubtotal();
      } else {
        precio = pedData.obtenerSubtotalDelPedido(pedido.getIdPedido());
      }

      model.addRow(new Object[]{
        pedido.getMesa().getNumMesa(),
        pedido.getMesero().getNombre() + " " + pedido.getMesero().getApellido(),
        pedido.getFecha().format(dateFormatter),
        pedido.getHora().format(timeFormatter),
        pedido.isPagado() ? "Si" : "No",
        ("$" + decimalFormatter.format(precio)),
        pedido.isActivo() ? "Si" : "No"
      });

    });
  }

  private void cargarMesas() {
    ArrayList<Mesa> listaMesas = md.listadoMesasActivas();
    for (Mesa item : listaMesas) {
      jcbMesas.addItem(item);
    }
  }

  private void cargarMeseros() {                              // no trae nada
    ArrayList<Mesero> listaMeseros = ms.obtenerMeseros();

    for (Mesero item : listaMeseros) {
      jcbMesero.addItem(item);
    }
  }

  private void buscar(String activo, String pagado, Mesa mesa, Mesero mesero, String desde, String hasta,String horaDesde,String horaHasta) {
    model.setRowCount(0);

    NumberFormat decimalFormatter = new DecimalFormat("#0.00");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    pedidos = new ArrayList<>();

    pedidos = pedData.obtenerPedidosBuscados(activo, pagado, mesa, mesero, desde, hasta,horaDesde,horaHasta);

    Collections.sort(pedidos, new Comparator<Pedido>() {
      @Override
      public int compare(Pedido t, Pedido t1) {
        return t.getFecha().compareTo(t1.getFecha());
      }
    });

    pedidos.forEach(pedido -> {

      double precio = pedData.obtenerSubtotalDelPedido(pedido.getIdPedido());

      model.addRow(new Object[]{
        pedido.getMesa().getNumMesa(),
        pedido.getMesero().getNombre() + " " + pedido.getMesero().getApellido(),
        pedido.getFecha().format(dateFormatter),
        pedido.getHora().format(timeFormatter),
        pedido.isPagado() ? "Si" : "No",
        ("$" + decimalFormatter.format(precio)),
        pedido.isActivo() ? "Si" : "No"
      });

    });
  }

  private void resetearCampos() {
    jcbMesas.setSelectedIndex(-1);
    jcbMesero.setSelectedIndex(-1);
    jdtDesde.setDate(null);
    jdtHasta.setDate(null);
    jcbPagados.setSelectedIndex(-1);
    jcbActivos.setSelectedIndex(-1);
    jftHoraDesde.setText(null);
    jftHoraHasta.setText(null);
    
    cargarDatos();
  }

  public void disableButton(JPanel panel, JLabel label) {
    panel.setBackground(Color.LIGHT_GRAY);
    label.setForeground(Color.GRAY);
  }

  public void enableButton(JPanel panel, JLabel label) {
    panel.setBackground(Color.decode("#F1CFB2"));
    label.setForeground(Color.decode("#723F32"));
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel escritorio;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel jbBuscar;
  private javax.swing.JLabel jbResetear;
  private javax.swing.JLabel jbVerDetalle;
  private javax.swing.JComboBox<String> jcbActivos;
  private javax.swing.JComboBox<Mesa> jcbMesas;
  private javax.swing.JComboBox<Mesero> jcbMesero;
  private javax.swing.JComboBox<String> jcbPagados;
  private com.toedter.calendar.JDateChooser jdtDesde;
  private com.toedter.calendar.JDateChooser jdtHasta;
  private javax.swing.JFormattedTextField jftHoraDesde;
  private javax.swing.JFormattedTextField jftHoraHasta;
  private javax.swing.JPanel jpFondoBuscar;
  private javax.swing.JPanel jpFondoResetear;
  private javax.swing.JPanel jpFondoVerDetalle;
  private resto.componentes.TablaPersonalizada tablaPedidos;
  // End of variables declaration//GEN-END:variables
}
