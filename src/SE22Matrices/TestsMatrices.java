package SE22Matrices;


public class TestsMatrices {


    //[2][3]

        // [0][0] [0][1] [0][2]
        // [1][0] [1][1] [1][2]

        //


    public static void main(String[] args) {
        
        //
        int edades[][] =  new int[3][2];

        // [0][0] [0][1] 
        // [1][0] [1][1] 
        // [2][0] [2][1]

        edades[0][0] = 5;
        edades[0][1] = 4;
        edades[1][0] = 7;
        edades[1][1] = 8;

        //System.out.println(edades[0][0]);
        //System.out.println(edades.length);
        
        //System.err.println(edades[fila].length);

        for (int fila = 0; fila < edades.length; fila++) {
            
            System.out.println("fila numero : " + fila);
            //
            for (int columna = 0; columna < edades[fila].length ; columna++) {
                //System.out.println(edades[fila].length);
                System.out.println("Columna numero : " + columna);
                System.out.println("edades : " + edades[fila][columna]);
            }
        }


        //Strings ingreso directo

        String frutas[][] = {{"Naranja","Limon","Tomate"},{"Fresa","Zanahoria","rabano"}};
        String frutes[][] = {{"Fam,Temp,Clow,how"}};

        for (int fila = 0; fila < frutas.length; fila++) {
            for (int columna = 0; columna < frutas[fila].length ; columna++) {
                System.out.println("Fila : " + fila + " Columna : "+columna);
                System.out.println("frutas : " + frutas[fila][columna]);
            }
        }

        System.out.println(frutas[0][0]);


        //

        Persona p[][] = new Persona[2][3];

        p[0][0] =  new Persona("Alexis");
        p[0][1] =  new Persona("coms");

        for (int i = 0; i < p.length; i++) {
            
            for (int j = 0; j < p[i].length; j++) {
                
                // if (p[i][j] == null) {
                //     System.out.println("nulo");
                // }else{
                //     System.out.println(p[i][j].toString());
                // }

                // if (p[i][j] != null) {
                //     System.out.println(p[i][j].toString());
                // } else {
                //     System.out.println("El objeto en la posición [" + i + "][" + j + "] es nulo");
                // }

                System.out.println("Persona 1 = " + i + " " + j + " : " + p[i][j]);
                
            }

        }

        //

        //Nombres

        String nombres[][] =  {{"Alexis","Ferrari"},{"Tempo","Comms"}};

        Persona p2[][] =  new Persona[2][2];

        imprimir(nombres);

        p2[0][0] = new Persona("Obrero");
        imprimir(p2);

        

    }
    public static void imprimir(Object matriz[][]){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Matriz = " + i + " " + j + " : " + matriz[i][j]);
                }
            }
    }
}
