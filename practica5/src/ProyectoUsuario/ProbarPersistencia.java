/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoUsuario;

import UsuariosId.GuardarUsuario;
import UsuariosId.UsuarioId;
import java.util.ArrayList;

/**
 *
 * @author Wally
 */
public class ProbarPersistencia {
    
    public static void main (String arg []){
        //Guardar algo
        
        Usuario u1 = new Usuario (1, "Juan", 20000);
        Usuario u2 = new Usuario (2, "Ana", 50000);
        
        Persistencia.guardar(u1);
        Persistencia.guardar(u2);
        
        
        ArrayList <Usuario> usuarios = Persistencia.buscarTodos();
        
        
        for (Usuario asu : usuarios){
        
            System.out.println(asu);
            
        }
    }
    
}
