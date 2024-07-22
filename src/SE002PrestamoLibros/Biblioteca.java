package SE002PrestamoLibros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreb;
    private String direccion;
    private List<Libro> libros;
    private List<Usuario> usuarios;

    //
    public Biblioteca(String nombreb, String direccion){
        this.nombreb =  nombreb;
        this.direccion = direccion;
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public String getNombreb() {
        return nombreb;
    }

    public void setNombre(String nombre) {
        this.nombreb = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //metodo de  registrar libro

    public void registrarLibro(Libro libro){

        //derechos
        System.out.println("<<<<<<<<<<<<<<<<<");
        System.out.println( "La biblioteca : " + this.nombreb +  " con la direccion : " + this.direccion);
        
        if (libro.isDisponible()) {
            System.out.println("Libro ya se encuentra registrado : " + libro.getAutor());
        }else{
            libro.setDisponible( true);
            System.out.println("El libro ya esta agregado : "  + libro.getAutor()) ;
        }
        System.out.println(">>>>>>>>>>>>>>>>>");
    }

    //prestarlibro

    public void prestarLibros(Usuario usuario , Libro libro){
        System.out.println("<<<<<<<<<<<<<<<<<");
        System.out.println( "La biblioteca : " + this.nombreb +  " con la direccion : " + this.direccion);
        

        if (libro.isDisponible()) {
            //true
            libro.setDisponible( false);
            System.out.println("El usuario  : " + usuario.getNombre() + " Tendra el libro : " + libro.getTitulo() + " con el autor : " + libro.getAutor());
        }else{
            System.out.println("El libro no es encuentra disponible : " + libro.getTitulo()) ;
        }

        System.out.println(">>>>>>>>>>>>>>>>>");
    }

    //devolver un libro

    public void devolverLibroPrestado(Libro libro){
        System.out.println("<<<<<<<<<<<<<<<<<");
        System.out.println( "La biblioteca : " + this.nombreb +  " con la direccion : " + this.direccion);
        
        libro.setDisponible(true);
        System.out.println("Libro disponible es : " + libro.getTitulo());
        System.out.println(">>>>>>>>>>>>>>>>>");
    }
    
}
