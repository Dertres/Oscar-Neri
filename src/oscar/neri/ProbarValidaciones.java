/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oscar.neri;


public class ProbarValidaciones {
    
    public static void main(String[] args) {
        
        //Probaremos excepción solita
        float x=6;
        
        try{
            
            ValidarUsuario.validarNoNegativo(x);//no se requiere "new" porque ValidarUsuario es static
            System.out.println("Primero que lanza excepción");
            Usuario u=new Usuario();
            u.setAltura(-2);
            System.out.println("Excepción de ajuste de altura");
            u.setPeso(80);
            System.out.println("Excepción de ajuste de peso");
            
        }catch(NumeroNoNegativoException e){
            
            System.out.println(e.getMessage());
        
        }
    }
    
}
