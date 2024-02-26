
package Interfaces;
/**
 *
 * @author Camila Garcia
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        GuardadB = new javax.swing.JButton();
        GraficarB = new javax.swing.JButton();
        SimularB = new javax.swing.JButton();
        cargartxtB = new javax.swing.JButton();
        EliminarCiudadB = new javax.swing.JButton();
        AgregarCiudadB = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagenguardar = new javax.swing.JLabel();
        imagencargar = new javax.swing.JLabel();
        imagenagregar = new javax.swing.JLabel();
        imageneliminar = new javax.swing.JLabel();
        imagengrafico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 219, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GuardadB.setBackground(new java.awt.Color(0, 0, 0));
        GuardadB.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        GuardadB.setForeground(new java.awt.Color(255, 51, 51));
        GuardadB.setText("GUARDAR");
        GuardadB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GuardadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardadBActionPerformed(evt);
            }
        });
        jPanel2.add(GuardadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 140, -1));

        GraficarB.setBackground(new java.awt.Color(0, 0, 0));
        GraficarB.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        GraficarB.setForeground(new java.awt.Color(255, 51, 51));
        GraficarB.setText("GRAFICO");
        GraficarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GraficarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarBActionPerformed(evt);
            }
        });
        jPanel2.add(GraficarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, -1));

        SimularB.setBackground(new java.awt.Color(0, 0, 0));
        SimularB.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        SimularB.setForeground(new java.awt.Color(255, 51, 51));
        SimularB.setText("SIMULACION");
        SimularB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SimularB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimularBActionPerformed(evt);
            }
        });
        jPanel2.add(SimularB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, -1));

        cargartxtB.setBackground(new java.awt.Color(0, 0, 0));
        cargartxtB.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cargartxtB.setForeground(new java.awt.Color(255, 51, 51));
        cargartxtB.setText("CARGAR");
        cargartxtB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargartxtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargartxtBActionPerformed(evt);
            }
        });
        jPanel2.add(cargartxtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, -1));

        EliminarCiudadB.setBackground(new java.awt.Color(0, 0, 0));
        EliminarCiudadB.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        EliminarCiudadB.setForeground(new java.awt.Color(255, 51, 51));
        EliminarCiudadB.setText("ELIMINAR CIUDAD");
        EliminarCiudadB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarCiudadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCiudadBActionPerformed(evt);
            }
        });
        jPanel2.add(EliminarCiudadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, -1));

        AgregarCiudadB.setBackground(new java.awt.Color(0, 0, 0));
        AgregarCiudadB.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        AgregarCiudadB.setForeground(new java.awt.Color(255, 51, 51));
        AgregarCiudadB.setText("AGREGAR CIUDAD");
        AgregarCiudadB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarCiudadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCiudadBActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarCiudadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 150, -1));

        jButton7.setBackground(new java.awt.Color(243, 219, 195));
        jButton7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 51, 51));
        jButton7.setText("<Salir");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hormiga (2).png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hormiga (2).png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hormiga (2).png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("ISOCPEUR", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ant-System");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        imagenguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible (3).png"))); // NOI18N
        jPanel2.add(imagenguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        imagencargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carga-de-archivos (1).png"))); // NOI18N
        jPanel2.add(imagencargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        imagenagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadiendo.png"))); // NOI18N
        jPanel2.add(imagenagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        imageneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jPanel2.add(imageneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        imagengrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/teoria-de-grafos (1).png"))); // NOI18N
        jPanel2.add(imagengrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cubo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargartxtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargartxtBActionPerformed
        InterfaceFunctions.openCargarTxt();
    }//GEN-LAST:event_cargartxtBActionPerformed

    private void AgregarCiudadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCiudadBActionPerformed
        InterfaceFunctions.openAgregarCiudad();
    }//GEN-LAST:event_AgregarCiudadBActionPerformed

    private void EliminarCiudadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCiudadBActionPerformed
       InterfaceFunctions.openEliminarCiudad();
       
    }//GEN-LAST:event_EliminarCiudadBActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        System.exit(0);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SimularBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimularBActionPerformed
        InterfaceFunctions.openSimular();
    }//GEN-LAST:event_SimularBActionPerformed

    private void GraficarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarBActionPerformed
        InterfaceFunctions.openMostar();
    }//GEN-LAST:event_GraficarBActionPerformed

    private void GuardadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardadBActionPerformed
       InterfaceFunctions.openGuardar();
    }//GEN-LAST:event_GuardadBActionPerformed

    /**
     * @param args the command line arguments
     */
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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCiudadB;
    private javax.swing.JButton EliminarCiudadB;
    private javax.swing.JButton GraficarB;
    private javax.swing.JButton GuardadB;
    private javax.swing.JButton SimularB;
    private javax.swing.JButton cargartxtB;
    private javax.swing.JLabel imagenagregar;
    private javax.swing.JLabel imagencargar;
    private javax.swing.JLabel imageneliminar;
    private javax.swing.JLabel imagengrafico;
    private javax.swing.JLabel imagenguardar;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
