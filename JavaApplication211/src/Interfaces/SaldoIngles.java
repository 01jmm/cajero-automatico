/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * Esta clase es una ventana para ver el saldo que se tiene en la cuenta .
 * @author Joel Mauricio Mamani Mamani.
 */
public class SaldoIngles extends javax.swing.JFrame {
        /** Variable para guardar el nombre del usuario en toda la clase*/

    public String usuario = "null";
        /** guarda el numero de cuenta para que toda la clase lo pueda usar*/

     public int numeroCuenta=000;
          /** Este objeto es el que se guarda en el fichero y tambien se lee del fichero si se lo nesesita*/

     public Principal principal =new Principal ();
           /** guarda el saldo de la cuenta */

     public double saldo=000;
    /**
     * Crea una ventana de tipo Saldo en el idioma ingles.
     */
    public SaldoIngles() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * crea una nueva ventana de tipo Saldo en el idioma ingles.
     * despues de crear la ventana tambien se actualiza el usuario 
     * ,numero de cuenta dela clase por ultimo se carga los datos 
     * @param name nuevo nonbre de usuario para la clase.
     * @param numerocuenta nuevo numero de cuenta para la clase.
     * @param saldo  nuevo saldo para la clase.
     */
     public SaldoIngles(String name, int numerocuenta,double saldo){
        initComponents();
        this.usuario=name;
        this.numeroCuenta=numerocuenta;
        this.saldo=saldo;
       
        txtSaldo.setText(saldo +"");
        cargar();
        txtMoneda.setText(tipoMoneda(numerocuenta));
    
    }
     /**
      * El método para saber el tipo de moneda que guarda la cuenta.
      * @param numerocuenta numero de cuenta de la que se busca el tipo de moneda.
      * @return la abreviacion de si es dolar o bolivianos.
      */
      public String tipoMoneda(int numerocuenta){
        String res= "";
        
        for (int i =0; principal.getListaCuenta().size()>i;i++){
            if(principal.getListaCuenta().get(i).getNumeroCuenta()==numerocuenta){
                if(principal.getListaCuenta().get(i).getMoneda().equals("Dolares")){
                    res = "$";
                    
                }else {
                    res = "Bs";
                }
            
            }
        
        }
        return res;
    
    
    
    }
    /**
      * Este método se encarga de leer los datos del fichero para pasarlos  ala clase.
      * El metodo tambien tiene diferentes exepciones donde si no encuentra el fichero crea uno nuevo .
      */
    public void cargar (){
       
       FileInputStream archivo = null; // variable para leer datos de un arcchivo txt 
        ObjectInputStream convertidorarchivo = null;// variable que permitira en este caso sacar datos del archivo txt 

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt");//llama al constructor que permite leer el archivo donde le pasamos la unbicacion del archivo 
            convertidorarchivo = new ObjectInputStream(archivo);// llamamos al constructor que permitira sacar datos del archivo donde le pasamos el archivo de donde queremos sacar los datos
               
                principal= (Principal)convertidorarchivo.readObject(); //agregamos ala lista el objeto que sacamos del archivo txt 
             
        }catch (IOException ex){// excepcion que nos ayuda si no encuentra el archivo 
          
            File archivos = new File ("C://Metodos//Cajero.txt"); // SI NO ENCUENTRA EL ARCHIVO SE CREARA UN NUEVO ARCHIVO 
        }catch (ClassNotFoundException cnfe)//ndica que Java no puede encontrar una clase específica en tiempo de ejecución, lo que generalmente ocurre debido a problemas como errores en el nombre de la clase
                {
                    cnfe.printStackTrace();
                }
       
       
       
       }
/**
     * El método ayuda a obtener el saldo de la cuenta.
     * @param numeroCuenta numero de cuenta de la cuenta de la que se quiere saber el saldo.
     * @return el saldo de la cuenta .
     */
    public double saldo(int numeroCuenta){
        double  res = 0;
        if(principal.getListaCuenta()!=null){
        for(int i =0;principal.getListaCuenta().size()>i ;i++ ){
            if (principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuenta){
                 
                res = principal.getListaCuenta().get(i).getSaldo();
                 break;
            
            }
         
        }
        }
        
     
        return res;
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtSaldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtMoneda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BALANCE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 180, 40));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("RETURN TO");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 130, -1));

        txtSaldo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo.setText("$$$");
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 120, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("YOUR CURRENT BALANCE IS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("PRINT");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 110, 30));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("EXIT");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 80, -1));

        txtMoneda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtMoneda.setForeground(new java.awt.Color(255, 255, 255));
        txtMoneda.setText("$$$");
        jPanel1.add(txtMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 50, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BANK CACHUPIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuIngles ventana = new MenuIngles (usuario,numeroCuenta);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FinishIngles ventana = new FinishIngles (usuario,numeroCuenta);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        Factura factura =new Factura(usuario,numeroCuenta,"Consulta saldo",saldo);
        factura.setVisible(true);
        factura.setLocationRelativeTo(null);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Bienvenida ventana = new Bienvenida ();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaldoIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtMoneda;
    private javax.swing.JLabel txtSaldo;
    // End of variables declaration//GEN-END:variables
}