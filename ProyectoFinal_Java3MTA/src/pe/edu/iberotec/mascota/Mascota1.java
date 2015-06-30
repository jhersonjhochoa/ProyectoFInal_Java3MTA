/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.iberotec.mascota;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jerson
 */
public class Mascota1 implements Serializable{
    public static void SaveData(ArrayList<Mascota1> listProducto) {
        try {
            FileOutputStream file = new FileOutputStream("Mascota.ser");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(listProducto);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Mascota> LoadData() {
        ArrayList<Mascota> listProducto = null;
        try {
            FileInputStream file = new FileInputStream("Mascota.ser");
            ObjectInputStream stream = new ObjectInputStream(file);
            listProducto = (ArrayList<Mascota>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
            listProducto = null;
        }        
        return (listProducto!=null)? listProducto : 
                                new ArrayList<Mascota>();             
    }

    public static void LoadData(ArrayList<Mascota> listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
