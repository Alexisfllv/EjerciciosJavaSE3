package SE47Streams;

import java.util.Arrays;
import java.util.List;

/**
 * ProcesamientoParalelo
 */
public class ProcesamientoParalelo {

    public static void main(String[] args) {
        //
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        int sum = numeros.parallelStream()
                            .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}