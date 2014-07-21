/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoUsuario;

import java.util.ArrayList;

/**
 *
 * @author Wally
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private float sueldos;
     private ArrayList <UsuariosId.Usuario> usuarios;

    public Usuario(int id, String nombre, float sueldos) {
        this.id = id;
        this.nombre = nombre;
        this.sueldos = sueldos;
    }

    public Usuario() {
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

    public float getSueldos() {
        return sueldos;
    }

    public void setSueldos(float sueldos) {
        this.sueldos = sueldos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", sueldos=" + sueldos + '}';
    }
    
    
    
}
