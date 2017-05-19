package oscar.neri;
public class Imc {
    
    public float calcular(Usuario u){ // "public" es un modificador de acceso
        //Aquí va la lógica del cálculo
        float resultado=u.peso/(u.altura*u.altura);
        
        return resultado;

}
    
}
