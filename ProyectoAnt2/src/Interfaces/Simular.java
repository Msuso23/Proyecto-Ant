
package Interfaces;

import Clases.SistemaHormiga;
import EDD.Lista;
import EDD.Nodo;
import EDD.Vertice;
import Funciones.FuncionesSistemaHormiga;
import Funciones.Messages;

/**
 *
 * @author Camila Garcia
 */
public class Simular extends javax.swing.JFrame {
    //Variables auxiliares
    int hormigas;
    int ciclos_realizar;
    Lista hormigaslista= new Lista();
    double a;
    double b;
    double r;
    double q;
    Boolean defecto=false;
    String ciudadInicio;
    String ciudadFinal;
    Vertice ci;
    Vertice cf;
    
    FuncionesSistemaHormiga func = new FuncionesSistemaHormiga();


    public Simular() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        CiudadesDestino.setEnabled(false);
        ciclos.setEnabled(false);
    }
    
   
     //Metodo para llenar un ChooserCombo de ciudad de inicio
    public void LlenarCiudadesInicioChooserCombo(){
        CiudadesComboBox.removeAllItems();
        Nodo aux= InterfaceFunctions.getGrafo().getListaCiudades().getpFirst();
        String aux2="";
        while(aux!=null) {
            Vertice verticeActual = (Vertice) aux.getDato();
            aux2 = String.valueOf(String.valueOf(verticeActual.getNumeroCiudad()));
            CiudadesComboBox.addItem(aux2);
            aux=aux.getPnext();
        }
    }
    
     //Metodo para llenar un ChooserCombo de Ciudades destino sin la de inicio
   public void LlenarCiudadesDestinoChooserCombo(int ciudadinicio){
        CiudadesDestino.removeAllItems();
        Nodo aux= InterfaceFunctions.getGrafo().getListaCiudades().getpFirst();
        String aux2="";
        while(aux!=null) {
            Vertice verticeActual = (Vertice) aux.getDato();
            aux2 = String.valueOf(String.valueOf(verticeActual.getNumeroCiudad()));
            if(verticeActual.getNumeroCiudad()!=ciudadinicio){
                CiudadesDestino.addItem(aux2);
            }
            aux=aux.getPnext();
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cantidadHormigas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ciclos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        variablesdefecto = new javax.swing.JButton();
        alfa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        beta = new javax.swing.JTextField();
        rhoname = new javax.swing.JLabel();
        rho = new javax.swing.JTextField();
        simulador = new javax.swing.JButton();
        CiudadesComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CiudadesDestino = new javax.swing.JComboBox<>();
        cantidadhormigasOK = new javax.swing.JButton();
        ciclosOK = new javax.swing.JButton();
        ciOK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 219, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad de hormigas de la simulacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cantidadHormigas.setBackground(new java.awt.Color(0, 0, 0));
        cantidadHormigas.setForeground(new java.awt.Color(255, 255, 255));
        cantidadHormigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadHormigasActionPerformed(evt);
            }
        });
        jPanel1.add(cantidadHormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("ISOCPEUR", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simulacion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 230, 40));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ciclos a realizar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        ciclos.setBackground(new java.awt.Color(0, 0, 0));
        ciclos.setForeground(new java.awt.Color(255, 255, 255));
        ciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciclosActionPerformed(evt);
            }
        });
        jPanel1.add(ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 120, 20));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Variables para la Actualizacion de Feromonas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        variablesdefecto.setBackground(new java.awt.Color(0, 0, 0));
        variablesdefecto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        variablesdefecto.setText("Usar variables por defecto");
        variablesdefecto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        variablesdefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variablesdefectoActionPerformed(evt);
            }
        });
        jPanel1.add(variablesdefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 240, 30));

        alfa.setBackground(new java.awt.Color(0, 0, 0));
        alfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfaActionPerformed(evt);
            }
        });
        jPanel1.add(alfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 40, 20));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("α");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 10, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 0, 0));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("β");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        beta.setBackground(new java.awt.Color(0, 0, 0));
        beta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betaActionPerformed(evt);
            }
        });
        jPanel1.add(beta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 40, -1));

        rhoname.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        rhoname.setForeground(new java.awt.Color(0, 0, 0));
        rhoname.setText("ρ");
        jPanel1.add(rhoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 10, -1));

        rho.setBackground(new java.awt.Color(0, 0, 0));
        rho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhoActionPerformed(evt);
            }
        });
        jPanel1.add(rho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 40, -1));

        simulador.setBackground(new java.awt.Color(0, 0, 0));
        simulador.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        simulador.setText("OK");
        simulador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        simulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simuladorActionPerformed(evt);
            }
        });
        jPanel1.add(simulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 250, 30));

        CiudadesComboBox.setBackground(new java.awt.Color(0, 0, 0));
        CiudadesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(CiudadesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 120, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ciudad Inicio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ciudad Destino:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        CiudadesDestino.setBackground(new java.awt.Color(0, 0, 0));
        CiudadesDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(CiudadesDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 120, -1));

        cantidadhormigasOK.setBackground(new java.awt.Color(0, 0, 0));
        cantidadhormigasOK.setText("OK");
        cantidadhormigasOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadhormigasOKActionPerformed(evt);
            }
        });
        jPanel1.add(cantidadhormigasOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, 20));

        ciclosOK.setBackground(new java.awt.Color(0, 0, 0));
        ciclosOK.setText("OK");
        ciclosOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciclosOKActionPerformed(evt);
            }
        });
        jPanel1.add(ciclosOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 50, 20));

        ciOK.setBackground(new java.awt.Color(0, 0, 0));
        ciOK.setText("OK");
        ciOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciOKActionPerformed(evt);
            }
        });
        jPanel1.add(ciOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        InterfaceFunctions.VolverMenu();
    }//GEN-LAST:event_VolverActionPerformed

    private void cantidadHormigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadHormigasActionPerformed

    }//GEN-LAST:event_cantidadHormigasActionPerformed

    private void ciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciclosActionPerformed
       
    }//GEN-LAST:event_ciclosActionPerformed

    private void alfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfaActionPerformed
       
    }//GEN-LAST:event_alfaActionPerformed

    private void variablesdefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variablesdefectoActionPerformed
        //Si el usuario escoge los valores por defecto, los text field no se pueden llenar.
        alfa.setEnabled(false);
        beta.setEnabled(false);
        rho.setEnabled(false);
        defecto=true;
       
    }//GEN-LAST:event_variablesdefectoActionPerformed

    private void betaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betaActionPerformed
    
    }//GEN-LAST:event_betaActionPerformed

    private void rhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhoActionPerformed
        
    }//GEN-LAST:event_rhoActionPerformed

    private void CiudadesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesComboBoxActionPerformed
        
    }//GEN-LAST:event_CiudadesComboBoxActionPerformed

    private void CiudadesDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesDestinoActionPerformed
        ciudadFinal=(String)CiudadesDestino.getSelectedItem();
    }//GEN-LAST:event_CiudadesDestinoActionPerformed

    private void simuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simuladorActionPerformed
        //Si selecciono que el valor es por defecto el booleano sera verdadero asi que toma valores prestablecidos, sino toma los valores ingresados
        if (defecto==false){
            b= Double.parseDouble(beta.getText());
            r=Double.parseDouble(rho.getText());
            a= Double.parseDouble(alfa.getText());
            q=0.5;
        }else{
            a=1;
            b=2;
            r=0.5;
            q=0.5;
        }   
        
        //Buscar el vertice de las ciudades seleccionadas
        ci= InterfaceFunctions.getGrafo().buscarVertice2(Integer.parseInt(ciudadInicio));
        cf= InterfaceFunctions.getGrafo().buscarVertice2(Integer.parseInt(ciudadFinal));
        //Crear el constructor de simulador
        Lista hormigaslista = func.inicializarHormigas(hormigas, ci);
        func.inicializarFeromonas(InterfaceFunctions.getGrafo());
        
        SistemaHormiga simul = new SistemaHormiga(ciclos_realizar,hormigaslista,a,b,r,q,InterfaceFunctions.getGrafo(),ci,cf);
        simul.simulacion();
    }//GEN-LAST:event_simuladorActionPerformed

    private void ciclosOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciclosOKActionPerformed
         //Un try cath para que acepte solo numeros
        try{
           ciclos_realizar=Integer.parseInt(ciclos.getText());
        }
        catch(Exception e){
            Messages.error("El valor a ingresar debe ser un numero");
        }
        //Una vez seleccionado los ciclos el Chooser Combo se llena con las ciudades para elegir la de inicio
        LlenarCiudadesInicioChooserCombo();
    }//GEN-LAST:event_ciclosOKActionPerformed

    private void ciOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciOKActionPerformed
        //Una vez seleccionada la ciudad de inicio se llena el Combo box para elegir la ciudad destino
        ciudadInicio=(String) CiudadesComboBox.getSelectedItem(); 
        CiudadesDestino.setEnabled(true);
        LlenarCiudadesDestinoChooserCombo(Integer.parseInt(ciudadInicio));
    }//GEN-LAST:event_ciOKActionPerformed

    private void cantidadhormigasOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadhormigasOKActionPerformed
        //Agrego en una lista cada hormiga diferenciada por numeros
         try{
            hormigas= Integer.parseInt(cantidadHormigas.getText());
            for (int i = 1; i < hormigas+1; i++) {
            hormigaslista.insertarFinal(i);
            ciclos.setEnabled(true);
        }
         }
        catch(Exception e){
            Messages.error("El valor a ingresar debe ser un numero");
        }
        
    }//GEN-LAST:event_cantidadhormigasOKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JComboBox<String> CiudadesComboBox;
    private javax.swing.JComboBox<String> CiudadesDestino;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField alfa;
    private javax.swing.JTextField beta;
    private javax.swing.JTextField cantidadHormigas;
    private javax.swing.JButton cantidadhormigasOK;
    private javax.swing.JButton ciOK;
    private javax.swing.JTextField ciclos;
    private javax.swing.JButton ciclosOK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField rho;
    private javax.swing.JLabel rhoname;
    private javax.swing.JButton simulador;
    private javax.swing.JButton variablesdefecto;
    // End of variables declaration//GEN-END:variables
}
