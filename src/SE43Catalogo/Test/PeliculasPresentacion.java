package SE43Catalogo.Test;

import java.util.Scanner;

import SE43Catalogo.Negocio.CatalogoPeliculasImpl;
import SE43Catalogo.Negocio.ICatalogoPeliculas;

public class PeliculasPresentacion {

    //

    public static void main(String[] args) {
        var opcion = -1;
        var scanenr = new Scanner(System.in);
        //

        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion :  \n"
                    + " 1. Iniciar Catalogo de Peliculas \n"
                    + " 2. Agregar Pelicula \n"
                    + " 3. Listar Pelicula \n"
                    + " 4. BuscarPelicula \n"
                    + " 0. Salir");
            opcion = Integer.parseInt(scanenr.nextLine());

            //
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula ");
                    var nombrePelicula = scanenr.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la pelicula a buscar ");
                    var buscar = scanenr.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;

                case 0:
                    System.out.println("Hasta pronto");
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

}
