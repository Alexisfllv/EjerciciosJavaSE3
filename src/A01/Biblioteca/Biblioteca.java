package A01.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    //
    private String nombreBiblioteca;
    //
    private List<Libro> libros;
    private List<Persona> personas;
    //
    public Biblioteca(String nombreBiblioteca){
        this.nombreBiblioteca = nombreBiblioteca;
        libros =  new ArrayList<>();
        personas = new ArrayList<>();
    }

    //
    

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }
    @Override
    public String toString() {
        return "Biblioteca [nombreBiblioteca=" + nombreBiblioteca + ", libros=" + libros + ", personas=" + personas
                + "]";
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    //

    public void registrarLibro(Libro libro){

        libros.add(libro);
        if (libro.isEstadoLibro()) {
            System.out.println("Este libro ya se encuentra disponible");
        }else{
            libro.estadoLibro = true;
            System.out.println("Registro completo del libro");
        }
    }
    
    //
    public void prestarLibro(Persona persona , Libro libro){
        //
        if (libro.isEstadoLibro()) {
            libro.estadoLibro =  false;
            System.out.println("Usuario : " + persona.getNombrePersona() + "Llevara el libro : " + libro.nombreLibro);
        }else{
            System.out.println("El libro no se encuentra disponible");
        }
    }

    public void devolverLibro(Libro  libro){
        libro.estadoLibro =  true;
            System.out.println("Libro devuelvo y habilitado : " + libro.getNombreLibro());
    }

    public void listadodeLibro(){
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
