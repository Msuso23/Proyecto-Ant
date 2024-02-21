
package Interfaces;

/**
 *
 * @author Camila Garcia
 */
public class Simular extends javax.swing.JFrame {


    public Simular() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);    
    }
   

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cantidadHormigas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 219, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("ISOCPEUR", 1, 24)); // NOI18N
        jLabel1.setText("Simulacion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 140, 40));

        Volver.setBackground(new java.awt.Color(0, 0, 0));
        Volver.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 51, 51));
        Volver.setText("<Menu");
        Volver.setBorder(null);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 70));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad de hormigas de la simulacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        cantidadHormigas.setBackground(new java.awt.Color(0, 0, 0));
        cantidadHormigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadHormigasActionPerformed(evt);
            }
        });
        jPanel1.add(cantidadHormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 89, 120, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        InterfaceFunctions.VolverMenu();
    }//GEN-LAST:event_VolverActionPerformed

    private void cantidadHormigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadHormigasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadHormigasActionPerformed

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
            java.util.logging.Logger.getLogger(Simular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JTextField cantidadHormigas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
