package SE43Catalogo.Datos;

import java.util.List;

import SE43Catalogo.Domain.Pelicula;
import SE43Catalogo.Excepciones.AccesoDatosEx;
import SE43Catalogo.Excepciones.EscrituraDatos;
import SE43Catalogo.Excepciones.LecturaDatos;

public interface IAccesoDatos {

    //
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    //
    List<Pelicula> listar(String nombreArchivo) throws LecturaDatos;

    void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar) throws EscrituraDatos;

    //
    String buscar(String nombreArchivo , String buscar)throws LecturaDatos;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo) throws AccesoDatosEx;
    
}
