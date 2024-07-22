package SE47Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Concatenar
 */
public class Concatenar {

    
    public static void main(String[] args) {
        

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 =  Arrays.asList(4,6,5);
        
        List<Integer> combinacion =  Stream.concat(list1.stream(), list2.stream())
                                            .collect(Collectors.toList());
                                            
        System.out.println(combinacion);

        //

        List<String> list3 =  Arrays.asList("tem","mon","low");
        List<String> list4 =  Arrays.asList("cam","seol","sije");

        List<String> milistado =  Stream.concat(list3.stream(), list4.stream())
                                        .collect(Collectors.toList());
        
                                        
        System.out.println(milistado);
    }
}