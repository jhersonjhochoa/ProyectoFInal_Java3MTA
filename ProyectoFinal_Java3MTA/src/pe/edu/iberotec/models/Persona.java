/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.iberotec.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jerson
 */
public class Persona implements Serializable{

    public static ArrayList<Persona> LoadData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Cliente nombre;
    private Cliente apellidos;
    private Cliente direccion;
    private Cliente telefono;

    public Cliente getNombre() {
        return nombre;
    }

    public void setNombre(Cliente nombre) {
        this.nombre = nombre;
    }

    public Cliente getApellidos() {
        return apellidos;
    }

    public void setApellidos(Cliente apellidos) {
        this.apellidos = apellidos;
    }

    public Cliente getDireccion() {
        return direccion;
    }

    public void setDireccion(Cliente direccion) {
        this.direccion = direccion;
    }

    public Cliente getTelefono() {
        return telefono;
    }

    public void setTelefono(Cliente telefono) {
        this.telefono = telefono;
    }
    
    
}
