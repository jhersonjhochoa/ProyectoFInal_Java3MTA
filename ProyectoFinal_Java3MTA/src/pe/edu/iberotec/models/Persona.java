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
    private int id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    private int DNI;
    private int edad;
    
    
}
