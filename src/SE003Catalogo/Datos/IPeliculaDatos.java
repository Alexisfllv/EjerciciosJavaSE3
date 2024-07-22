package SE003Catalogo.Datos;

import java.util.List;

import SE003Catalogo.Excepciones.ExAccesoDatos;
import SE003Catalogo.Excepciones.ExEscrituraDatos;
import SE003Catalogo.Excepciones.ExLecturaDatos;
import SE003Catalogo.Modelo.Movie;

public interface IPeliculaDatos {
    
    //metodos 

    //si archivo existe o no
    boolean existe(String nombreArchivo) throws  ExAccesoDatos;

    //listado de todos los datos
    List<Movie> listar(String nombreArchivo) throws ExLecturaDatos;

    //escribir una nueva pelicula
    void escribir(Movie movie , String nombreArchivo , boolean anexar) throws ExEscrituraDatos;

    // buscar pelicula
    public String buscar(String nombreArchivo , String buscar) throws ExLecturaDatos; 
    
    // crear archivo de la pelicula
    void crear(String nombreArchivo) throws ExAccesoDatos;

    //borrar el archivo

    void borrar(String nombreArchivo) throws ExAccesoDatos;
    

}
