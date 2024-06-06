/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;

/**
 *Esta clase modela el objeto DATOS.
 * @author Joel Mauricio Mamani Mamani.
 */
public class DATOS implements Serializable{
    /** numero de cuenta */
    public String numeroCuenta ;
    /** nombre y apellido del dueño de la cuenta */
    public String nombreApellido; 
    /** tipo de cuenta */
    public String tipoCuenta;
    /** tipo de moneda que guarda la cuenta */
    public String tipoMoneda;
    /** saldo que guarda la cuenta*/
    public String saldo;
    /**
     * metodo que cre un nuevo objeto DATOS
     * @param numeroCuenta numero de cuenta.
     * @param nombreApellido nombre y apellido del usuario .
     * @param tipoCuenta tipo de cuenta que es la cuenta .
     * @param tipoMoneda tipo de moneda que guarda la cuenta .
     * @param saldo saldo que guarda la cuenta .
     */
    public DATOS(String numeroCuenta, String nombreApellido, String tipoCuenta, String tipoMoneda, String saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreApellido = nombreApellido;
        this.tipoCuenta = tipoCuenta;
        this.tipoMoneda = tipoMoneda;
        this.saldo = saldo;
    }

    /**
     * El método devuelve  el numero de cuenta.
     * @return numero de cuenta.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * El método devuelve  el nombre y apellido del usuario.
     * @return nombre y apellido.
     */
    public String getNombreApellido() {
        return nombreApellido;
    }
    /**
     * El método devuelve  el tipo de cuenta .
     * @return tipo de cuenta.
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    /**
     * El método devuelve  el tipo de moneda que guarda la cuenta.
     * @return tipo de moneda.
     */
    public String getTipoMoneda() {
        return tipoMoneda;
    }
    /**
     * El metodo devuelve el saldo que tiene la cuenta .
     * @return saldo .
     */ 
    public String getSaldo() {
        return saldo;
    } 
}
