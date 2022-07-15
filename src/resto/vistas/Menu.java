package resto.vistas;

import java.awt.*;
import java.time.LocalDate;
import java.util.*;
import javax.swing.JPanel;
import resto.dao.*;

public class Menu extends javax.swing.JFrame {

  private JPanel tabSeleccionada;
  private ArrayList<JPanel> tabs;

  private Conexion con;

  public Menu() {
    initComponents();
    
    tabs = new ArrayList<>(Arrays.asList(tabHistorial, tabMesas, tabMeseros, tabPedidos, tabPrincipal, tabProductos, tabReservas, tabIngresos));

    con = new Conexion();

//    Setear la fecha en el menu
    LocalDate now = LocalDate.now();
    int dia = now.getDayOfMonth();
    int mes = now.getMonthValue();
    int anio = now.getYear();

    String fechaActual
            = (dia < 10 ? "0" + dia : dia) + "/"
            + (mes < 10 ? "0" + mes : mes) + "/"
            + anio;

    fecha.setText(fechaActual);

//    Cargar vista principal
    setearSeleccionado(tabPrincipal);

    VistaPrincipal vp = new VistaPrincipal(con);
    vp.setSize(780, 530);
    vp.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(vp, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bg = new javax.swing.JPanel();
    barra = new javax.swing.JPanel();
    exitBtn = new javax.swing.JPanel();
    exitImg = new javax.swing.JLabel();
    barraLateral = new javax.swing.JPanel();
    pnlAcento = new javax.swing.JPanel();
    logoBg = new javax.swing.JPanel();
    restoLogo = new javax.swing.JLabel();
    tabPrincipal = new javax.swing.JPanel();
    principalImg = new javax.swing.JLabel();
    principalTexto = new javax.swing.JLabel();
    tabReservas = new javax.swing.JPanel();
    reservasImg = new javax.swing.JLabel();
    reservasTexto = new javax.swing.JLabel();
    tabPedidos = new javax.swing.JPanel();
    pedidosImg = new javax.swing.JLabel();
    pedidosTexto = new javax.swing.JLabel();
    tabProductos = new javax.swing.JPanel();
    productosImg = new javax.swing.JLabel();
    productosTexto = new javax.swing.JLabel();
    tabMesas = new javax.swing.JPanel();
    mesasImg = new javax.swing.JLabel();
    mesasTexto = new javax.swing.JLabel();
    tabMeseros = new javax.swing.JPanel();
    meserosImg = new javax.swing.JLabel();
    meserosTexto = new javax.swing.JLabel();
    tabHistorial = new javax.swing.JPanel();
    historialImg = new javax.swing.JLabel();
    historialTexto = new javax.swing.JLabel();
    tabIngresos = new javax.swing.JPanel();
    historialImg1 = new javax.swing.JLabel();
    historialTexto1 = new javax.swing.JLabel();
    barraSuperior = new javax.swing.JPanel();
    frase = new javax.swing.JLabel();
    fecha = new javax.swing.JLabel();
    contenido = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(1020, 640));
    setUndecorated(true);
    setResizable(false);

    bg.setBackground(new java.awt.Color(240, 239, 239));
    bg.setPreferredSize(new java.awt.Dimension(1020, 640));
    bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    barra.setBackground(new java.awt.Color(255, 255, 255));
    barra.setOpaque(false);
    barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        barraMouseDragged(evt);
      }
    });
    barra.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        barraMousePressed(evt);
      }
    });

    exitBtn.setBackground(new java.awt.Color(114, 63, 50));
    exitBtn.setPreferredSize(new java.awt.Dimension(25, 25));

    exitImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    exitImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoSalir.png"))); // NOI18N
    exitImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    exitImg.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        exitImgMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        exitImgMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        exitImgMouseExited(evt);
      }
    });

    javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
    exitBtn.setLayout(exitBtnLayout);
    exitBtnLayout.setHorizontalGroup(
      exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(exitImg, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
    );
    exitBtnLayout.setVerticalGroup(
      exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(exitImg, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
    barra.setLayout(barraLayout);
    barraLayout.setHorizontalGroup(
      barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
        .addContainerGap(989, Short.MAX_VALUE)
        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    barraLayout.setVerticalGroup(
      barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(barraLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    bg.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

    barraLateral.setBackground(new java.awt.Color(217, 177, 142));
    barraLateral.setPreferredSize(new java.awt.Dimension(240, 640));
    barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pnlAcento.setBackground(new java.awt.Color(114, 63, 50));
    pnlAcento.setPreferredSize(new java.awt.Dimension(8, 110));

    javax.swing.GroupLayout pnlAcentoLayout = new javax.swing.GroupLayout(pnlAcento);
    pnlAcento.setLayout(pnlAcentoLayout);
    pnlAcentoLayout.setHorizontalGroup(
      pnlAcentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 8, Short.MAX_VALUE)
    );
    pnlAcentoLayout.setVerticalGroup(
      pnlAcentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 110, Short.MAX_VALUE)
    );

    barraLateral.add(pnlAcento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    logoBg.setBackground(new java.awt.Color(217, 177, 142));
    logoBg.setAlignmentX(1.0F);
    logoBg.setAlignmentY(1.0F);
    logoBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    restoLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    restoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/restoLogo.png"))); // NOI18N
    logoBg.add(restoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 230, 110));

    barraLateral.add(logoBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 110));

    tabPrincipal.setBackground(new java.awt.Color(217, 177, 142));
    tabPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabPrincipalMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabPrincipalMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabPrincipalMousePressed(evt);
      }
    });

    principalImg.setForeground(new java.awt.Color(114, 63, 50));
    principalImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    principalImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoCasa.png"))); // NOI18N

    principalTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    principalTexto.setForeground(new java.awt.Color(114, 63, 50));
    principalTexto.setText("Página Principal");

    javax.swing.GroupLayout tabPrincipalLayout = new javax.swing.GroupLayout(tabPrincipal);
    tabPrincipal.setLayout(tabPrincipalLayout);
    tabPrincipalLayout.setHorizontalGroup(
      tabPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabPrincipalLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(principalImg)
        .addGap(18, 18, 18)
        .addComponent(principalTexto)
        .addContainerGap(60, Short.MAX_VALUE))
    );
    tabPrincipalLayout.setVerticalGroup(
      tabPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(principalImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
      .addComponent(principalTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    barraLateral.add(tabPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 60));

    tabReservas.setBackground(new java.awt.Color(217, 177, 142));
    tabReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabReservas.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabReservasMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabReservasMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabReservasMousePressed(evt);
      }
    });

    reservasImg.setForeground(new java.awt.Color(114, 63, 50));
    reservasImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    reservasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoCalendario.png"))); // NOI18N

    reservasTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    reservasTexto.setForeground(new java.awt.Color(114, 63, 50));
    reservasTexto.setText("Reservas");

    javax.swing.GroupLayout tabReservasLayout = new javax.swing.GroupLayout(tabReservas);
    tabReservas.setLayout(tabReservasLayout);
    tabReservasLayout.setHorizontalGroup(
      tabReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabReservasLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(reservasImg)
        .addGap(18, 18, 18)
        .addComponent(reservasTexto)
        .addContainerGap(105, Short.MAX_VALUE))
    );
    tabReservasLayout.setVerticalGroup(
      tabReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(reservasImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
      .addComponent(reservasTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    barraLateral.add(tabReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 60));

    tabPedidos.setBackground(new java.awt.Color(217, 177, 142));
    tabPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabPedidosMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabPedidosMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabPedidosMousePressed(evt);
      }
    });

    pedidosImg.setForeground(new java.awt.Color(114, 63, 50));
    pedidosImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    pedidosImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoRegistro.png"))); // NOI18N

    pedidosTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    pedidosTexto.setForeground(new java.awt.Color(114, 63, 50));
    pedidosTexto.setText("Pedidos");

    javax.swing.GroupLayout tabPedidosLayout = new javax.swing.GroupLayout(tabPedidos);
    tabPedidos.setLayout(tabPedidosLayout);
    tabPedidosLayout.setHorizontalGroup(
      tabPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabPedidosLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(pedidosImg)
        .addGap(18, 18, 18)
        .addComponent(pedidosTexto)
        .addContainerGap(115, Short.MAX_VALUE))
    );
    tabPedidosLayout.setVerticalGroup(
      tabPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pedidosImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
      .addComponent(pedidosTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    barraLateral.add(tabPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 60));

    tabProductos.setBackground(new java.awt.Color(217, 177, 142));
    tabProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabProductos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabProductosMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabProductosMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabProductosMousePressed(evt);
      }
    });

    productosImg.setForeground(new java.awt.Color(114, 63, 50));
    productosImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    productosImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoCopa.png"))); // NOI18N

    productosTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    productosTexto.setForeground(new java.awt.Color(114, 63, 50));
    productosTexto.setText("Productos");

    javax.swing.GroupLayout tabProductosLayout = new javax.swing.GroupLayout(tabProductos);
    tabProductos.setLayout(tabProductosLayout);
    tabProductosLayout.setHorizontalGroup(
      tabProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabProductosLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(productosImg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(productosTexto)
        .addContainerGap(108, Short.MAX_VALUE))
    );
    tabProductosLayout.setVerticalGroup(
      tabProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(productosImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
      .addComponent(productosTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    barraLateral.add(tabProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 60));

    tabMesas.setBackground(new java.awt.Color(217, 177, 142));
    tabMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabMesas.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabMesasMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabMesasMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabMesasMousePressed(evt);
      }
    });

    mesasImg.setForeground(new java.awt.Color(114, 63, 50));
    mesasImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    mesasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoSilla.png"))); // NOI18N

    mesasTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    mesasTexto.setForeground(new java.awt.Color(114, 63, 50));
    mesasTexto.setText("Mesas");

    javax.swing.GroupLayout tabMesasLayout = new javax.swing.GroupLayout(tabMesas);
    tabMesas.setLayout(tabMesasLayout);
    tabMesasLayout.setHorizontalGroup(
      tabMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabMesasLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(mesasImg)
        .addGap(18, 18, 18)
        .addComponent(mesasTexto)
        .addContainerGap(126, Short.MAX_VALUE))
    );
    tabMesasLayout.setVerticalGroup(
      tabMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mesasImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
      .addComponent(mesasTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    barraLateral.add(tabMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 60));

    tabMeseros.setBackground(new java.awt.Color(217, 177, 142));
    tabMeseros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabMeseros.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabMeserosMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabMeserosMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabMeserosMousePressed(evt);
      }
    });

    meserosImg.setForeground(new java.awt.Color(114, 63, 50));
    meserosImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    meserosImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoMesero.png"))); // NOI18N

    meserosTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    meserosTexto.setForeground(new java.awt.Color(114, 63, 50));
    meserosTexto.setText("Meseros");

    javax.swing.GroupLayout tabMeserosLayout = new javax.swing.GroupLayout(tabMeseros);
    tabMeseros.setLayout(tabMeserosLayout);
    tabMeserosLayout.setHorizontalGroup(
      tabMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabMeserosLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(meserosImg)
        .addGap(18, 18, 18)
        .addComponent(meserosTexto)
        .addContainerGap(110, Short.MAX_VALUE))
    );
    tabMeserosLayout.setVerticalGroup(
      tabMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(meserosImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
      .addComponent(meserosTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    barraLateral.add(tabMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 240, 60));

    tabHistorial.setBackground(new java.awt.Color(217, 177, 142));
    tabHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabHistorialMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabHistorialMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabHistorialMousePressed(evt);
      }
    });

    historialImg.setForeground(new java.awt.Color(114, 63, 50));
    historialImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    historialImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoReloj.png"))); // NOI18N

    historialTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    historialTexto.setForeground(new java.awt.Color(114, 63, 50));
    historialTexto.setText("Historial Pedidos");

    javax.swing.GroupLayout tabHistorialLayout = new javax.swing.GroupLayout(tabHistorial);
    tabHistorial.setLayout(tabHistorialLayout);
    tabHistorialLayout.setHorizontalGroup(
      tabHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabHistorialLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(historialImg)
        .addGap(18, 18, 18)
        .addComponent(historialTexto)
        .addContainerGap(53, Short.MAX_VALUE))
    );
    tabHistorialLayout.setVerticalGroup(
      tabHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(historialImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
      .addComponent(historialTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    barraLateral.add(tabHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 240, 60));

    tabIngresos.setBackground(new java.awt.Color(217, 177, 142));
    tabIngresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        tabIngresosMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        tabIngresosMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tabIngresosMousePressed(evt);
      }
    });

    historialImg1.setForeground(new java.awt.Color(114, 63, 50));
    historialImg1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    historialImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoIngresos.png"))); // NOI18N

    historialTexto1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    historialTexto1.setForeground(new java.awt.Color(114, 63, 50));
    historialTexto1.setText("Ingresos");

    javax.swing.GroupLayout tabIngresosLayout = new javax.swing.GroupLayout(tabIngresos);
    tabIngresos.setLayout(tabIngresosLayout);
    tabIngresosLayout.setHorizontalGroup(
      tabIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabIngresosLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(historialImg1)
        .addGap(18, 18, 18)
        .addComponent(historialTexto1)
        .addContainerGap(110, Short.MAX_VALUE))
    );
    tabIngresosLayout.setVerticalGroup(
      tabIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(historialImg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIngresosLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(historialTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        .addContainerGap())
    );

    barraLateral.add(tabIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 240, -1));

    bg.add(barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    barraSuperior.setBackground(new java.awt.Color(114, 63, 50));

    frase.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    frase.setForeground(new java.awt.Color(217, 177, 142));
    frase.setText("“Acá no solo se come, se come bien”");

    fecha.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
    fecha.setForeground(new java.awt.Color(217, 177, 142));
    fecha.setText("fecha");

    javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
    barraSuperior.setLayout(barraSuperiorLayout);
    barraSuperiorLayout.setHorizontalGroup(
      barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(barraSuperiorLayout.createSequentialGroup()
        .addGap(33, 33, 33)
        .addComponent(frase)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
        .addComponent(fecha)
        .addGap(329, 329, 329))
    );
    barraSuperiorLayout.setVerticalGroup(
      barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    bg.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 110));

    contenido.setBackground(new java.awt.Color(240, 239, 239));
    contenido.setPreferredSize(new java.awt.Dimension(780, 530));

    javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
    contenido.setLayout(contenidoLayout);
    contenidoLayout.setHorizontalGroup(
      contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 780, Short.MAX_VALUE)
    );
    contenidoLayout.setVerticalGroup(
      contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 530, Short.MAX_VALUE)
    );

    bg.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void exitImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitImgMouseClicked
//    dispose();
      System.exit(0);
  }//GEN-LAST:event_exitImgMouseClicked

    int xMouse, yMouse;

  private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
      xMouse = evt.getX();
      yMouse = evt.getY();
  }//GEN-LAST:event_barraMousePressed

  private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x - xMouse, y - yMouse);
  }//GEN-LAST:event_barraMouseDragged

  private void exitImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitImgMouseEntered
      exitBtn.setBackground(Color.decode("#D9B18E"));
      exitImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoSalirHover.png")));
  }//GEN-LAST:event_exitImgMouseEntered

  private void exitImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitImgMouseExited
      exitBtn.setBackground(Color.decode("#723F32"));
      exitImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoSalir.png")));
  }//GEN-LAST:event_exitImgMouseExited

  // <editor-fold desc="Codigo para los distintos tabs">
  
  // =~=~=~= Eventos hover/deshover de los tabs =~=~=~=
  // = Tab principal =
  private void tabPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrincipalMouseEntered
      if (tabSeleccionada != tabPrincipal) {
          setearHover(tabPrincipal);
      }
  }//GEN-LAST:event_tabPrincipalMouseEntered

  private void tabPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrincipalMouseExited
      if (tabSeleccionada != tabPrincipal) {
          resetearColor(tabPrincipal);
      }
  }//GEN-LAST:event_tabPrincipalMouseExited

  // = Tab reservas =
  private void tabReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabReservasMouseEntered
    if (tabSeleccionada != tabReservas) {
        setearHover(tabReservas);
    }
  }//GEN-LAST:event_tabReservasMouseEntered

  private void tabReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabReservasMouseExited
    if (tabSeleccionada != tabReservas) {
      resetearColor(tabReservas);
    }
  }//GEN-LAST:event_tabReservasMouseExited

  // = Tab pedidos =
  private void tabPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPedidosMouseEntered
    if (tabSeleccionada != tabPedidos) {
      setearHover(tabPedidos);
    }
  }//GEN-LAST:event_tabPedidosMouseEntered

  private void tabPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPedidosMouseExited
    if (tabSeleccionada != tabPedidos) {
      resetearColor(tabPedidos);
    }
  }//GEN-LAST:event_tabPedidosMouseExited

  // = Tab productos =
  private void tabProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductosMouseEntered
    if (tabSeleccionada != tabProductos) {
      setearHover(tabProductos);
    }
  }//GEN-LAST:event_tabProductosMouseEntered

  private void tabProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductosMouseExited
    if (tabSeleccionada != tabProductos) {
      resetearColor(tabProductos);
    }
  }//GEN-LAST:event_tabProductosMouseExited

  // = Tab mesas =
  private void tabMesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMesasMouseEntered
    if (tabSeleccionada != tabMesas) {
      setearHover(tabMesas);
    }
  }//GEN-LAST:event_tabMesasMouseEntered

  private void tabMesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMesasMouseExited
    if (tabSeleccionada != tabMesas) {
      resetearColor(tabMesas);
    }
  }//GEN-LAST:event_tabMesasMouseExited

  // = Tab meseros =
  private void tabMeserosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMeserosMouseEntered
    if (tabSeleccionada != tabMeseros) {
      setearHover(tabMeseros);
    }
  }//GEN-LAST:event_tabMeserosMouseEntered

  private void tabMeserosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMeserosMouseExited
    if (tabSeleccionada != tabMeseros) {
      resetearColor(tabMeseros);
    }
  }//GEN-LAST:event_tabMeserosMouseExited

  // = Tab historial =
  private void tabHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHistorialMouseEntered
    if (tabSeleccionada != tabHistorial) {
      setearHover(tabHistorial);
    }
  }//GEN-LAST:event_tabHistorialMouseEntered

  private void tabHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHistorialMouseExited
    if (tabSeleccionada != tabHistorial) {
      resetearColor(tabHistorial);
    }
  }//GEN-LAST:event_tabHistorialMouseExited

  
  // =~=~=~= Eventos click de los tabs =~=~=~=
  private void tabPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrincipalMousePressed
    setearSeleccionado(tabPrincipal);

    VistaPrincipal vp = new VistaPrincipal(con);
    vp.setSize(780, 530);
    vp.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(vp, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabPrincipalMousePressed

  private void tabReservasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabReservasMousePressed
    setearSeleccionado(tabReservas);

    ReservaVista rv = new ReservaVista(con);
    rv.setSize(780, 530);
    rv.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(rv, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabReservasMousePressed

  private void tabPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPedidosMousePressed
    setearSeleccionado(tabPedidos);

    PedidosVista pv = new PedidosVista(con);
    pv.setSize(780, 530);
    pv.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(pv, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabPedidosMousePressed

  private void tabProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductosMousePressed
    setearSeleccionado(tabProductos);

    ProductoVista prv = new ProductoVista(con);
    prv.setSize(780, 530);
    prv.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(prv, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabProductosMousePressed

  private void tabMesasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMesasMousePressed
    setearSeleccionado(tabMesas);

    MesaVista mv = new MesaVista(con);
    mv.setSize(780, 530);
    mv.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(mv, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabMesasMousePressed

  private void tabMeserosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMeserosMousePressed
    setearSeleccionado(tabMeseros);

    MeseroVista mv = new MeseroVista(con);
    mv.setSize(780, 530);
    mv.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(mv, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabMeserosMousePressed

  private void tabHistorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHistorialMousePressed
    setearSeleccionado(tabHistorial);

    HistorialVista hv = new HistorialVista(con);
    hv.setSize(780, 530);
    hv.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(hv, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabHistorialMousePressed

  private void tabIngresosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabIngresosMouseEntered
    if (tabSeleccionada != tabIngresos) {
      setearHover(tabIngresos);
    }
  }//GEN-LAST:event_tabIngresosMouseEntered

  private void tabIngresosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabIngresosMouseExited
    if (tabSeleccionada != tabIngresos) {
      resetearColor(tabIngresos);
    }
  }//GEN-LAST:event_tabIngresosMouseExited

  private void tabIngresosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabIngresosMousePressed
    setearSeleccionado(tabIngresos);

    IngresosVista iv = new IngresosVista(con);
    iv.setSize(780, 530);
    iv.setLocation(0, 0);

    contenido.removeAll();
    contenido.add(iv, BorderLayout.CENTER);
    contenido.revalidate();
    contenido.repaint();
  }//GEN-LAST:event_tabIngresosMousePressed
  // </editor-fold>    
    
  void resetearColor(JPanel panel) {
    panel.setBackground(Color.decode("#D9B18E"));
  }

  void setearHover(JPanel panel) {
    panel.setBackground(Color.decode("#E1C2A8"));
  }

  void setearSeleccionado(JPanel panel) {
    panel.setBackground(Color.decode("#F1CFB2"));
    tabSeleccionada = panel;
    
    tabs.forEach(tab -> {
      if (tab != panel) {
        resetearColor(tab);
      }
    });
  }

  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Menu frame = new Menu();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel barra;
  private javax.swing.JPanel barraLateral;
  private javax.swing.JPanel barraSuperior;
  private javax.swing.JPanel bg;
  private javax.swing.JPanel contenido;
  private javax.swing.JPanel exitBtn;
  private javax.swing.JLabel exitImg;
  private javax.swing.JLabel fecha;
  private javax.swing.JLabel frase;
  private javax.swing.JLabel historialImg;
  private javax.swing.JLabel historialImg1;
  private javax.swing.JLabel historialTexto;
  private javax.swing.JLabel historialTexto1;
  private javax.swing.JPanel logoBg;
  private javax.swing.JLabel mesasImg;
  private javax.swing.JLabel mesasTexto;
  private javax.swing.JLabel meserosImg;
  private javax.swing.JLabel meserosTexto;
  private javax.swing.JLabel pedidosImg;
  private javax.swing.JLabel pedidosTexto;
  private javax.swing.JPanel pnlAcento;
  private javax.swing.JLabel principalImg;
  private javax.swing.JLabel principalTexto;
  private javax.swing.JLabel productosImg;
  private javax.swing.JLabel productosTexto;
  private javax.swing.JLabel reservasImg;
  private javax.swing.JLabel reservasTexto;
  private javax.swing.JLabel restoLogo;
  private javax.swing.JPanel tabHistorial;
  private javax.swing.JPanel tabIngresos;
  private javax.swing.JPanel tabMesas;
  private javax.swing.JPanel tabMeseros;
  private javax.swing.JPanel tabPedidos;
  private javax.swing.JPanel tabPrincipal;
  private javax.swing.JPanel tabProductos;
  private javax.swing.JPanel tabReservas;
  // End of variables declaration//GEN-END:variables
}
