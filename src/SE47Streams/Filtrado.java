package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filtrado
 */
public class Filtrado {

    public static void main(String[] args) {
        
        List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6);
        List<Integer> paresNumeros =  numbers.stream()
                                                .filter(n -> n % 2 ==0)
                                                .collect(Collectors.toList());
        System.out.println(paresNumeros);

        //numbers.stream() =  Crear un stream a a partir de la lista de numeros

        //.filter(n -> n % 2 ==0) = Filtra los elementos pares

        //.collect(Collector.toList()); =  Recoge los elementos filtrados en una nueva lista
        

        

    }
}