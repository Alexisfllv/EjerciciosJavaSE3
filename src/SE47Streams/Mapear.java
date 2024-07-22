package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Mapear
 */
public class Mapear {

    

    public static void main(String[] args) {
        

        //
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        
        List<Integer> numerosReales =  numbers.stream()
                                                .map(n -> n * 2)
                                                .collect(Collectors.toList());
        System.out.println(numerosReales);

        //numbers.stream() =  Crear un stream a a partir de la lista de numeros

        //.map(n -> n *2) = Funcion para duplicar cada numero en la lista

        //.collect(Collector.toList()); = Recoge los elementos filtrados en una nueva lista



    }
}