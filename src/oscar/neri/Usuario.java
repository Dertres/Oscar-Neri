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
public class Usuario {
    float peso;
    float altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws NumeroNoNegativoException {
        ValidarUsuario.validarNoNegativo(peso);
        this.peso = peso;//ajusta el peso
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws NumeroNoNegativoException{
        ValidarUsuario.validarNoNegativo(altura);
        this.altura = altura;//ajusta la altura 
    }
           
}
