package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class base1 {


    //

    public static void main(String[] args) {
        
        //Lista normal

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        //filtrado de pares de numeros
        List<Integer> pares = numeros.stream()
                                        .filter(num -> num % 2 ==0)
                                        .collect(Collectors.toList());

        for (Integer integer : pares) {
            System.out.println(integer);
        }

        // convertir a String y concatenar texto
        List<String> numerosStrings =  numeros.stream()
                                                .map(num -> "Numeros : " + num)
                                                .collect(Collectors.toList());

        for (String string : numerosStrings) {
            System.out.println(string);
        }

        // convierte todos los elementos a un solo resultado mediante una operacion asociativa

        Optional<Integer> suma =  numeros.stream()
                                            .reduce((a ,b) -> a + b);

        System.out.println(suma);

        // ejecuta la accion para cada elemento stream

        numeros.stream()
                .forEach(System.out::println);

        
        

    }

    
}

