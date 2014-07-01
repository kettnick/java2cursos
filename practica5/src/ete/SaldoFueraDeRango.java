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
public class SaldoFueraDeRango extends Exception{
    
    public SaldoFueraDeRango(){
        super("Esta fuera de Rango");
        System.out.println("esta fuera de  rango");
        
    }
    
}
