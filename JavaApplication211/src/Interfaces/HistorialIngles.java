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
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 * Esta clase es una ventana que muestra las diferentes historia de la cuenta.
 * @author Joel Mauricio Mamani Mamani.
 */

public class HistorialIngles extends javax.swing.JFrame {
        /** tabla para ver las diferentes historias*/

    DefaultTableModel modelo = new DefaultTableModel();
    /**Variable para guardar el nombre del usuario para toda la clase */

    public String usuario = "null";
        /**Variable para guardar el numero de cuenta para toda la clase */

     public int numeroCuenta=000;
     /** Este objeto es el que se guarda en el fichero y tambien se lee del fichero si se lo nesesita.*/
     public Principal principal = new Principal ();
    /**
     * Crea un objeto de tipo Historial en el idioma ingles.
     */
    public HistorialIngles() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * crea un objeto de tipo Historial en el idioma ingles.
     * El método cambia los datos de usuario, numero de cuenta , carga los datos
     * , tambien da nombres alas columnas dela nueva tabla llamada modelo despues llama
     * a un metodo para llenar esa tabla nueva tabla.
     * @param name nuevo nombre de usuario para la interfas.
     * @param numerocuen  nuevo numero de cuenta para la interfas.
     */
    public HistorialIngles(String name,int numerocuen){
        initComponents();
        this.usuario=name;
        this.numeroCuenta=numerocuen;
        cargar();
       
        modelo.addColumn("fecha");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Monto");
        modelo.addColumn("Rem/Dest");
        modelo.addColumn("N° cuenta del Rem/Dest ");
        modelo.addColumn("Saldo ");
        llenarTabla();
    
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
        ArrayList <Historia> historias= buscarHistorial (numeroCuenta);
        for(Historia historia : historias){
            Object a[]= new Object[6];
            a[0]= historia.getFecha();
            a[1]= historia.getDescripcion();
            a[2]= historia.getMonto();
            a[3]= historia.getDestinatario();
            a[4]= historia.getCuenta();
            a[5]= historia.getSaldo();
            modelo.addRow(a);
            
        }
       
        jTable1.setModel(modelo);
     }
    /**
     * El método se encarga de buscar la lista de histoira  de la cuenta que le proporcines.
     * 
     * @param numerocuenta numero de cuenta de la cuenta que se busca la lista de historias.
     * @return lista con las historias de la cuenta.
     */
    public ArrayList <Historia> buscarHistorial (int numerocuenta){
         ArrayList <Historia> res  = new ArrayList <>();
         for(int i= 0;principal.getListaCuenta().size()>i;i++){
             if(principal.getListaCuenta().get(i).getNumeroCuenta()==numerocuenta){
                 res = principal.getListaCuenta().get(i).getListaHistoria();
                 break;
             }
         }
    
    
    
         return res ;
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BANK REPORT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 260, 40));

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 670, 360));

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BACK");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuIngles ventana = new MenuIngles (usuario,numeroCuenta);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
