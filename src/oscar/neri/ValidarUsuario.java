/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oscar.neri;


public class ValidarUsuario {
    
    public static void validarNoNegativo(float numero) throws NumeroNoNegativoException{//throws->indica la posibilidad de-se ocupa al verificar la lógica
    //se colocó static hace el código más rápido porque static indica que debe de ser visible para todos, los static se ejecutan primero
    if(numero<0)throw new NumeroNoNegativoException();    
        
        
    }
    
    
}
