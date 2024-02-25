
package Interfaces;

import EDD.Grafo;
import EDD.Nodo;
import EDD.Vertice;
import Funciones.Messages;
import EDD.Arista;
/**
 *
 * @author Camila Garcia
 */
public class AgregarCiudad extends javax.swing.JFrame {
    String ciudadagregar="";
    String ciudadconectar="";
    double distanciaentreciudades=0;
    Vertice ciudadagregarv;
    Vertice ciudadconectarv;

    
    public AgregarCiudad() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        CiudadesComboBox.setEnabled(false);
        ciudadconecta.setEnabled(false);
        ciudadnueva.setEnabled(true);
        
    }
    //Metodo para llenar un ChooserCombo
   public void LlenarCiudadesChooserCombo(){
        Nodo aux= InterfaceFunctions.getGrafo().getListaCiudades().getpFirst();
        String aux2="";
        while(aux!=null) {
            aux2=String.valueOf(aux.getDato());
            CiudadesComboBox.addItem((String)aux2);
            aux=aux.getPnext();
        }
    }
   
   //Metodo para saber el numero de la ciudad
   public int ObtenerNumero(String ciudad){
       String num="";
       int aux= ciudad.length()-6;
       for (int i = 0; i < aux; i++) {
           num+=ciudad.charAt(i+6);
       } 
       return Integer.parseInt(num); 
   }
       
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ciudadnueva = new javax.swing.JTextField();
        nombreciudad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregarCiudadB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CiudadesComboBox = new javax.swing.JComboBox<>();
        ciudadconecta = new javax.swing.JButton();
        distancia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(243, 219, 195));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ciudadnueva.setBackground(new java.awt.Color(0, 0, 0));
        ciudadnueva.setForeground(new java.awt.Color(255, 255, 255));
        ciudadnueva.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ciudadnueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadnuevaActionPerformed(evt);
            }
        });
        jPanel3.add(ciudadnueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 30));

        nombreciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreciudad.setForeground(new java.awt.Color(0, 0, 0));
        nombreciudad.setText(" ");
        jPanel3.add(nombreciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ciudad a agregar");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        agregarCiudadB.setBackground(new java.awt.Color(0, 0, 0));
        agregarCiudadB.setText("OK");
        agregarCiudadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCiudadBActionPerformed(evt);
            }
        });
        jPanel3.add(agregarCiudadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ciudad a la que se conecta");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        CiudadesComboBox.setBackground(new java.awt.Color(0, 0, 0));
        CiudadesComboBox.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        CiudadesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(CiudadesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 100, 30));

        ciudadconecta.setBackground(new java.awt.Color(0, 0, 0));
        ciudadconecta.setText("OK");
        ciudadconecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadconectaActionPerformed(evt);
            }
        });
        jPanel3.add(ciudadconecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 120, -1));

        distancia.setBackground(new java.awt.Color(0, 0, 0));
        distancia.setForeground(new java.awt.Color(255, 255, 255));
        distancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciaActionPerformed(evt);
            }
        });
        jPanel3.add(distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, 30));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Distancia");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 230));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("ISOCPEUR", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Ciudad");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadiendo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

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
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        InterfaceFunctions.VolverMenu();
    }//GEN-LAST:event_VolverActionPerformed

    private void CiudadesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesComboBoxActionPerformed
        agregarCiudadB.setEnabled(false);
        ciudadconectar=CiudadesComboBox.getSelectedItem().toString(); 
    }//GEN-LAST:event_CiudadesComboBoxActionPerformed

    private void agregarCiudadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCiudadBActionPerformed
        LlenarCiudadesChooserCombo();
        CiudadesComboBox.setEnabled(true);
        ciudadconecta.setEnabled(true);
        distancia.setEnabled(true);
        
    }//GEN-LAST:event_agregarCiudadBActionPerformed

    private void distanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciaActionPerformed
       try{
        distanciaentreciudades= Double.valueOf(distancia.getText());
       }catch(Exception e){
           Messages.error("El valaor ingresado debe ser un numero");
       }
           
       
    }//GEN-LAST:event_distanciaActionPerformed

    private void ciudadconectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadconectaActionPerformed
        int cc=ObtenerNumero(ciudadconectar);
        ciudadconectarv=new Vertice(cc);
        Arista nuevocamino= new Arista(ciudadagregarv,ciudadconectarv,distanciaentreciudades);
        if(InterfaceFunctions.getGrafo().isVertex(ciudadagregarv)==false){
            InterfaceFunctions.getGrafo().agregarVertice(ciudadagregarv);
            InterfaceFunctions.getGrafo().agregarArista(nuevocamino);
            Messages.information("La ciudad fue agregada con exito");
        }else{
            Messages.error("La ciudad a agregar ya existe");
        }
            
    }//GEN-LAST:event_ciudadconectaActionPerformed

    private void ciudadnuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadnuevaActionPerformed
        ciudadagregar=ciudadnueva.getText().toString();
        int ca= Integer.parseInt(ciudadagregar);
        ciudadagregarv= new Vertice(ca);
    }//GEN-LAST:event_ciudadnuevaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCiudad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CiudadesComboBox;
    private javax.swing.JButton Volver;
    private javax.swing.JButton agregarCiudadB;
    private javax.swing.JButton ciudadconecta;
    private javax.swing.JTextField ciudadnueva;
    private javax.swing.JTextField distancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nombreciudad;
    // End of variables declaration//GEN-END:variables
}
