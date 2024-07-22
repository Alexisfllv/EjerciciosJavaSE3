package SE21Arreglos;

public class Prueba {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];


        personas[0] = new Persona("temp");
        personas[1] = new Persona("how");

        System.out.println(personas[0].toString());
        System.out.println(personas[1].toString());

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }

        String frutas[] = {"Naranja","ojo","Uva"};

        System.out.println(frutas.length);

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        int numbers[] = {1,2,3,4,5,6};
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
