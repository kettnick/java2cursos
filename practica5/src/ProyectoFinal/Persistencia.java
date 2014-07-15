/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

/*
la logica nos va a ayudar a guardar un objeto de cuenta 
 */

import java.io.*;
import java.util.ArrayList;

public class Persistencia {
    
    Cuenta c;
    
    public void guardar(Cuenta c){ //representacion que se va a guardar//
        
        try{
            //paso uno para guardar
             File f = new File("achivaldo.xxx");//crea el archivo fisico sin contenido
             //Encadenamos el archivo a la salida
             FileOutputStream fos= new FileOutputStream (f);//va a utilizar FileOutStream salir o ser creado el archivo a computadora
             //Creamos el objeto a serializar
             ObjectOutputStream oos= new ObjectOutputStream(fos);//el archivo ponerle contenido con el writeobject 
             ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
             oos.writeObject(cuentas);//crea el archivo con contenido
             System.out.println("Guardado con exito!!!");
     
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
        
        
    }
    //leer 
    public Cuenta leer(){
        
        Cuenta c= new Cuenta();
        try{
        //Para leer un archivo son los mismos pasos
            //Paso 1: Abrir el archivo a leerse 
            File f = new File("archivaldo.xxx");
            //Paso2: El siguiente renglon indica que el archivo se leera (entra el archivo)
            FileInputStream fis = new FileInputStream(f);
            //Paso 3:Leeremos el contenido
            ObjectInputStream ois = new ObjectInputStream(fis);
            
                        c =(Cuenta)   ois.readObject();
         
        }catch(Exception e){
        
        }
        
        
        return c;
        
        
    }
    
}
