/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checadas;

import java.io.*;   //io->input/output

public class ModeloArchivo {
    
    //Método para escribirlo
    
    public void escribirArchivo()throws FileNotFoundException, IOException{//Se puede poner a la clase madre (Exception) en lugar de declarar cada una pero no es recomendable
        
        //Paso 1: generar el archivo
        File archivo=new File("archivaldo"); //File está dentro del paquete java.io
        
        //Paso 2(importante):
        FileOutputStream fos=new FileOutputStream(archivo); //encadenamiento por constructor por ocupar un argumento declarado previamente
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        String miObjeto="Este es un objeto de la clase String muy simple";
        oos.writeObject(miObjeto);//el objeto a guardar aquí puede ser cualquier objeto
        System.out.println("Se guardó tu String con éxito");
        
    
    
    }
            
    
}
