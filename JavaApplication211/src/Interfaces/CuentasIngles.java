/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
/**
 *Esta clase es una ventana donde apareceran las cuentas que tiene el cliente del banco . 
 * @author Joel Mauricio Mamani Mamani.
 */
public class CuentasIngles extends javax.swing.JFrame {

    /**
     * Crea una nueva ventana para ver las cuentas del cliente en el idioma ingles.
     */
    public CuentasIngles() {
        initComponents();
        setLocationRelativeTo(null);
    }
        /** Este objeto es el que se guardara en el fichero y tambien se lee del fichero si se lo nesesita */

    public Principal principal = new Principal();
        /** Variable para guardar el nombre del usuario en toda la clase*/

    public String usuario = "null";
    /**
     * Crea una nueva ventana para ver las cuentas del cliente en el idioma ingles. 
     * Este constructor actualiza  el usuario, tambien carga los datos ala interfas y 
     * carga las cuentas que tiene el usuario . 
     * @param usu nombre de usuario del cliente que entro al cajero.
     */
    public CuentasIngles(String usu) {
        initComponents();
        this.usuario=usu;
        cargar();
        cargarCuentas(usu);
        
    }
    /**
     * El metodo traduce el tipo de moneda que tiene la cuenta.
     * @param tipoMoneda nombre del tipo de moneda a traducir
     * @return traduccion del tipo de moneda.
     */
    public String nombreMoneda(String tipoMoneda){
        String res;
        res = "";
        if(tipoMoneda.equals("Dolares")){
            res = "Dollars";
            
        }else{
            res = "Bolivians";
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
        btnAgregarCuenta = new javax.swing.JButton();
        btnCambiarContraseña = new javax.swing.JButton();
        panelCuentas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHOOSE WITH WHICH ACCOUNT YOU WANT TO MAKE THE OPERATIONS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 530, 30));

        btnAgregarCuenta.setBackground(new java.awt.Color(0, 51, 51));
        btnAgregarCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCuenta.setText("ADD ACCOUNT");
        btnAgregarCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        btnCambiarContraseña.setBackground(new java.awt.Color(0, 51, 51));
        btnCambiarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarContraseña.setText("CHANGE PASSWORD");
        btnCambiarContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        panelCuentas.setBackground(new java.awt.Color(0, 51, 51));
        panelCuentas.setForeground(new java.awt.Color(255, 255, 255));
        panelCuentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelCuentasLayout = new javax.swing.GroupLayout(panelCuentas);
        panelCuentas.setLayout(panelCuentasLayout);
        panelCuentasLayout.setHorizontalGroup(
            panelCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        panelCuentasLayout.setVerticalGroup(
            panelCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(panelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 560, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RETURN TO");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, 0, -1, 420));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * El Metodo busca y muestra las cuentas que tiene el usuario.
     * El método busca en la lista de cuentas todas las cuentas que pertenecen al usuario y crea botones con 
     * el numero de cuenta y el tipo de moneda que guarda la cuenta.
     * @param usu nombre de usuario del que se buscara las cuentas.
     */
    public void cargarCuentas(String usu){
        if(!principal.getListaCuenta().isEmpty()){
            panelCuentas.setLayout(new GridLayout(0, 1));
                for(int i =0;principal.getListaCuenta().size()>i;i++){
                    if(principal.getListaCuenta().get(i).getUsuario().equals(usu)){
                    JButton button = new JButton( String.valueOf(principal.getListaCuenta().get(i).getNumeroCuenta())+ nombreMoneda(principal.getListaCuenta().get(i).getMoneda()));
                            int numeroCuentaAux=principal.getListaCuenta().get(i).getNumeroCuenta();
                        // Agregar un ActionListener al botón
                        Font fuente = new Font("Arial", Font.BOLD, 18); // Fuente Arial, negrita, tamaño 16
                           button.setFont(fuente);
                      button.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                           MenuIngles menu = new MenuIngles(usuario,numeroCuentaAux);
                          menu.setVisible(true);
                          menu.setLocationRelativeTo(null);
                          dispose();
                      }
                       });
                      button.setPreferredSize(new Dimension (309, 39));
                      
                     panelCuentas.add(button);
                
                
                    }
                }
        
        }
    
    
    }
   /**
      * Este método se encarga de leer los datos del fichero para pasarlos  ala clase.
      * El metodo tambien tiene diferentes exepciones donde si no encuentra el fichero crea uno nuevo .
      */ 
    private void cargar (){
       
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
      * Este método se encarga de actualizar los datos del  fichero .
      * El metodo tambien tiene diferentes exepciones donde si no encuentra el fichero te dara los errores en una pila .
      */
    private void actualizarLista() {
        try {
           
            FileOutputStream ficherosalida =new FileOutputStream ("C://Metodos//Cajero.txt") ; 
            ObjectOutputStream  convertidor = new ObjectOutputStream (ficherosalida);
            
                convertidor.writeObject(principal);
            
            convertidor.close();
            ficherosalida.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        CrearCuentaIngles cuenta = new CrearCuentaIngles (usuario);
        cuenta.setVisible(true);
        cuenta.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed
        CambioContrasenaIngles ventana =new CambioContrasenaIngles(usuario);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        IngresoPinIngles ventana =new IngresoPinIngles(usuario);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(CuentasIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentasIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentasIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentasIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentasIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCuentas;
    // End of variables declaration//GEN-END:variables
}
