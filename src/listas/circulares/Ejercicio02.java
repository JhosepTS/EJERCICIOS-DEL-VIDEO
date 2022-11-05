
package listas.circulares;
//Jhosep TS
import java.util.ArrayList;
import java.util.List;

public class Ejercicio02 {

    public static void main(String[] args) {
       List<String> lis_nombres = new ArrayList<>();
       lis_nombres.add("Walter");
       lis_nombres.add("Paul");
       lis_nombres.add("Samuel");
       lis_nombres.add("Sonia");
        System.out.println("tamaño: "+lis_nombres.size());
        
        System.out.println("Dato posicion 0: "+lis_nombres.get(0));
        lis_nombres.remove(1);
        System.out.println("tamaño: "+lis_nombres.size());
    }
    
}
