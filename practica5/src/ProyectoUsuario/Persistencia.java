/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoUsuario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Wally
 */
public class Persistencia {
    
     public static ArrayList <Usuario> buscarTodos()throws Exception{
        ArrayList <Usuario> usuarios = new ArrayList <Usuario> ();
       
        
        //Paso 1 poner archivo
        File f = new File("archivaldo2.ser");
        //Paso 2 
        FileInputStream fis = new FileInputStream(f);
        //Paso 3
        ObjectInputStream ois = new ObjectInputStream (fis);
        
        usuarios = (ArrayList <Usuario>)ois.readObject();
        return usuarios;
    }//termina buscarTodos
  
      public static void guardar (Usuario u) throws Exception{
        ArrayList <Usuario> usuarios = new ArrayList <Usuario> ();
        
        //Paso 1
         File f = new File ("archivaldo2.ser");
         if(f.exists()){
          
         
             usuarios = buscarTodos();
             
         
         
         }
         
         FileOutputStream fos = new FileOutputStream(f);
         ObjectOutputStream oos = new ObjectOutputStream (fos);
           
            usuarios.add(u);
             oos.writeObject(usuarios);
             
    }//termina guardar
      
       public static Usuario  buscarPorId(int id) throws Exception{
        
       Usuario o = new Usuario();
        o = buscarTodos().get(id);
        
       return o;
       
       
    
}
       
       public static void borrar (int id) throws Exception {
           ArrayList <Usuario> usuarios = buscarTodos();
           usuarios.remove(id);
           
       }
       
}

