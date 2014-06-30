/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cajero;

/**
 *
 * @author Wally
 */
public class SaldoNegativoException extends Exception{
    
    public SaldoNegativoException (){
        
        super ("Saldo insuficiente");
        System.out.println ("Saldo insuficiente");
        
    }
    
}
