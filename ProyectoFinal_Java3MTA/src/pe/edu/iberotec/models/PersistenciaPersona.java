/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.iberotec.models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jerson
 */
public class PersistenciaPersona implements Serializable{
    
        public static void SaveData(ArrayList<Persona> listPersona) {
        try {
            FileOutputStream file = new FileOutputStream("Persona.ser");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(listPersona);
            stream.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
    
    public static ArrayList<Persona> LoadData() {
        ArrayList<Persona> listProducto = null;
        try {
            FileInputStream file = new FileInputStream("Cliente1.ser");
            ObjectInputStream stream = new ObjectInputStream(file);
            listProducto = (ArrayList<Persona>) stream.readObject();
            stream.close();
        } catch (Exception e) {            
            try {
                ArrayList<Persona> listadoProd = new ArrayList<>();
                FileOutputStream file = new FileOutputStream("Cliente1.ser");
                ObjectOutputStream stream = new ObjectOutputStream(file);
                stream.writeObject(listadoProd);
                stream.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo recrear el archivo, intente cerrar y reabrir la aplicación","Error fatal", JOptionPane.ERROR_MESSAGE);
                
            }
            JOptionPane.showMessageDialog(null, "Hubo un error leyendo el archivo que contenía los datos de las Peronas, puede que el archivo" + "\n"                                            
                                              + "haya sido borrado o modificado, si no recuerda haberlo hecho usted, contacte al administrador." + "\n"
                                              + "Por ahora, el archivo será recreado automaticamente y podrá trabajar con normalidad, pero los" + "\n"
                                              + "datos anteriores no serán recuperados", "Error leyendo el archivo" , JOptionPane.WARNING_MESSAGE);
            listProducto = null;
        }        
        return (listProducto!=null)? listProducto : 
                                new ArrayList<Persona>();                  
    }   
}
