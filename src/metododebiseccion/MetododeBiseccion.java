package metododebiseccion;

/**
 *
 * @author ricar
 */
public class MetododeBiseccion {
    
    
    public static void main(String[] args) {

         
        Metodo metodo = new Metodo();
        
        
    
    metodo.setFuncion("4x^2+x+10");
        System.out.println("x: " + metodo.biseccion(1,2, 0.001));   
        
    }
    
}
