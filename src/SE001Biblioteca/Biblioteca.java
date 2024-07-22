package SE001Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private String direccion;

    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca(String nombre , String direccion){
        this.nombre = nombre;
        this.direccion = direccion;

        //
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodos Registrar Libro
    public void registrarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado en la biblioteca: " + libro.getTitulo());
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Libro prestado a " + usuario.getNombre() + ": " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible para préstamo: " + libro.getTitulo());
        }
    }

    public void devolverLibro(Libro libro) {
        libro.setDisponible(true);
        System.out.println("Libro devuelto: " + libro.getTitulo());
    }
    
}
