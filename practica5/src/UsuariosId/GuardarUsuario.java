/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UsuariosId;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Wally
 */
public class GuardarUsuario {
   
    
    public static void guardar (Usuario u) throws Exception{
        ArrayList <Usuario> usuarios = new ArrayList <Usuario> ();
        
        //Paso 1
         File f = new File ("archivaldo2.ser");
         if(f.exists()){
             
         UsuarioId.buscarTodos();
         
         
         }
         
         FileOutputStream fos = new FileOutputStream(f);
         ObjectOutputStream oos = new ObjectOutputStream (fos);
           
            usuarios.add(u);
             oos.writeObject(usuarios);
             
    }//termina guardar
    
}
