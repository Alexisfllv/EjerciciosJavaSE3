package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Saltar
 */
public class Saltar {

    public static void main(String[] args) {
        //

        List<Integer> numeros =  Arrays.asList(1,2,3,4,5,6);
        List<Integer> saltados = numeros.stream()
                                            .skip(1)
                                            //omite los n primeros elementos
                                            .collect(Collectors.toList());
        System.out.println(saltados);
    }
}