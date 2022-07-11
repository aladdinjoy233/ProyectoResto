package resto.vistas;

import java.awt.*;
import java.time.LocalDate;
import javax.swing.JPanel;
import resto.dao.Conexion;

public class Menu extends javax.swing.JFrame {

    private javax.swing.JPanel tabSeleccionada;
    private Conexion con;

    public Menu() {
        initComponents();

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

        VistaPrincipal vp = new VistaPrincipal();
        ReservaVista rv = new ReservaVista(con);     //prueba para ver la reserva
        rv.setSize(780, 530);
        rv.setLocation(0, 0);

        contenido.removeAll();
        //contenido.add(vp, BorderLayout.CENTER);
        contenido.add(rv, BorderLayout.CENTER);
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
        exitImg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addContainerGap(9, Short.MAX_VALUE))
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
        tabPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabPrincipalMouseExited(evt);
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

  private void tabPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrincipalMouseClicked
      setearSeleccionado(tabPrincipal);

      VistaPrincipal vp = new VistaPrincipal();
      ReservaVista rv = new ReservaVista(con);
//    vp.setSize(780, 530);
//    vp.setLocation(0, 0);
      rv.setSize(780, 530);
      rv.setLocation(0, 0);

      contenido.removeAll();
//    contenido.add(vp, BorderLayout.CENTER);
      contenido.add(rv, BorderLayout.CENTER);
      contenido.revalidate();
      contenido.repaint();
  }//GEN-LAST:event_tabPrincipalMouseClicked

    void resetearColor(JPanel panel) {
        panel.setBackground(Color.decode("#D9B18E"));
    }

    void setearHover(JPanel panel) {
        panel.setBackground(Color.decode("#E1C2A8"));
    }

    void setearSeleccionado(JPanel panel) {
        panel.setBackground(Color.decode("#F1CFB2"));
        tabSeleccionada = panel;
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
    private javax.swing.JPanel logoBg;
    private javax.swing.JPanel pnlAcento;
    private javax.swing.JLabel principalImg;
    private javax.swing.JLabel principalTexto;
    private javax.swing.JLabel restoLogo;
    private javax.swing.JPanel tabPrincipal;
    // End of variables declaration//GEN-END:variables
}
