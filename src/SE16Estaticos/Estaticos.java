package SE16Estaticos;

public class Estaticos {


    //
    public static void main(String[] args) {
        Persona p = new Persona("Alexis");

        System.out.println(p);

        Persona p2 = new Persona("Fawcett");
        System.out.println(p2);

        //
        imprimir(p);
        imprimir(p2);
    }


    //
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }

    
}
