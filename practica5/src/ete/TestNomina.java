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
public class TestNomina {
    
    public static void main (String args[]){
        
        Nomina n1 = new Nomina(20000,1);
        Nomina n2 = new Nomina (27496.50f, 2);

          try{
        n2.setSaldo(300000);
        
          }catch (SaldoFueraDeRango e){
              System.out.println(e.getMessage());
          }
        
        
        
    }
    
}
