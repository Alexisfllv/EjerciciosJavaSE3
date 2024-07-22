package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Distintos
 */
public class Distintos {

    
    public static void main(String[] args) {
        //
        List<Integer> numeros =  Arrays.asList(1,2,3,4,3,3);
        List<Integer> diferentes = numeros.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
                                            //eliminara los elementos duplicados
                                            System.out.println(diferentes);
    }
}