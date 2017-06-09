/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;


public class PrimerExcepcion {
 
    public static void main(String[] args) { //psvm + ctrl-spacebar
        
        //Aquí vamos a ver las excepciones de tipo unchecked, aquellas que el compilador no las detecta
        
        int[] enteros={1,3,5};
        
        //Trataremos de acceder a un elemento que no existe
        
        System.out.println("El elemento de  arreglo "+enteros[0]);
        
        System.out.println("El elemento de  arreglo "+enteros[3]);
        
        System.out.println("El elemento de  arreglo "+enteros[1]);
        
        
        
        
    }
    
    
    
}
