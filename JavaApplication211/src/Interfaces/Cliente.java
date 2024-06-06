/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * Esta clase modela el objeto Cliente .
 
 * @author Joel Mauricio Mamani Mamani.
 */
public class Cliente implements Serializable {
    /** Es el nombre del cliente*/
    public String nombre;
    /** Es el apellido del cliente*/
    public String apellido;
    /** Es la cedula de identidad del cliente*/
    public int ci;
    /** Es la direccion del cliente */
    public String direccion;
    /** Es el telefono del Cliente */
    public int telefono;
    /** Es el nombre de usuario del cliente*/
    public String usuario;
    /** Es la contraseña del cliente */
    public String contraseña;
    /**
     * Crea un objeto Cliente.
     * @param nombre Nombre del nuevo cliente.
     * @param apellido Apellido del nuevo cliente.
     * @param ci Cedula de identidad del nuevo cliente.
     * @param direccion Direccion del nuevo cliente.
     * @param telefono Telefono del nuevo cliente.
     * @param usuario Nombre de usuario del nuevo cliente.
     * @param contraseña Contraseña del nueco cliente.
     */
    public  Cliente (String nombre,String apellido,int ci,String direccion,int telefono,String usuario,String contraseña){
        
        this.nombre= nombre;
        this.apellido=apellido;
        this.ci=ci;
        this.direccion=direccion;
        this.telefono =telefono;
        this.usuario=usuario;
        this.contraseña=contraseña;
        
    
    }
    /**
     * El método devuelve el nombre del cliente.
     * @return el nombre de cliente.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * El método actualiza el nombre del cliente.
     * @param nombre El nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * El método devuelve el apellido del cliente.
     * @return El apellido de cliente.
     */

   
    public String getApellido() {
        return apellido;
    }
    /**
     * El método actualiza el Apellido del cliente.
     * @param apellido El nuevo Apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * El método devuelve el numero de la cedula de identidad del cliente.
     * @return El numero de la cedula de identidad del cliente.
     */
    public int getCi() {
        return ci;
    }
    /**
     * El método actualiza el Apellido del cliente.
     * @param ci El nuevo Apellido del cliente.
     */
    public void setCi(int ci) {
        this.ci = ci;
    }

    /**
     * El método devuelve la direccion del cliente.
     * @return Direccion del cliente.
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * El método actualiza la direccion del cliente.
     * @param direccion la nuevo direccion del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   /**
     * El método devuelve el numero de telefono del cliente.
     * @return Numero de telefono.
     */
    public int getTelefono() {
        return telefono;
    }
    /**
     * El método actualiza el telefono del cliente.
     * @param telefono El nuevo telefono del cliente.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    /**
     * El método devuelve el nombre de usuario del cliente.
     * @return Nombre de usuario del cliente.
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * El método actualiza el usuario del cliente.
     * @param usuario El nuevo usuario del cliente.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * El método devuelve la contraseña del cliente.
     * @return Contraseña del cliente.
     */
    public String getContraseña() {
        return contraseña;
    }
    /**
     * El método actualiza la contraseña del cliente.
     * @param contraseña La nueva contraseña del cliente.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
