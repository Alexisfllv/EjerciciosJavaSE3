package SE003Catalogo.Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import SE003Catalogo.Excepciones.ExAccesoDatos;
import SE003Catalogo.Excepciones.ExEscrituraDatos;
import SE003Catalogo.Excepciones.ExLecturaDatos;
import SE003Catalogo.Modelo.Movie;


public class PeliculaDatosImpl implements IPeliculaDatos{


    //COMPROBAR SI EL DATO ES EXISTENTE
    @Override
    public boolean existe(String nombreArchivo) throws ExAccesoDatos {
        
        //declara la variable archivo
        File archivo =  new File(nombreArchivo);
        return archivo.exists();
    }

    
    @Override
    public List<Movie> listar(String nombreArchivo) throws ExLecturaDatos {
        
        //Variable Archivo
        File archivo = new File(nombreArchivo);

        //
        List<Movie> movies =  new ArrayList<>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;

            //me retorna un dato
            linea = entrada.readLine();
            while (linea !=  null) {
                //declaro el arreglo pelicula
                Movie movie =  new Movie(linea);
                movies.add(movie);
                //leer la siguiente fila del archivo
                linea =  entrada.readLine();
            }
            entrada.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error al listar archivos nombres peliculas");
        } catch (IOException e) {
            System.out.println("ss");
        }

        return movies;

    }


    @Override
    public void escribir(Movie movie, String nombreArchivo, boolean anexar) throws ExEscrituraDatos {
        
        File archivo = new File(nombreArchivo);

        //
        try {
            var salida = new PrintWriter(new FileWriter(archivo ,anexar));

            //nombre de la pelicula se ingresa se inserta al archivo
            salida.println(movie.toString());
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problemas al ingresar la pelicula");
        }
    }


    @Override
    public String buscar(String nombreArchivo, String buscar) throws ExLecturaDatos {
        
        var archivo = new File(nombreArchivo);
        String resultado =  null;

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea =  null;
            linea =  entrada.readLine();
            int indice =  1;

            while (linea !=  null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado =  "Movie encontrada : " +  linea + " - " + indice;
                    break;
                }
                linea =  entrada.readLine();
                indice++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error abrir archivo");
            e.printStackTrace();
            throw new ExLecturaDatos(e.getMessage());
            
        } catch (IOException e) {
            System.out.println("Otro error de abrir el archivo xd");
            e.printStackTrace();
        }
        return resultado;

    }


    @Override
    public void crear(String nombreArchivo) throws ExAccesoDatos {
        
        var archivo = new File(nombreArchivo);

        try {
            var salida =  new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            
            e.printStackTrace();
            System.out.println("Error en la creacion del archivo");
            throw new ExAccesoDatos(e.getMessage());
            
        }
    }


    @Override
    public void borrar(String nombreArchivo) throws ExAccesoDatos {
        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo existente eliminado");
        }
    }

    //crear
    
    
}
