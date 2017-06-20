/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionesUno;


public class Nomina {
    
    //Encapsular esta clasecita y agregaos constructores
    
    private String nombre;
    private String APaterno;
    private long numeroSeguro;
    private float sueldoBase;

    public Nomina(String nombre, String APaterno, long numeroSeguro, float sueldoBase) {
        this.nombre = nombre;
        this.APaterno = APaterno;
        this.numeroSeguro = numeroSeguro;
        this.sueldoBase = sueldoBase;
    }

    public Nomina() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public long getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(long numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
    
}
