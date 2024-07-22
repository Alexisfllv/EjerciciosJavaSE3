package SE47Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Reducir
 */
public class Reducir {

    
    //
    public static void main(String[] args) {
        
        //
        List<Integer> numeros =  Arrays.asList(1,2,3,4,5);

        //variable que almacene todo esos datos
        int suma =  numeros.stream()
                            .reduce(0,Integer::sum);
        System.out.println(suma);

        //.reduce() , valor inicial 0 + ,  
    }
}