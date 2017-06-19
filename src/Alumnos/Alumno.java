/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;


public class Alumno {
    
    int numCuenta;
    int edad;
    String nombre;
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) throws AlumnoMenorDe18{
        ValidarAlumno.validandoAlumno(numCuenta);
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws AlumnoMenorDe18{
        ValidarAlumno.validandoAlumno(edad);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }
    
    
    
    
}
