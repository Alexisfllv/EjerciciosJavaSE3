package SE40ApiCollections.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set miset = new  HashSet<>();

        //
        miset.add("Lunes");
        miset.add("Martes");
        miset.add("Miercoles");

        System.out.println(miset);
        //
        // for (Object obj : miset) {
        //     System.out.println(obj);
        // }

        //

        listado(miset);
        
    }

    public static void listado(Collection collection){
        collection.forEach(object ->{
            System.out.println(object);
        });
    }
}
