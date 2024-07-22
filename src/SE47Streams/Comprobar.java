package SE47Streams;

import java.util.Arrays;
import java.util.List;

/**
 * Comprobar
 */
public class Comprobar {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        Boolean todospositivos =  numeros.stream()
                                            .allMatch(n -> n > 0);
                                            //si todos elementos del stream cumplen con el predicado
        System.out.println(todospositivos);
    }
}