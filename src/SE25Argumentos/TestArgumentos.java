package SE25Argumentos;

public class TestArgumentos {

    public static void main(String[] args) {

        imprimirNUmeros(3,4,5,6);
        imprimirNUmeros(1,2,3);

        
        variosParametros("Alexis", 3,2,2);

        //
        int[] arreglo = {1,3,4,5};
        imprimirNumerosArreglos(arreglo);
        
    }



    // [] = int...
    private static void imprimirNUmeros(int... numeros){
        //
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos : " + numeros[i]);
        }
    }
    

    private static void imprimirNumerosArreglos(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("arreglos : " + numeros[i]);
        }
    }

    //parametros

    private static void variosParametros(String nombre , int... numeros){
        System.out.println("nombres  : " + nombre);
        imprimirNUmeros(numeros);
    }
}
