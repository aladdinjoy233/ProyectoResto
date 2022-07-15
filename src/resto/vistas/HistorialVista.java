/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.vistas;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import resto.dao.Conexion;
import resto.dao.MesaData;
import resto.dao.MeseroData;
import resto.dao.PedidoData;
import resto.entidades.Mesa;
import resto.entidades.Mesero;
import resto.entidades.Pedido;

/**
 *
 * @author Valeria
 */
public class HistorialVista extends javax.swing.JPanel {
    private Conexion con;
    private MesaData md;
    private MeseroData ms;
    private PedidoData pedData;
    private DefaultTableModel model;
  private ArrayList<Pedido> pedidos;
  private ArrayList<Mesa> mesas;
    
    public HistorialVista(Conexion con) {
        initComponents();
        this.con = con;
        model = (DefaultTableModel) tablaPedidos.getModel();
        tablaPedidos.arreglarTabla(jScrollPane1);
        pedData = new PedidoData(con);
        md = new MesaData(con);
      ms = new MeseroData(con);

      mesas = md.listadoMesasActivas();

      mesas.forEach(mesa -> {
        jcbMesas.addItem(mesa);
      });

      cargarDatos();
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
    jchPagados = new resto.componentes.CheckboxPersonalizada();
    jchInactivos = new resto.componentes.CheckboxPersonalizada();

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
    jScrollPane1.setViewportView(tablaPedidos);

    jLabel1.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(114, 63, 50));
    jLabel1.setText("Historial de Pedidos");

    jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
    jLabel2.setText("Mesas");

    jLabel3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
    jLabel3.setText("Desde");

    jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
    jLabel4.setText("Hasta");

    jcbMesas.setBorder(null);
    jcbMesas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbMesasActionPerformed(evt);
      }
    });

    jbBuscar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
    jbBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jbBuscar.setText("Buscar");
    jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
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

    jLabel5.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
    jLabel5.setText("Mesero");

    jcbMesero.setBorder(null);
    jcbMesero.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbMeseroActionPerformed(evt);
      }
    });

    jchPagados.setText("Pagados");
    jchPagados.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jchPagadosActionPerformed(evt);
      }
    });

    jchInactivos.setText("Inactivos");
    jchInactivos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jchInactivosActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
    escritorio.setLayout(escritorioLayout);
    escritorioLayout.setHorizontalGroup(
      escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(escritorioLayout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addGroup(escritorioLayout.createSequentialGroup()
            .addGap(1, 1, 1)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jdtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jchPagados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jchInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jdtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                    .addComponent(jpFondoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61))))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(51, Short.MAX_VALUE))
    );
    escritorioLayout.setVerticalGroup(
      escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(escritorioLayout.createSequentialGroup()
        .addGap(75, 75, 75)
        .addComponent(jLabel1)
        .addGap(27, 27, 27)
        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(escritorioLayout.createSequentialGroup()
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel4))
              .addComponent(jdtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jchPagados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jchInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jpFondoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(19, 19, 19)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jdtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(64, Short.MAX_VALUE))
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

    private void jcbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMesasActionPerformed

    private void jcbMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMeseroActionPerformed

    private void jbBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMousePressed
        boolean inactivo,pagado;
        String desde = null,hasta = null;
        Mesa mesa;
        Mesero mesero;
        
      inactivo = !jchInactivos.isSelected();
      pagado = jchPagados.isSelected();
        mesa = (Mesa) jcbMesas.getSelectedItem();
        mesero = (Mesero) jcbMesero.getSelectedItem();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        
        if(jdtDesde.getDate() != null){
            String fecha1 = formato.format(jdtDesde.getDate());
            desde = LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString(); 
        }
 
        if(jdtHasta.getDate() != null){
            String fecha2 = formato.format(jdtHasta.getDate());
            hasta = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
        }

        buscar(inactivo,pagado,mesa,mesero,desde,hasta);
    }//GEN-LAST:event_jbBuscarMousePressed

  private void jchPagadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchPagadosActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jchPagadosActionPerformed

  private void jchInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchInactivosActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jchInactivosActionPerformed

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

          double precio = pedData.obtenerSubtotalDelPedido(pedido.getIdPedido());

          model.addRow(new Object[]{
            pedido.getMesa().getNumMesa(),
            pedido.getMesero().getNombre()+" "+pedido.getMesero().getApellido(),
            pedido.getFecha().format(dateFormatter),
            pedido.getHora().format(timeFormatter),
            pedido.isPagado() ? "Si" : "No",
            ("$" + decimalFormatter.format(precio)),
            pedido.isActivo() ? "Si" : "No"            
          });

        });
  }

    private void cargarMeseros() {                              // no trae nada
        ArrayList<Mesero> listaMeseros = ms.obtenerMeseros();

        for (Mesero item : listaMeseros) {
            jcbMesero.addItem(item);
        }
    }
    
    private void buscar(boolean inactivo,boolean pagado,Mesa mesa,Mesero mesero,String desde,String hasta){
        model.setRowCount(0);

        NumberFormat decimalFormatter = new DecimalFormat("#0.00");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        pedidos = new ArrayList<>();

        pedidos = pedData.obtenerPedidosBuscados(inactivo,pagado,mesa,mesero,desde,hasta);

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
            pedido.getMesero().getNombre()+" "+pedido.getMesero().getApellido(),
            pedido.getFecha().format(dateFormatter),
            pedido.getHora().format(timeFormatter),
            pedido.isPagado() ? "Si" : "No",
            ("$" + decimalFormatter.format(precio)),
            pedido.isActivo() ? "Si" : "No"            
          });

        });
    }
   

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel escritorio;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel jbBuscar;
  private javax.swing.JComboBox<Mesa> jcbMesas;
  private javax.swing.JComboBox<Mesero> jcbMesero;
  private resto.componentes.CheckboxPersonalizada jchInactivos;
  private resto.componentes.CheckboxPersonalizada jchPagados;
  private com.toedter.calendar.JDateChooser jdtDesde;
  private com.toedter.calendar.JDateChooser jdtHasta;
  private javax.swing.JPanel jpFondoBuscar;
  private resto.componentes.TablaPersonalizada tablaPedidos;
  // End of variables declaration//GEN-END:variables
}
