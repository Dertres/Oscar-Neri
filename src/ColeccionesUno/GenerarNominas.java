/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionesUno;

import java.util.*;

public class GenerarNominas {
    
    
    public static void main(String[] args) {
        
        //Generar el siguiente trabajador por contrato: Juan López-1234-$45000
        
        NominaContrato nc=new NominaContrato("Juan","López",1234,45000);
        
        //Generar el siguiente trabajador por honorario: Ana Pérez-4321-$60000-iva=16%-isr=16%
        
        NominaHonorarios nh=new NominaHonorarios(0.16f, 0.16f, "Ana", "Pérez", 4321, 60000);
        
        
        //Generamos un arrayList para meter las 2 nóminas anteriores
        
        ArrayList<Nomina> misNominas=new ArrayList<>();             //<> -> operador diamante
        //Arreglo mutable
        
        //Agregando objetos a este arreglo de tipo arrayList
        
        //Método add -> método polimórfico
        misNominas.add(nc);
        misNominas.add(nh);
        
        //Iterando(recorriendo) la arraylist y verificando que se agregaron los objetos se usa el for mejorado
        
        for(Nomina nomina: misNominas){
        
            System.out.println("El nombre del usuario es: "+nomina.getNombre());
        
        }
        
        //Inyección de dependencias
    }
    
}
