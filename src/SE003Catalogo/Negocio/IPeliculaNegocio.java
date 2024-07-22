package SE003Catalogo.Negocio;

import java.util.List;

import SE003Catalogo.Modelo.Movie;

public interface IPeliculaNegocio {


    String NOMBRE_ARCHIVO =  "movies.txt";

    //
    public void agregarPelicula(String nombrePelicula);

    //
    public void listadoPeliculas();

    //
    void buscarPelicula(String buscar);

    //
    void iniciarCatalogo();
    
}
