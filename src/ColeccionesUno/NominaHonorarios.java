/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionesUno;


public class NominaHonorarios extends Nomina{
    
    //Poner atributos faltantes
    private float isr,iva;

    public NominaHonorarios() {
    }
    
    
    //Método corto:click derecho->constructor

    public NominaHonorarios(float isr, float iva, String nombre, String APaterno, long numeroSeguro, float sueldoBase) {
        super(nombre, APaterno, numeroSeguro, sueldoBase);
        this.isr = isr;
        this.iva = iva;
    }
    
    

    public float getIsr() {
        return isr;
    }

    public void setIsr(float isr) {
        this.isr = isr;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    
}
