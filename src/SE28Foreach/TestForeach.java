package SE28Foreach;

public class TestForeach {
    
    //

    public static void main(String[] args) {
        
        int edades [] = {3,4,56,2,3};

        //
        for (int edad : edades) {
            System.out.println("eadad : " + edad);
        }


        //objeto arreglo
        Persona p[] = {new Persona("Alexis"),new Persona("Nones"),new Persona("Sous")};

        //

        for (Persona persona : p) {
            System.out.println(persona);
        }


    }
}
