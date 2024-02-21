/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.Grafo;
import EDD.Nodo;

/**
 *
 * @author Camila Garcia
 */
public class EliminarCiudad extends javax.swing.JFrame {
    Object ciudadborrar="";

    public EliminarCiudad() {
        initComponents();
     
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        
    }
    
    public void LlenarCiudadesChooserCombo(Grafo g){
      CiudadesComboBox.removeAllItems();
      Nodo aux= g.getListaCiudades().getpFirst();
      while(g.getListaCiudades()!=null) {
          CiudadesComboBox.addItem((String) aux.getDato());
          aux=aux.getPnext();
      }
  }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CiudadesComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 219, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CiudadesComboBox.setBackground(new java.awt.Color(0, 0, 0));
        CiudadesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(CiudadesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 90, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("ISOCPEUR", 1, 36)); // NOI18N
        jLabel1.setText("Eliminar Ciudad");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

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
        jPanel3.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        Eliminar.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("Eliminar");
        jPanel2.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        InterfaceFunctions.VolverMenu();
    }//GEN-LAST:event_VolverActionPerformed

    private void CiudadesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesComboBoxActionPerformed
        LlenarCiudadesChooserCombo(InterfaceFunctions.getGrafo());
        ciudadborrar=(Object)CiudadesComboBox.getSelectedItem().toString();
        Grafo g=InterfaceFunctions.getGrafo();
        g.getListaCiudades().eliminarReferencia(ciudadborrar);
    }//GEN-LAST:event_CiudadesComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarCiudad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CiudadesComboBox;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
