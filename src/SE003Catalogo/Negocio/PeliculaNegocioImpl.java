package SE003Catalogo.Negocio;

import SE003Catalogo.Datos.IPeliculaDatos;
import SE003Catalogo.Datos.PeliculaDatosImpl;
import SE003Catalogo.Excepciones.ExAccesoDatos;
import SE003Catalogo.Excepciones.ExLecturaDatos;
import SE003Catalogo.Modelo.Movie;

public class PeliculaNegocioImpl implements IPeliculaNegocio{

    //traemos los datos
    private final IPeliculaDatos datos;

    //asociar peliculas impl
    public PeliculaNegocioImpl(){
        this.datos =  new PeliculaDatosImpl();
    }


    @Override
    public void agregarPelicula(String nombrePelicula) {
        
        Movie movie =  new Movie(nombrePelicula);
        boolean anexar =  false;

        try {
            anexar = datos.existe(NOMBRE_ARCHIVO);

            datos.escribir(movie, NOMBRE_ARCHIVO, anexar);
        } catch (ExAccesoDatos e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace();
        }
    }

    @Override
    public void listadoPeliculas() {

        try {
            var peliculas =  this.datos.listar(NOMBRE_ARCHIVO);
            for (Movie movie : peliculas) {
                System.out.println("Peliculas : " +  movie);
            }
        } catch (ExLecturaDatos e) {
            
            System.out.println("Error al listar");
            e.printStackTrace(System.out);
        }
        
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado =  null;
        
        try {
            resultado =  this.datos.buscar(NOMBRE_ARCHIVO, buscar);
        } catch (ExLecturaDatos e) {
            System.out.println("Error al buscar el dato");
            e.printStackTrace(System.out);
        }
        System.out.println(" Resul = " + resultado);
        
    }

    @Override
    public void iniciarCatalogo() {
        

        try {
            if (this.datos.existe(NOMBRE_ARCHIVO)) {
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
            }else{
                datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (ExAccesoDatos e) {
            System.out.println("Error inicio catalogos");
            e.printStackTrace();
        }
    }
    
}
