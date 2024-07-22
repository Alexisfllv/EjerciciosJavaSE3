package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ordenar
 */
public class Ordenar {

    
    public static void main(String[] args) {
        //
        List<String> palabras = Arrays.asList("manzana","apple","pina","sandia");
        
        List<String> sorteo =  palabras.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println(sorteo);

        List<Integer> numeros =  Arrays.asList(1,4,6,2,4,8,4,3,5);
        
        List<Integer> ordenamientoNumeros = numeros.stream()
                                                    .sorted()
                                                    .collect(Collectors.toList());
        System.out.println(ordenamientoNumeros);
    
    }
}