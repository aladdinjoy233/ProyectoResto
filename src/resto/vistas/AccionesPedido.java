package resto.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resto.dao.*;
import resto.entidades.*;

public class AccionesPedido extends javax.swing.JPanel {

  private NumberFormat decimalFormatter = new DecimalFormat("#0.00");
  private Date hoy;
  private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

  boolean modoEdicion = false;
  private Pedido pedido;
  private Conexion con;
  private ProductoData productoData;
  private DetalleData detalleData;
  private MesaData mesaData;
  private PedidoData pedidoData;
  private DefaultTableModel modelSeleccionar;
  private DefaultTableModel modelAgregados;
  ArrayList<Mesa> mesas;
  ArrayList<Producto> productosDisponibles;
  ArrayList<DetalleDelPedido> productosAgregados;

  public AccionesPedido(Conexion con, Pedido pedido) {
    initComponents();

    tablaSeleccionarProducto.arreglarTabla(jScrollPane1);
    tablaPedidosAgregados.arreglarTabla(jScrollPane2);

    modelSeleccionar = (DefaultTableModel) tablaSeleccionarProducto.getModel();
    modelAgregados = (DefaultTableModel) tablaPedidosAgregados.getModel();

    this.pedido = pedido;
    this.con = con;
    productoData = new ProductoData(con);
    detalleData = new DetalleData(con);
    mesaData = new MesaData(con);
    pedidoData = new PedidoData(con);

    mesas = mesaData.listadoMesasActivas();

    if (pedido == null) {
      productosAgregados = new ArrayList<DetalleDelPedido>();
    } else {
      modoEdicion = true;
      productosAgregados = detalleData.obtenerDetallesDePedido(pedido.getIdPedido());
    }

    productosDisponibles = productoData.obtenerProductos(true);

    hoy = new Date();

    cargarDatos();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    btnVolver = new javax.swing.JLabel();
    lblTitulo = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaSeleccionarProducto = new resto.componentes.TablaPersonalizada();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaPedidosAgregados = new resto.componentes.TablaPersonalizada();
    btnAgregarProducto = new javax.swing.JPanel();
    lblAgregar = new javax.swing.JLabel();
    btnSacarProducto = new javax.swing.JPanel();
    lblSacar = new javax.swing.JLabel();
    lblidPedido = new javax.swing.JLabel();
    idPedido = new javax.swing.JLabel();
    lblMesa = new javax.swing.JLabel();
    opcionesMesas = new javax.swing.JComboBox<>();
    lblFecha = new javax.swing.JLabel();
    lblHora = new javax.swing.JLabel();
    fechaInput = new com.toedter.calendar.JDateChooser();
    horaInput = new javax.swing.JFormattedTextField();
    btnFinalizarPedido = new javax.swing.JPanel();
    lblFinalizarPedido = new javax.swing.JLabel();
    isActivo = new resto.componentes.CheckboxPersonalizada();
    isPagado = new resto.componentes.CheckboxPersonalizada();

    setPreferredSize(new java.awt.Dimension(780, 530));

    bg.setBackground(new java.awt.Color(240, 239, 239));

    btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
    btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnVolverMousePressed(evt);
      }
    });

    lblTitulo.setBackground(new java.awt.Color(114, 63, 50));
    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
    lblTitulo.setForeground(new java.awt.Color(114, 63, 50));
    lblTitulo.setText("Crear pedido");

    tablaSeleccionarProducto.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Producto", "Categoria", "Stock", "Precio c/u"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tablaSeleccionarProducto);

    tablaPedidosAgregados.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Producto", "Cantidad"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane2.setViewportView(tablaPedidosAgregados);

    btnAgregarProducto.setBackground(new java.awt.Color(241, 207, 178));
    btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnAgregarProductoMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnAgregarProductoMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnAgregarProductoMousePressed(evt);
      }
    });

    lblAgregar.setForeground(new java.awt.Color(114, 63, 50));
    lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblAgregar.setText("Agregar producto");

    javax.swing.GroupLayout btnAgregarProductoLayout = new javax.swing.GroupLayout(btnAgregarProducto);
    btnAgregarProducto.setLayout(btnAgregarProductoLayout);
    btnAgregarProductoLayout.setHorizontalGroup(
      btnAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
    );
    btnAgregarProductoLayout.setVerticalGroup(
      btnAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
    );

    btnSacarProducto.setBackground(new java.awt.Color(241, 207, 178));
    btnSacarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnSacarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnSacarProductoMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnSacarProductoMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnSacarProductoMousePressed(evt);
      }
    });

    lblSacar.setForeground(new java.awt.Color(114, 63, 50));
    lblSacar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblSacar.setText("Sacar producto");

    javax.swing.GroupLayout btnSacarProductoLayout = new javax.swing.GroupLayout(btnSacarProducto);
    btnSacarProducto.setLayout(btnSacarProductoLayout);
    btnSacarProductoLayout.setHorizontalGroup(
      btnSacarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
    );
    btnSacarProductoLayout.setVerticalGroup(
      btnSacarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblSacar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
    );

    lblidPedido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblidPedido.setForeground(new java.awt.Color(114, 63, 50));
    lblidPedido.setText("ID del pedido:");

    idPedido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    idPedido.setForeground(new java.awt.Color(114, 63, 50));
    idPedido.setText("no disponible");

    lblMesa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblMesa.setForeground(new java.awt.Color(114, 63, 50));
    lblMesa.setText("Mesa del pedido:");

    lblFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblFecha.setForeground(new java.awt.Color(114, 63, 50));
    lblFecha.setText("Fecha:");

    lblHora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblHora.setForeground(new java.awt.Color(114, 63, 50));
    lblHora.setText("Hora:");

    try {
      horaInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    horaInput.setText("12:34");

    btnFinalizarPedido.setBackground(new java.awt.Color(114, 63, 50));
    btnFinalizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnFinalizarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnFinalizarPedidoMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnFinalizarPedidoMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnFinalizarPedidoMousePressed(evt);
      }
    });

    lblFinalizarPedido.setBackground(new java.awt.Color(241, 207, 178));
    lblFinalizarPedido.setForeground(new java.awt.Color(241, 207, 178));
    lblFinalizarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblFinalizarPedido.setText("Finalizar creacion");

    javax.swing.GroupLayout btnFinalizarPedidoLayout = new javax.swing.GroupLayout(btnFinalizarPedido);
    btnFinalizarPedido.setLayout(btnFinalizarPedidoLayout);
    btnFinalizarPedidoLayout.setHorizontalGroup(
      btnFinalizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblFinalizarPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
    );
    btnFinalizarPedidoLayout.setVerticalGroup(
      btnFinalizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(lblFinalizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
    );

    isActivo.setForeground(new java.awt.Color(114, 63, 50));
    isActivo.setSelected(true);
    isActivo.setText("Activo");
    isActivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    isPagado.setForeground(new java.awt.Color(114, 63, 50));
    isPagado.setText("Pagado");
    isPagado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
    bg.setLayout(bgLayout);
    bgLayout.setHorizontalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(btnVolver))
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(lblTitulo))
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(bgLayout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnSacarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(bgLayout.createSequentialGroup()
                    .addComponent(lblMesa)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(opcionesMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(bgLayout.createSequentialGroup()
                    .addComponent(lblidPedido)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(idPedido)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(bgLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(bgLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(lblFecha)
                      .addComponent(lblHora))
                    .addGap(18, 18, 18)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(horaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(fechaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
              .addGroup(bgLayout.createSequentialGroup()
                .addComponent(isActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(46, Short.MAX_VALUE))
    );
    bgLayout.setVerticalGroup(
      bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bgLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(btnVolver)
        .addGap(6, 6, 6)
        .addComponent(lblTitulo)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(bgLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblFecha)
                .addGap(21, 21, 21)
                .addComponent(lblHora))
              .addGroup(bgLayout.createSequentialGroup()
                .addComponent(fechaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(horaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(bgLayout.createSequentialGroup()
              .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(isActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(isPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblidPedido)
                .addComponent(idPedido))
              .addGap(18, 18, 18)
              .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblMesa)
                .addComponent(opcionesMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addGap(6, 6, 6)
        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnSacarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnFinalizarPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoMousePressed

    Mesa mesaSeleccionada = mesas.get(opcionesMesas.getSelectedIndex());
    
//    <Validacion>
    if (productosAgregados.size() <= 0 && !modoEdicion) {
      JOptionPane.showMessageDialog(this, "Debe ver al menos producto agregado");
      return;
    }

    if (mesaSeleccionada.getMesero() == null) {
      JOptionPane.showMessageDialog(this, "La mesa seleccionada (" + mesaSeleccionada.getNumMesa() + ") no tiene mesero");
      return;
    }
    
    if (fechaInput.getDate().before(hoy) && !modoEdicion) {
      JOptionPane.showMessageDialog(this, "La fecha no debe ser anterior a la fecha de hoy");
      return;
    }
    
    try {
      LocalTime.parse(horaInput.getText());
    } catch (DateTimeParseException | NullPointerException e) {
      JOptionPane.showMessageDialog(this, "Formato de la hora no es valido");
      return;
    }
//    </Validacion>

//    <Crear pedido>
    Pedido pedidoFinal;

    if (modoEdicion) {
      pedidoFinal = pedido;
    } else {
      pedidoFinal = new Pedido();
    }

    pedidoFinal.setMesa(mesaSeleccionada);
    pedidoFinal.setMesero(mesaSeleccionada.getMesero());

    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    String fecha = formato.format(fechaInput.getDate());
    LocalDate fechaElegida = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    pedidoFinal.setFecha(fechaElegida);

    LocalTime hora = LocalTime.parse((String) horaInput.getText());
    pedidoFinal.setHora(hora);

    pedidoFinal.setActivo(isActivo.isSelected());

    pedidoFinal.setPagado(isPagado.isSelected());

    if (modoEdicion) {
      pedidoData.modificarPedido(pedidoFinal);
    } else {
      pedidoData.agregarPedido(pedidoFinal);
    }
//    </Crear pedido>

//    <Modificar el stock de los productos>
    productosDisponibles.forEach(producto -> {
      productoData.modificarProducto(producto);
    });
//    </Modificar el stock de los productos>

//    <Modificar los detalles del pedido>
    productosAgregados.forEach(detalle -> {
      if (detalle.getPedido() == null) {
        detalle.setPedido(pedidoFinal);
        detalleData.agregarDetalle(detalle);
      }

      if (detalle.getPedido().equals(pedido)) {
        detalleData.modificarDetalle(detalle);
      }
    });
//    </Modificar los detalles del pedido>

    if (isPagado.isSelected()) {

      pedidoFinal.setSubtotal(pedidoData.obtenerSubtotalDelPedido(pedidoFinal.getIdPedido()));
      pedidoData.modificarPedido(pedidoFinal);

    } else {
      pedidoFinal.setSubtotal(null);
      pedidoData.modificarPedido(pedidoFinal);
    }

//    <Mostrar resultado confirmacion y cambiar vista>
    if (modoEdicion) {
      JOptionPane.showMessageDialog(this, "Pedido modificado con exito");
    } else {
      JOptionPane.showMessageDialog(this, "Pedido agregado con exito");
    }

    PedidosVista pv = new PedidosVista(con);
    pv.setSize(780, 530);
    pv.setLocation(0, 0);

    bg.removeAll();
    bg.add(pv, BorderLayout.CENTER);
    bg.revalidate();
    bg.repaint();
//    </Mostrar resultado confirmacion y cambiar vista>

  }//GEN-LAST:event_btnFinalizarPedidoMousePressed

  private void btnFinalizarPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoMouseExited
    btnFinalizarPedido.setBackground(Color.decode("#723F32"));
  }//GEN-LAST:event_btnFinalizarPedidoMouseExited

  private void btnFinalizarPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoMouseEntered
    btnFinalizarPedido.setBackground(Color.decode("#9e5f4f"));
  }//GEN-LAST:event_btnFinalizarPedidoMouseEntered

  private void btnSacarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarProductoMousePressed
    if (tablaPedidosAgregados.getSelectedRows().length != 1) {
      return;
    }

    int filaSeleccionada = tablaPedidosAgregados.getSelectedRow();
    DetalleDelPedido detalleSeleccionado = productosAgregados.get(filaSeleccionada);
    int cantidad = detalleSeleccionado.getCantidad();

    if (cantidad == 1) {
      
      if (modoEdicion && detalleSeleccionado.getPedido().equals(pedido)) {
        detalleData.desactivarDetalle(detalleSeleccionado.getIdDetalle());
      }

      productosAgregados.remove(filaSeleccionada);

    } else {
      productosAgregados.get(filaSeleccionada).setCantidad(cantidad - 1);
    }

    int indiceProducto = 0;
    int stock = 0;
    for (Producto productoDisponible : productosDisponibles) {
      if (productoDisponible.equals(detalleSeleccionado.getProducto())) {
        stock = productoDisponible.getStock();
        break;
      }
      indiceProducto++;
    }

    productosDisponibles.get(indiceProducto).setStock(stock + 1);

    rerenderTables();
    if (cantidad != 1) {
      tablaPedidosAgregados.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
    }
  }//GEN-LAST:event_btnSacarProductoMousePressed

  private void btnSacarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarProductoMouseExited
    btnSacarProducto.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnSacarProductoMouseExited

  private void btnSacarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarProductoMouseEntered
    btnSacarProducto.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnSacarProductoMouseEntered

  private void btnAgregarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMousePressed
    if (tablaSeleccionarProducto.getSelectedRows().length != 1) {
      return;
    }

    int filaSeleccionada = tablaSeleccionarProducto.getSelectedRow();
    Producto productoSeleccionado = productosDisponibles.get(filaSeleccionada);
    int stock = productoSeleccionado.getStock();

    if (stock <= 0) {
      JOptionPane.showMessageDialog(this, "No hay mas stock");
      rerenderTables();
      return;
    }

    productosDisponibles.get(tablaSeleccionarProducto.getSelectedRow()).setStock(stock - 1);

    //    Checkear si el producto esta en la lista de productos agregados
    boolean existe = false;
    int indice = 0;
    int cantidad = 0;
    for (DetalleDelPedido detalle : productosAgregados) {
      if (detalle.getProducto().equals(productoSeleccionado)) {
        existe = true;
        cantidad = detalle.getCantidad();
        break;
      }
      indice++;
    }

    if (existe) {
      productosAgregados.get(indice).setCantidad(cantidad + 1);
    } else {
      DetalleDelPedido detalle = new DetalleDelPedido(productoSeleccionado, null, 1, true);
      productosAgregados.add(detalle);
    }

    rerenderTables();
    tablaSeleccionarProducto.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
  }//GEN-LAST:event_btnAgregarProductoMousePressed

  private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
    btnAgregarProducto.setBackground(Color.decode("#F1CFB2"));
  }//GEN-LAST:event_btnAgregarProductoMouseExited

  private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
    btnAgregarProducto.setBackground(Color.decode("#D9B18E"));
  }//GEN-LAST:event_btnAgregarProductoMouseEntered

  private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
    PedidosVista pv = new PedidosVista(con);
    pv.setSize(780, 530);
    pv.setLocation(0, 0);

    bg.removeAll();
    bg.add(pv, BorderLayout.CENTER);
    bg.revalidate();
    bg.repaint();
  }//GEN-LAST:event_btnVolverMousePressed

  public void cargarDatos() {
    
    if (modoEdicion) {

      LocalDate fecha = pedido.getFecha();
      Date date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
      fechaInput.setDate(date);
      
      DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
      String dateString = timeFormatter.format(pedido.getHora());
      horaInput.setText(dateString);
      
      isActivo.setSelected(pedido.isActivo());
      
      isPagado.setSelected(pedido.isPagado());
      
      idPedido.setText("" + pedido.getIdPedido());
      
      lblTitulo.setText("Editar pedido");
      
      lblFinalizarPedido.setText("Finalizar edicion");

    } else {

      String dateString = formatter.format(hoy);
      
      horaInput.setText(dateString);
      fechaInput.setDate(hoy);

    }

    Collections.sort(productosDisponibles, new Comparator<Producto>() {
      @Override
      public int compare(Producto t, Producto t1) {
        return t.getNombre().compareToIgnoreCase(t1.getNombre());
      }
    });

    Collections.sort(mesas, new Comparator<Mesa>() {
      @Override
      public int compare(Mesa t, Mesa t1) {
        return Integer.compare(t.getNumMesa(), t1.getNumMesa());
      }
    });
    
    mesas.forEach(mesa -> {
      opcionesMesas.addItem("Mesa " + mesa.getNumMesa());
    });

    if (modoEdicion) {
      opcionesMesas.setSelectedIndex(mesas.indexOf(pedido.getMesa()));
    }
    
    rerenderTables();
  }

  public void rerenderTables() {
    modelSeleccionar.setRowCount(0);
    modelAgregados.setRowCount(0);
    
    productosDisponibles.forEach(producto -> {
      modelSeleccionar.addRow(new Object[]{
        producto.getNombre(),
        producto.isComestible() ? "Comida" : "Bebida",
        producto.getStock(),
        "$" + decimalFormatter.format(producto.getPrecio())
      });
    });
    
    productosAgregados.forEach(detalle -> {
      modelAgregados.addRow(new Object[]{
        detalle.getProducto().getNombre(),
        detalle.getCantidad()
      });
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JPanel btnAgregarProducto;
  private javax.swing.JPanel btnFinalizarPedido;
  private javax.swing.JPanel btnSacarProducto;
  private javax.swing.JLabel btnVolver;
  private com.toedter.calendar.JDateChooser fechaInput;
  private javax.swing.JFormattedTextField horaInput;
  private javax.swing.JLabel idPedido;
  private resto.componentes.CheckboxPersonalizada isActivo;
  private resto.componentes.CheckboxPersonalizada isPagado;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel lblAgregar;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblFinalizarPedido;
  private javax.swing.JLabel lblHora;
  private javax.swing.JLabel lblMesa;
  private javax.swing.JLabel lblSacar;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JLabel lblidPedido;
  private javax.swing.JComboBox<String> opcionesMesas;
  private resto.componentes.TablaPersonalizada tablaPedidosAgregados;
  private resto.componentes.TablaPersonalizada tablaSeleccionarProducto;
  // End of variables declaration//GEN-END:variables
}
