package SE003Catalogo.Test;

import java.util.Scanner;

import SE003Catalogo.Negocio.IPeliculaNegocio;
import SE003Catalogo.Negocio.PeliculaNegocioImpl;

public class PruebaPeliculass {
    public static void main(String[] args) {

        //

        var opcion = -1;
        var scaner = new Scanner(System.in);

        //
        IPeliculaNegocio mnegocio = new PeliculaNegocioImpl();

        //
        while (opcion != 0) {
            System.out.println("Elige una opcion : \n"
                    + "1). Iniciar Catalogo Movies \n"
                    + "2). Agregar Pelicula \n"
                    + "3). Lista Pelicula \n"
                    + "4). Buscar Pelicula \n"
                    + "0). Salir \n");
            opcion = Integer.parseInt(scaner.nextLine());
            // Integer.parseInt(scaner.nextLine());

            switch (opcion) {
                case 1:
                    mnegocio.iniciarCatalogo();
                    System.out.println("incio");
                    break;
                case 2:
                    System.out.println("Introduce nombre de la pelicula : ");
                    String nombrePelicula = scaner.nextLine();
                    mnegocio.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    mnegocio.listadoPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese la pelicula a buscar : ");
                    String peliculaBuscada =  scaner.nextLine();
                    mnegocio.buscarPelicula(peliculaBuscada);
                    break;
                case 0:
                    System.out.println("Cerrar opcion 0");
                    break;
    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        //
        

    }

}
