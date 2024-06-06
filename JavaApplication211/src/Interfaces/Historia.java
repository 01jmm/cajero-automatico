/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.io.Serializable;
/**
 *Esta clase modela el objeto Historia.
 * @author Joel Mauricio Mamani Mamani.
 */
public class Historia implements Serializable{
    /** fecha de la creacion de la  historia*/
    public String fecha ;
    /** descripcion de la historia*/
    public  String descripcion;
    /** Monto que se movio al hacer las distintas operaciones*/
    public String monto;
    /** informacion o nombre del destinatario o dueño de la cuenta destinada*/
    public String destinatario;
    /** numero de cuenta del destinatario*/
    public int  cuentadestinatario ;
    /** saldo total de la cuenta */
    public String saldo;
    /**
     * metodo que cre un nuevo objeto Historia.
     * @param fecha fecha de la historia. 
     * @param descripcion descripcion de la historia.
     * @param monto monto que se movio en la operacion.
     * @param destinatario nombre del destinatario.
     * @param cuentadestinario numero de cuenta del destinatario.
     * @param saldo saldo total de la cuenta.
     */
    public Historia(String fecha ,String descripcion,String monto,String destinatario,int cuentadestinario,String saldo){
    this.fecha=fecha;
    this.descripcion=descripcion;
    this.monto=monto;
    this.cuentadestinatario=cuentadestinario;
    this.destinatario=destinatario;
    this.saldo=saldo;
    
    }
    /**metodo que crea un nuevo objeto Historia.
     */
    public Historia(){
    this.fecha=null;
    this.descripcion=null;
    this.monto=null;
    this.cuentadestinatario = 00;
    this.destinatario=null;
    this.saldo=null;
    
    }
    
    
    /**
     * El método devuelve  els saldo  de la cuenta.
     * @return saldo .
     */
     public String getSaldo() {
        return saldo;
    }
     /**
     * El método devuelve nombre del destinatario.
     * @return nombre del destinatario .
     */
    public String getDestinatario() {
        return destinatario;
    }
     /**
     * El método devuelve numero de cuenta del destinatario.
     * @return numero de cuenta del  destinatario .
     */
    public int  getCuenta() {
        return cuentadestinatario;
    }
    /**
     * El método devuelve la fecha de la historia.  
     * @return fecha.
     */
    public String getFecha() {
        return fecha;
    }
    
    
    
    /**
     * El método devuelve la descripcion de la historia.  
     * @return descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    
    
    /**
     * El método devuelve el monto de la historia.  
     * @return monto.
     */
    public String getMonto() {
        return monto;
    }
}
