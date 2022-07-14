package resto.vistas;

import java.awt.Color;
import resto.dao.*;

public class VistaPrincipal extends javax.swing.JPanel {

  Conexion con;
  ReservaData reservaData;
  PedidoData pedidoData;
  ProductoData productoData;
  MesaData mesaData;
  MeseroData meseroData;

  public VistaPrincipal(Conexion con) {
    initComponents();

    textoMotivador.setText("<html>"
            + "\"Es hora de darlo todo, a veces la vida simplemente no te da el tiempo deseado para hacer algo increíble, pero al esforzarte al máximo podrás lograr algo que de otro modo pensarías que es imposible. Y recuerda, el verdadero tesoro fueron los amigos que hiciste en el camino.\" <b>- Albert Gordon Einstein Ramsey</b>"
            + "</html>");

    seperator.setBackground(Color.decode("#723F32"));
    seperator.setForeground(Color.decode("#723F32"));

    this.con = con;

    reservaData = new ReservaData(con);
    pedidoData = new PedidoData(con);
    productoData = new ProductoData(con);
    mesaData = new MesaData(con);
    meseroData = new MeseroData(con);

    cargarDatos();
  }
  
  private void cargarDatos() {
    cantidadReservas.setText("" + reservaData.obtenerReservas().size());
    cantidadPedidos.setText("" + pedidoData.obtenerPedidosActivos().size());
    cantidadProductos.setText("" + productoData.obtenerProductos(true).size());
    cantidadMesas.setText("" + mesaData.listadoMesasActivas().size());
    cantidadMeseros.setText("" + meseroData.obtenerMeseros().size());
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    accentImg = new javax.swing.JLabel();
    textoMotivador = new javax.swing.JLabel();
    seperator = new javax.swing.JSeparator();
    estadoTitulo = new javax.swing.JLabel();
    lblReservas = new javax.swing.JLabel();
    lblPedidos = new javax.swing.JLabel();
    lblProductos = new javax.swing.JLabel();
    lblMesas = new javax.swing.JLabel();
    lblMeseros = new javax.swing.JLabel();
    cantidadReservas = new javax.swing.JLabel();
    cantidadPedidos = new javax.swing.JLabel();
    cantidadProductos = new javax.swing.JLabel();
    cantidadMesas = new javax.swing.JLabel();
    cantidadMeseros = new javax.swing.JLabel();

    setBackground(new java.awt.Color(240, 239, 239));
    setPreferredSize(new java.awt.Dimension(780, 530));

    accentImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/restoImg.jpg"))); // NOI18N

    textoMotivador.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
    textoMotivador.setForeground(new java.awt.Color(114, 63, 50));
    textoMotivador.setText("Es hora de darlo todo, a veces la vida simplemente no te da el tiempo deseado para hacer algo increíble, pero al esforzarte al máximo podrás lograr algo que de otro modo pensarías que es imposible. Y recuerda, el verdadero tesoro fueron los amigos que hiciste en el camino.");
    textoMotivador.setVerticalAlignment(javax.swing.SwingConstants.TOP);

    seperator.setBackground(new java.awt.Color(114, 63, 50));
    seperator.setForeground(new java.awt.Color(114, 63, 50));
    seperator.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

    estadoTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    estadoTitulo.setForeground(new java.awt.Color(114, 63, 50));
    estadoTitulo.setText("Estado del resto: ");

    lblReservas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    lblReservas.setForeground(new java.awt.Color(114, 63, 50));
    lblReservas.setText("Cantidad de reservas: ");

    lblPedidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    lblPedidos.setForeground(new java.awt.Color(114, 63, 50));
    lblPedidos.setText("Cantidad de pedidos: ");

    lblProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    lblProductos.setForeground(new java.awt.Color(114, 63, 50));
    lblProductos.setText("Cantidad de productos: ");

    lblMesas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    lblMesas.setForeground(new java.awt.Color(114, 63, 50));
    lblMesas.setText("Cantidad de mesas: ");

    lblMeseros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    lblMeseros.setForeground(new java.awt.Color(114, 63, 50));
    lblMeseros.setText("Cantidad de meseros: ");

    cantidadReservas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    cantidadReservas.setForeground(new java.awt.Color(114, 63, 50));
    cantidadReservas.setText("1");

    cantidadPedidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    cantidadPedidos.setForeground(new java.awt.Color(114, 63, 50));
    cantidadPedidos.setText("1");

    cantidadProductos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    cantidadProductos.setForeground(new java.awt.Color(114, 63, 50));
    cantidadProductos.setText("1");

    cantidadMesas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    cantidadMesas.setForeground(new java.awt.Color(114, 63, 50));
    cantidadMesas.setText("1");

    cantidadMeseros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    cantidadMeseros.setForeground(new java.awt.Color(114, 63, 50));
    cantidadMeseros.setText("1");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(textoMotivador, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(estadoTitulo)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblReservas)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cantidadReservas))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblPedidos)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cantidadPedidos))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblProductos)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cantidadProductos))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblMesas)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cantidadMesas))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblMeseros)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cantidadMeseros))
          .addComponent(seperator))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
        .addComponent(accentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(accentImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(49, 49, 49)
        .addComponent(textoMotivador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(33, 33, 33)
        .addComponent(estadoTitulo)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblReservas)
          .addComponent(cantidadReservas))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblPedidos)
          .addComponent(cantidadPedidos))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblProductos)
          .addComponent(cantidadProductos))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblMesas)
          .addComponent(cantidadMesas))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblMeseros)
          .addComponent(cantidadMeseros))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel accentImg;
  private javax.swing.JLabel cantidadMesas;
  private javax.swing.JLabel cantidadMeseros;
  private javax.swing.JLabel cantidadPedidos;
  private javax.swing.JLabel cantidadProductos;
  private javax.swing.JLabel cantidadReservas;
  private javax.swing.JLabel estadoTitulo;
  private javax.swing.JLabel lblMesas;
  private javax.swing.JLabel lblMeseros;
  private javax.swing.JLabel lblPedidos;
  private javax.swing.JLabel lblProductos;
  private javax.swing.JLabel lblReservas;
  private javax.swing.JSeparator seperator;
  private javax.swing.JLabel textoMotivador;
  // End of variables declaration//GEN-END:variables
}
