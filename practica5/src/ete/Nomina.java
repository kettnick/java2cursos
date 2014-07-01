/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ete;

/**
 *
 * @author T107
 */
public class Nomina {
    
    private float saldo;
    private int idTrabajador;

    public Nomina() {
    }

    public Nomina(float saldo, int idTrabajador) {
        this.saldo = saldo;
        this.idTrabajador = idTrabajador;
    }
    
 
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws SaldoFueraDeRango {
        if (saldo<=20000 || saldo >= 25000) throw new SaldoFueraDeRango ();
        this.saldo = saldo;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
    
}
