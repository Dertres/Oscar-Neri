/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;


public class ProbandoValidaciones {
    
    public static void main(String[] args) {
        
        try{
            
        int x=18;
        ValidarAlumno.validandoAlumno(x);
        System.out.println("OK");
        
        Alumno al=new Alumno();
        al.setEdad(18);
        System.out.println("OK");
        al.setNombre("Arturo");
        System.out.println("OK");
        al.setNumCuenta(13132254);
        System.out.println("OK");
    
        
        }catch(AlumnoMenorDe18 e){
        
            System.out.println(e.getMessage());
        
        }
        
    }
    
    
            
    
    
}
