/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;


public class ValidarAlumno {
    
    public static void validandoAlumno(int a) throws AlumnoMenorDe18{
    
        if(a<18)throw new AlumnoMenorDe18();
    
    }
    
}
