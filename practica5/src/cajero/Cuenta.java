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
public class Cuenta {
    
    private float cuenta;
    private float Saldo;

    public float getCuenta() {
        return cuenta;
    }

    public void setCuenta(float cuenta) {
        this.cuenta = cuenta;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) throws SaldoNegativoException {
        
        if (Saldo>0)
      this.Saldo = Saldo;   
    }
    
    
    
    
    
    
}
