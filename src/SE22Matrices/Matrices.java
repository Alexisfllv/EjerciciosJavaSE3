package SE22Matrices;

import java.util.Scanner;

public class Matrices {

    //
    int numeros[][] = new int[2][2];

    int nimus[][] = {{1,2},{2,2}};

    String nombres[][] =  {{"Alexis","Ferrari"},{"Tempo","Comms"}};


    public static void listadoNumeros(Object matriz[][]){

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.println("Salida : " + i +" - " + j + " = " + matriz[i][j]);
            }
        }
    }

    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz = " + i + " " + j + " : " + matriz[i][j]);
            }
        }
    }

    public static void listarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //
    public static void IngresarTexto( String[][] arreglo){

        Scanner scan  = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.println("Ingresa texto : " + i + " " + j + " : ");
                arreglo[i][j] = scan.nextLine();
            }
        }

    }

    public static void definir(){

        Scanner scan =  new Scanner(System.in);

        System.out.println("Ingrese numero de filas : ");
        int fila =  scan.nextInt();

        System.out.println("Ingrese numero de Columnas : ");
        int columna =  scan.nextInt();

        String[][] demo = new String [fila][columna];


    }


    //
    public static void main(String[] args) {

        String nombres[][] =  {{"Alexis","Ferrari"},{"Tempo","Comms"}};

        int numeros[][] = new int[2][2];
        String prueba[][] = new String[2][3];

        int nimus[][] = {
            {1,2},
            {2,2}
        };

        //
        int[][] nambers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //listarMatriz(numeros);
        //imprimir(nombres);

        Persona per[][] =  new Persona[2][2];
        String demo[][] = new String[0][0];
        //
        definir();
        IngresarTexto(demo);
        listarMatriz(demo);


    }
    
}
