package SE43Catalogo.Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import SE43Catalogo.Domain.Pelicula;
import SE43Catalogo.Excepciones.AccesoDatosEx;
import SE43Catalogo.Excepciones.EscrituraDatos;
import SE43Catalogo.Excepciones.LecturaDatos;

public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists(); 
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatos {
        File archivo =  new File(nombreArchivo);
        List<Pelicula> peliculas =  new ArrayList<>();

        //
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea =  null;

            linea =  entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea =  entrada.readLine();
            }

            entrada.close();

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            //
            throw new LecturaDatos("Excepecion al listar peliculas : " + e.getMessage());
        } catch (IOException e) {
            
            e.printStackTrace();
            throw new LecturaDatos("Excepecion al listar peliculas : " + e.getMessage());
        }

        //
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatos {
        var archivo = new File(nombreArchivo);
        try {
            var salida =  new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al arhicvo : " + pelicula);
        } catch (IOException e) {
            
            e.printStackTrace();
            //
            throw new EscrituraDatos("Excepcion al escribir peliculas  : " +  e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatos {
        var archivo =  new File(nombreArchivo);
        String resultado = null;
        try {
            var entrada =  new BufferedReader(new FileReader(archivo));
            String linea =  null;
            linea =  entrada.readLine();
            int  indice =  1;
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = " Pelicula encontada  : " + linea + " "+ indice;
                    break;
                }
                linea =  entrada.readLine();
                indice++;
            }
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            throw new LecturaDatos("Excepcion de bucar la pelicula , lecutura : " +  e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatos("Excepcion de bucar la pelicula , lecutura : " +  e.getMessage());
        }


        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw  new AccesoDatosEx("Execepion al crear archivo  . accesodatos : " +e.getMessage());
        }        
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {

        var archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo existente eliminado");
        }
        
    }
    
}
