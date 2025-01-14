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
import javax.swing.JOptionPane;
/**
 * Esta clase es una ventana para cambiar la comtraseña del cliente o usuario .
 * @author Joel Mauricio Mamani Mamani.
 */
public class CambioContrasenaIngles extends javax.swing.JFrame {
    /**
      * Variable para guardar el nombre del usuario en toda la clase
      */
    public String usuario = "";
   /**
     * Objeto que representa la clase Principal del sistema.
     * En este objeto se guardan los distinas datos delas cuentas y clientes .
     * Este objeto es el que se guarda en el fichero y tambien se lee del fichero si se lo nesesita.
     */
    Principal principal = new Principal ();
    /**
     * Crea una nueva ventana para el  Cambio Contrasena en el idioma ingles.
     */
    public CambioContrasenaIngles() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * Crea una nueva ventana para el  Cambio Contrasena en el idiomaen el idioma ingles.
     * Este metodo aparte de crear la ventana tanbien carga los datos
     * y cambia o actualiza el usuario de toda la interfas.
     * @param name Es el nombre de  usuario del cliente que entro al cajero. 
     */
    public CambioContrasenaIngles(String name) {
        initComponents();
        cargar();
        this.usuario=name;
        
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContraseñaActual = new javax.swing.JTextField();
        txtContraseñaNueva = new javax.swing.JTextField();
        txtContraseñaNuevaRepetida = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REPEAT PASSWORD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PASSWORD CHANGE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, 42));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NEW PASSWORD ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 130, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CURRENT PASSWORD");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        txtContraseñaActual.setBackground(new java.awt.Color(0, 51, 51));
        txtContraseñaActual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtContraseñaActual.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseñaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 283, 30));

        txtContraseñaNueva.setBackground(new java.awt.Color(0, 51, 51));
        txtContraseñaNueva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseñaNueva.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseñaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 283, 30));

        txtContraseñaNuevaRepetida.setBackground(new java.awt.Color(0, 51, 51));
        txtContraseñaNuevaRepetida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseñaNuevaRepetida.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseñaNuevaRepetida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 283, 30));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("READY");
        jButton6.setAutoscrolls(true);
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("RETURN TO");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, 940, 450));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (verificarContraseñaActual(txtContraseñaActual.getText())){
            if (verificarContraseñaNueva(txtContraseñaNueva.getText(),txtContraseñaNuevaRepetida.getText())){
                cambiarcontraseña( txtContraseñaNueva.getText());
                JOptionPane.showMessageDialog(null, "Password successfully modified.", "Message", JOptionPane.INFORMATION_MESSAGE);
                CuentasIngles ventana = new CuentasIngles (usuario);
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "The passwords do not match. Please make sure to enter the same password in both fields.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        }else {
            JOptionPane.showMessageDialog(null, "Current password incorrect ", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
     /**
     * El método cambia la contraseña de la cuenta del usuario.
     * El método busca en la lista de clientes con que cliente se asocia el nombre de usuario
     * de la interfas una ves encontrado le cambia la contraseña .
     * @param contraseña la nueva contraseña .
     */
    public void cambiarcontraseña(String contraseña){
        for (int i = 0 ;principal.getListaCliente().size()>i;i++){
            if(principal.getListaCliente().get(i).getUsuario().equals(usuario)){
                    principal.getListaCliente().get(i).setContraseña(contraseña);
                    
                
                }
    
    
    }
    }
    /**
        * El método verifica si las dos veses que te pide que ingreses la contraseña nueva 
        * son iguales.
        * @param contraseña1 Primera contraseña nueva ingresada .
        * @param contraseña2 Segunda contraseña nueva ingresada.
        * @return Devuelve true si son iguales .
        */     
    public boolean verificarContraseñaNueva(String contraseña1,String contraseña2){
        boolean res = false;
        if(contraseña1.equals(contraseña2)){}
                res =true;
        
        
        return res;
    
    
    }
    /**
     * El método verifica si la contraseña actual ingresada es valida .
     * @param contraseña Contraseña actual ingresada.
     * @return Devuelve true si la contraseña es valida.
     */
    public boolean verificarContraseñaActual(String contraseña){
            boolean res = false;
            for(int i =0; principal.getListaCliente().size()>i;i++){
                if(principal.getListaCliente().get(i).getUsuario().equals(usuario)){
                    if (principal.getListaCliente().get(i).getContraseña().equals(contraseña)){
                        res = true;
                        break;
                    }
                
                }
            
            }
    
    return res;
    
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CuentasIngles ventana = new CuentasIngles (usuario);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CambioContrasenaIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContrasenaIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContrasenaIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContrasenaIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioContrasenaIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContraseñaActual;
    private javax.swing.JTextField txtContraseñaNueva;
    private javax.swing.JTextField txtContraseñaNuevaRepetida;
    // End of variables declaration//GEN-END:variables
}
