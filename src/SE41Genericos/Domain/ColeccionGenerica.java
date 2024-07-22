package SE41Genericos.Domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColeccionGenerica {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lines");
        miLista.add("ss");


        //
        String e =  miLista.get(0);
        //System.out.println(e);
        //imprimirString(miLista);

        //SET

        Set<Integer> miSet =  new HashSet<>();
        miSet.add(1);
        miSet.add(33);
        miSet.add(2);
        miSet.add(13);

        //imprimirInt(miSet);

        //MAP
        Map<Integer,String> miMap =  new HashMap<>();
        miMap.put(1, "Alexis");
        miMap.put(2, "Ferr");
        miMap.put(3, "Low");

        //valor key //int
        miMap.keySet();

        imprimirInt(miMap.keySet());

        //valor registro //String
        miMap.get(miMap.keySet());

        imprimirString(miMap.values());
        
    }

    public static void imprimirString(Collection<String> collection){
        //lamnda
        collection.forEach(listado ->{
            System.out.println(collection.getClass().getSimpleName() + " es :  "+listado);
            System.out.println(listado.getClass().getSimpleName());
        });

        //
        for (String data : collection) {
            System.out.println(data);
        }
    }

    public static void imprimirInt(Collection<Integer> collection){

        //lmd
        collection.forEach(listado -> {
            System.out.println(collection.getClass().getSimpleName() + " es :  "+listado);
            System.out.println(listado.getClass().getSimpleName());
        });
    }

    //
    public static void imprimirGlobal(Collection collection){
        collection.forEach(listado -> {
            System.out.println(listado);
            System.out.println(listado.getClass().getSimpleName());
        });
    }
    
}
