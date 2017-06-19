/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oscar.neri; //Debe de estar en todos los archivos "java class", de lo contrario no se ejecutará el programa


public class OscarNeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("¡Hola mundo cruel!");//sout -> ctrl+spacebar->enter
        
        //Prueba de solución
        
        //Crear usuario hipotético
        Usuario u=new Usuario();
        
        //Asignar valores
        u.altura=1.68f; //f de flotante
        u.peso=73f;
        
        //Genereamos el modelo
        Imc imc=new Imc();
        
        
        System.out.println("El IMC es de "+ imc.calcular(u));
        
        
    }
    
}