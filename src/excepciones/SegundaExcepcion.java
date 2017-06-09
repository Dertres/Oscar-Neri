/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-
 */
public class SegundaExcepcion {
    
    public static void main(String[] args) {
        
        //Otra excepción muy conocida de tipo unchecked es la NumberFormatException
        
        /*String falsoNumero="cuatro";
        int numeroVerdadero=5;
        
        //Convertimos falsoNumero
        int corregido= Integer.parseInt(falsoNumero);
        System.out.println(corregido+numeroVerdadero);*/
        int cero=6/0;
        System.out.println(""+cero);
        
    }
    
}
