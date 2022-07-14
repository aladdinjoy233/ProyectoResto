package resto.vistas;

import java.awt.Color;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import resto.dao.Conexion;
import resto.dao.MeseroData;
import resto.entidades.Mesero;

public class AgregarMeseroVista extends javax.swing.JPanel {

    private Conexion con;
    private MeseroData md;
    
    public AgregarMeseroVista() {
        initComponents();
        
        con = new Conexion();
        md = new MeseroData(con);
        
        jcbActivo.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jlFlecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jcbActivo = new resto.componentes.CheckboxPersonalizada();
        jbtnAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(780, 530));

        escritorio.setBackground(new java.awt.Color(252, 252, 252));

        jlFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/iconoAtras.png"))); // NOI18N
        jlFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlFlechaMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(114, 63, 50));
        jLabel5.setText("Agregar mesero");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 63, 50));
        jLabel1.setText("Nombre");

        jtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 63, 50));
        jLabel3.setText("Apellido");

        jtApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));
        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 63, 50));
        jLabel4.setText("DNI");

        jtDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(114, 63, 50));
        jLabel6.setText("Telefono");

        jtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(114, 63, 50)));

        jcbActivo.setForeground(new java.awt.Color(114, 63, 50));
        jcbActivo.setText("Activo");
        jcbActivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jbtnAgregar.setBackground(new java.awt.Color(241, 207, 178));
        jbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAgregarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 63, 50));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar");

        javax.swing.GroupLayout jbtnAgregarLayout = new javax.swing.GroupLayout(jbtnAgregar);
        jbtnAgregar.setLayout(jbtnAgregarLayout);
        jbtnAgregarLayout.setHorizontalGroup(
            jbtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jbtnAgregarLayout.setVerticalGroup(
            jbtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jlFlecha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(0, 97, Short.MAX_VALUE)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel1)
                                .addComponent(jcbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(261, 261, 261)))))
                .addGap(240, 240, 240))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlFlecha)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void jlFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFlechaMouseClicked
        MeseroVista mv = new MeseroVista( con);
        
        mv.setSize(780, 530);
        mv.setLocation(0, 0);   
        
        escritorio.removeAll();
        escritorio.add(mv);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_jlFlechaMouseClicked

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jbtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseClicked
        try{
            String nombre = jtNombre.getText();
            String apellido = jtApellido.getText();
            long dni = Long.parseLong(jtDNI.getText());
            long telefono = Long.parseLong(jtTelefono.getText());
            boolean activo = false;            
            if(jcbActivo.isSelected()){
                activo = true;
            }
            
            if(nombre.trim().equals("") || apellido.trim().equals("")){ //verifico que nombre y apellido no esten vacios
                JOptionPane.showMessageDialog(this, "Nombre y apellido no pueden estar en blanco");                
            } else{            // si no lo estan agrego el nuevo mesero
                Mesero m = new Mesero(nombre,apellido,dni,telefono,activo);
            
                if(md.agregarMesero(m)){
                    JOptionPane.showMessageDialog(this, "Mesero agregado exitosamente");
                    limpiarCampos();
                }
            
            }
            
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error! Debe ingresar un numero");
        }
    }//GEN-LAST:event_jbtnAgregarMouseClicked

    private void jbtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseEntered
        jbtnAgregar.setBackground(Color.decode("#D9B18E"));
    }//GEN-LAST:event_jbtnAgregarMouseEntered

    private void jbtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseExited
        jbtnAgregar.setBackground(Color.decode("#F1CFB2"));
    }//GEN-LAST:event_jbtnAgregarMouseExited

    private void limpiarCampos(){
        
        jtNombre.setText("");
        jtApellido.setText("");
        jtDNI.setText("");
        jtTelefono.setText("");
        jcbActivo.setSelected(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jbtnAgregar;
    private resto.componentes.CheckboxPersonalizada jcbActivo;
    private javax.swing.JLabel jlFlecha;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
