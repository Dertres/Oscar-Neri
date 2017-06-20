/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionesUno;


public class NominaContrato extends Nomina{

    public NominaContrato() {
    }

    
    
    
    public NominaContrato(String nombre, String APaterno, long numeroSeguro, float sueldoBase) {
        super(nombre, APaterno, numeroSeguro, sueldoBase);
    }

    
    //Todo se hereda, menos los constructores, los métodos set y get sí, así como los atributos
    //public NominaContrato(){
    
        //super();//invoca el constructor de defecto
        //super("Hola","Campos",12l,45000f);//No hay error porque la invocación está completa, invocando los 4 parámetros
        //de la clase padre (nombre,APaterno,numeroSeguro,sueldoBase)
        
        //super(nombre,aPaterno,numeroSeguro,sueldoBase);//perfeccionamiento---método dos=insert code->constructor->
        //
        
            
    //En las superclases abstractas no se pueden crear objetos a partir de ella    
        
                                            
    }
    
    

