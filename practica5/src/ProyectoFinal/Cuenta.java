/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

import java.io.Serializable;

/**
 1.-Agregar setter y getters
  2.-agregarle constructor e inicializar los atributos,
  3.-sobre escribir el metodo
  4.-toString() y encapsular
  5.- preparar la clase para ser serializada (comprimida)
 */
public class Cuenta implements Serializable{
    
    private String nombre;
    private float numero;
    private float saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, float numero, float saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    
    
}
