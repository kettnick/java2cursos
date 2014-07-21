/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UsuariosId;

import java.util.ArrayList;

/**
 *
 * @author Wally
 */
public class ProbarPersistencia {
    
    public static void main (String arg []){
        //Guardar algo
        
        UsuarioId u1 = new UsuarioId (1, "Juan", 20000);
        UsuarioId u2 = new UsuarioId (2, "Ana", 50000);
        
        GuardarUsuario.guardar(u1);
        GuardarUsuario.guardar(u2);
        
        ArrayList <Usuario> usuarios = UsuarioId.buscarTodos();
        
        for (Usuario asu : usuarios){
            System.out.println(asu);
            
        }
    }
}
