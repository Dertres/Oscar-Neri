/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oscar.neri;

/**
 *
 * @author T-
 */
public class Malo {
    
public static void main(String[] args){

    int arreglo[]={4,-45,7,6,3};
    /*for(int i=0;i<arreglo.length;i++){
        
        System.out.println(arreglo[i]);
    
    }*/
    
    //Nuevo ciclo for
    for(int x:arreglo){ //en x se deposita el elemento por cada iteración, este es más expresivo
    
        System.out.println(x);
    
    }
    
}

}
