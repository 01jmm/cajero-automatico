/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *Esta clase modela el objeto Historia.
 * @author Joel Mauricio Mamani Mamani.
 */
public class Principal implements Serializable {
    /** lista que guardara la informacion de las diferentes cuentas*/
     public ArrayList <Cuenta> listaCuenta ;
     /** lista que guardara la informacion de los clientes*/
    public ArrayList <Cliente> listaCliente ;
    /**
     * metodo que cre un nuevo objeto Principal.
     */
    public Principal (){
    listaCuenta=new ArrayList ();
     listaCliente=new ArrayList ();
    
    }
    /**
     * El método devuelve la lista de clientes.
     * @return lista de clientes .
     */
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    /**
     * El método devuelve la lista de cuentas.
     * @return lista de cuentas .
     */
    public ArrayList<Cuenta> getListaCuenta() {
        return listaCuenta;
    }

    
}
