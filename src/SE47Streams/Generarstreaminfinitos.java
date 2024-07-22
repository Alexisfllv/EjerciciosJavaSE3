
package SE47Streams;

import java.util.stream.Stream;

/**
 * Generarstreaminfinitos
 */
public class Generarstreaminfinitos {

    public static void main(String[] args) {
        
        //nucleos naturales

        Stream<Integer> numerosNaturales =  Stream.iterate(0, n -> n + 1);
        numerosNaturales.limit(10).forEach(System.out::println);
        //genera un stream infinito de numeros naturales desde  0
        // a un maximo de limit 10

    }
}