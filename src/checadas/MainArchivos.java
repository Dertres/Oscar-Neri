/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checadas;

import java.io.*;

//throws es para depurar (backend), el try-catch es para producción(frontend)
public class MainArchivos {
    
    public static void main(String[] args) {
        
        try{
            
            //Generamos un objeto de tipo ModeloArchivo
            ModeloArchivo modelo=new ModeloArchivo();
            
            //Invocamos al método para escribir el archivo
            
            modelo.escribirArchivo(); //la combinación try-finally ya no funciona por esta excepción | este es el porqué de generar las catch
            System.out.println("Se generó el archivo exitosamente");
            
            //se egenera un archivo de tipo bytecode, la cual es serializada (se comprime)
        
        }catch (FileNotFoundException e){//esta excepción pertenece a la familia de java.io
        
            System.out.println(e.getMessage());
        
        
        
        }catch (IOException e){//esta excepción pertenece a la familia de java.io
        
            System.out.println(e.getMessage());
        
            
            
        }catch(Exception e){//Recibe cualquier excepción generada, no solamente las declaradas anteriormente
        
            System.out.println(e.getMessage());
        
        
        }finally{//siempre se ejecutará lo que esté dentro de aquí|Se ocupa para bases de datos, para cerrar la conexión a la BD para evitar saturar la memoria
        
            System.out.println("Este siempre se ejecuta");
        
        }
        
    }
    
}
