/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * Esta clase modela el objeto Cuenta.
 * @author Joel Mauricio Mamani Mamani
 */
public class Cuenta implements Serializable {
    /** numero de cuenta del cliente */
    public int numeroCuenta;
    /** variable que guardara el tipo de moneda que guardara la cuenta si es false sera dolares y si es true sera bolivianos*/
    public String moneda ;//si es false es dolares si es true es bolivianos o falso para dolares y true para bolivianos
    /** saldo del cliente */
    public double saldo;
    /** tipo de cuenta que podria ser cuenta de  debito,credito o ahorro*/
    public String tipoCuenta;
    /** nombre de usuario del dueño de la cuenta */
    public String usuario ;
    /** lista donde se guardara las historia o movimientos que se aga con la cuenta */
    public ArrayList <Historia> Historia = new ArrayList();
    /**
     * Crea un objeto Cuenta.
     * @param numerocuenta Numero de identificacion de la nueva cuenta.
     * @param moneda Tipo de moneda que guardara la cuenta .
     * @param saldo Saldo de la nueva cuenta.
     * @param tipoCuenta El tipo de cuenta que sera la nueva cuenta.
     * @param usuario El nombre de usuario del dueño de la nueva cuenta.
     */
    
    public  Cuenta (int numerocuenta , String moneda,double saldo,String tipoCuenta,String usuario){
    
        this.numeroCuenta=numerocuenta;
        this.moneda = moneda;
        this.saldo=saldo;
        this.tipoCuenta= tipoCuenta;
        
        this.usuario=usuario;
    }
    
   /**
     * El método devuelve el numero de cuenta.
     * @return Numero de cuenta.
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * El método devuelve el tipo de moneda.
     * @return tipo de moneda "si es false sera dolares , si es false sera dolares"
     */
    

    public String getMoneda() {
        return moneda;
    }
    /**
     * El método devuelve el tipo de cuenta.
     * @return Tipo de cuenta.
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    /**
     * El método devuelve el saldo.
     * @return saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * El método actualiza el saldo de la cuenta.
     * @param saldo El nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * El método devuelve la lista con las historias de la cuenta.
     * @return lista con las historias de la cuenta.
     */
    public ArrayList<Historia> getListaHistoria(){
        return Historia;
    
    }
    /**
     * El método devuelve el nombre de usuario del dueño dela cuenta. 
     * @return Nombre de usuario.
     */
    public String  getUsuario(){
        return usuario;
    
    }
}
