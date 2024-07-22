package SE40ApiCollections.Test;

import java.util.ArrayList;
import java.util.List;

public class TestColecciones {

    //
    public static void main(String[] args) {
        //
        List miLista = new ArrayList<>();

        //
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");

        System.out.println(miLista);
        //
        for (Object obj : miLista) {
            System.out.println(obj);
        }

        System.out.println(miLista.size());

        //lamndas
        //reconoce el tipo object
        miLista.forEach(obj -> {
            System.out.println(obj);
        });

    }
    
}