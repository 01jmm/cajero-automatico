/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 * Esta clase es una ventana auxialiar llamada "Base de Datos " .
 * esta ventana nos ayuda a ver los datos de las diferentes cuentas.
 * @author Joel Mauricio Mamani Mamani.
 */
public class BaseDeDatos extends javax.swing.JFrame {
public DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Objeto que representa la clase Principal del sistema.
     * En este objeto se guardan los distinas datos delas cuentas y clientes,
     * tambien se guardara en el fichero y  se leera del fichero si se lo nesesita.
     */
     public Principal principal = new Principal ();
    /**
     * Crea un nuevo objeto de tipo BaseDeDatos .
     * Este constructor ala ves tambien llena la ventana con datos de las cuentas.
     */
     public BaseDeDatos() {
        initComponents();
        setLocationRelativeTo(null);
        
        cargar();
       
        modelo.addColumn("Numero de cuenta");
        modelo.addColumn("Nombre Apellido");
        modelo.addColumn("Tipo de cuenta");
        modelo.addColumn("moneda");
        modelo.addColumn("Saldo ");
        
        llenarTabla();
        
    }
     /**
      * Este método se encarga de cargar los datos de los ficheros ala clase.
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
     * El método se encarga de llenar la tabla de la ventana con datos .
     * Al comienzo de este método se borra todos los datos de la nueva tabla para que no se duplique los datos
     * luego el método atraves de un for llena las filas de una nueva tabla con datos de todas las cuentas
     * por ultimo despues de llenar la nueva tabla se setea o cambia la tabla ya existente con esta nueva tabla.
     */
    public void llenarTabla(){
         //borra todos los elementos del modelo para que no se duplique
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        } 
        ArrayList <DATOS> historias= cargarDatos();
        for(DATOS datos : historias){
            Object a[]= new Object[5];
            a[0]= datos.getNumeroCuenta();
            a[1]= datos.getNombreApellido();
            a[2]= datos.getTipoCuenta();
            a[3]= datos.getTipoMoneda();
            a[4]= datos.getSaldo();
            modelo.addRow(a);
            
        }
       
        jTable1.setModel(modelo);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ACTUALIZAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 90, 710, 364));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BASE DE DATOS ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 40));

        ACTUALIZAR.setBackground(new java.awt.Color(9, 62, 62));
        ACTUALIZAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ACTUALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel1.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 140, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f4.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * El método es usado para actualizar los datos .
     * El método vuelve a cargar los datos del fichero ala clase,
     * Una ves cargado el metodo vuelve a llenar la tabla con los datos .
     * @param evt El evento de accion que desencadena esta operacion.
     */
    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed

        cargar();
        llenarTabla();

        // TODO add your handling code here:
    }//GEN-LAST:event_ACTUALIZARActionPerformed
    /**
     * El método cierra la ventana.
     * @param evt El evento de accion que desencadena esta operacion.
     */
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    /**
     * El método carga los datos de las cuentas a una ArrayList .
     * Se llena la lista con el tipo de dato "Datos"
     * El tipo de variable "Datos " contiene los distintos datos que se mostrara en la tabla .
     * @return Retorna una lista con todos los datos de las cuentas . 
     */
    public ArrayList<DATOS> cargarDatos(){
        
        ArrayList <DATOS> res= new ArrayList<>();
        for (int i = 0 ; principal.getListaCuenta().size()>i;i++){
                String numero=principal.getListaCuenta().get(i).getNumeroCuenta()+"";
                String nombre=nombre(principal.getListaCuenta().get(i).getUsuario());
                String cuenta=principal.getListaCuenta().get(i).getTipoCuenta();
                String moneda=principal.getListaCuenta().get(i).getMoneda();
                String saldo = principal.getListaCuenta().get(i).getSaldo()+"";
                DATOS datos = new DATOS(numero,nombre,cuenta,moneda,saldo);
                res.add(datos);
        
        }
    return res;
    }
    /**
     * El método buscara el nombre completo del usuario dado .
     * @param usu Es el nombre de usuario del que se buscara su nombre completo .
     * @return Retornara el nombre completo del dueño del usuario.
     */
    public String nombre (String usu){
        String res ="";
        for (int i =0 ; principal.getListaCliente().size()>i ;i++){
            if(principal.getListaCliente().get(i).getUsuario().equals(usu)){
                res = principal.getListaCliente().get(i).getNombre()+" "+principal.getListaCliente().get(i).getApellido();
            
            }
        
        }
    
    return res;
    }
    
    
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
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
