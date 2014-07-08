/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Coleccion {
    
    public static void main (String args []){
        
        Usuario u1= new Usuario ();
        u1.setId(1);
        u1.setNombre("kett");
        u1.setPaterno("cruces");
        u1.setEmail("gum_82@live");
        u1.setSueldo(60000);
        
        Usuario u2=  new Usuario( 2, "nicteha", "crz", "kett_562@live", 50000);
        Usuario u3 = new Usuario (3, "meli", "de la rosa", "kot_28@live", 82000);
        
        //Creamos un ArrayList  de tipo Usuario
        
        ArrayList <Usuario> usuarios = new ArrayList <Usuario> ();
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        for (Usuario u: usuarios){
            
            System.out.println(u);
            
            
        }
        
        
   
        
        
    }
    
}
