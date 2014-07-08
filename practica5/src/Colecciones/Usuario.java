/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Colecciones;

/**
 *
 * @author T107
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private String paterno;
    private String email;
    private float sueldo;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String paterno, String email, float sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.email = email;
        this.sueldo = sueldo;
    }
    
    
    /**
     * Este es el metodo getId, si lo aplicas sobre un objeto de esta clase te regresa el id, que previamente
     * ya quedo ajustado por el metodo setid()
     * @return the id el tipo de retorno es el id del usuario
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", email=" + email + ", sueldo=" + sueldo + '}';
    }

  
   
    
    
}
