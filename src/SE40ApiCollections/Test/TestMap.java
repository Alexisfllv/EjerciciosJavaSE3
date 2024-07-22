package SE40ApiCollections.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
    
    public static void main(String[] args) {
        
        //
        Map miMap =  new HashMap<>();

        //
        miMap.put(1, "Alexis");
        miMap.put("a", "Ferrari");

        String elemento =  (String)miMap.get(2);
        System.out.println(elemento);

        
        System.out.println(miMap.keySet());
        //imprimir las llaves aleatorias
        imprimir(miMap.keySet());

        //imprimir los valores
        imprimir(miMap.values());


    }

    public static void imprimir(Collection collection){
        collection.forEach(listado -> {
            System.out.println(listado);
        });
    }
}
