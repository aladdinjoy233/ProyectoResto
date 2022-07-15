/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel5.setText("Mesero");

        jcbMesero.setBorder(null);
        jcbMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeseroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel6.setText("Pagados");

        jcbPagados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel7.setText("Activos");

        jcbActivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jbResetear.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
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
            .addComponent(jbResetear, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jbVerDetalle.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
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
            .addComponent(jbVerDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jpFondoVerDetalleLayout.setVerticalGroup(
            jpFondoVerDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbVerDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
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
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbPagados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jpFondoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jpFondoResetear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                        .addComponent(jdtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(123, 123, 123))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpFondoVerDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jdtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jcbPagados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jcbActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpFondoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpFondoResetear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpFondoVerDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
      String activo = null, pagado = null;
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

      buscar(activo, pagado, mesa, mesero, desde, hasta);
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

  private void buscar(String activo, String pagado, Mesa mesa, Mesero mesero, String desde, String hasta) {
    model.setRowCount(0);

    NumberFormat decimalFormatter = new DecimalFormat("#0.00");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    pedidos = new ArrayList<>();

    pedidos = pedData.obtenerPedidosBuscados(activo, pagado, mesa, mesero, desde, hasta);

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
    private javax.swing.JPanel jpFondoBuscar;
    private javax.swing.JPanel jpFondoResetear;
    private javax.swing.JPanel jpFondoVerDetalle;
    private resto.componentes.TablaPersonalizada tablaPedidos;
    // End of variables declaration//GEN-END:variables
}
