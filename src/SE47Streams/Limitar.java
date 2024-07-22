package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Limitar
 */
public class Limitar {

    
    public static void main(String[] args) {
        
        //
        List<Integer> numeros = Arrays.asList(3,4,5,2,1);

        List<Integer> ordanmientoLimitado = numeros.stream()
                                                    .sorted()
                                                    //ordena solo las cantidades max size : 
                                                    .limit(2)
                                                    .collect(Collectors.toList());
        System.out.println(ordanmientoLimitado);
    }
}