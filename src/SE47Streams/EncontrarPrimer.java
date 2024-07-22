package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * EncontrarPrimer
 */
public class EncontrarPrimer {

    public static void main(String[] args) {
        
        //
        List<Integer> numeros =  Arrays.asList(1,3,5,7,8);
        Optional<Integer> primerElemento =  numeros.stream()
                                            .filter(n -> n % 2 == 0)
                                            //filtrado con la condicion
                                            .findFirst();
                                            // el primer elemento del stream
                                        //se llama por referencia
        primerElemento.ifPresent(System.out::println);
        System.out.println(primerElemento);
        //System.out.println(primerElemento);

        // int primerelemnt = numeros.stream()
        //                             .filter(n -> n % 2 ==0)
        //                             .findFirst();
        // System.out.println(primerelemnt);
    }
}