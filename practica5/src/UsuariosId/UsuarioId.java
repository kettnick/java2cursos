/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UsuariosId;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Wally
 */
public class UsuarioId {
    
    private int id;
    private String nombre;
    private float sueldo;
    private ArrayList <Usuario> usuarios;
    
   
    

    public UsuarioId(int id, String nombre, float sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public UsuarioId() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "UsuarioId{" + "id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    public ArrayList <Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList <Usuario> usuarios) {
        this.usuarios = usuarios;
    }

   
    
   
            
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
  


    
    
}

