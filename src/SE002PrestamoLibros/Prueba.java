package SE002PrestamoLibros;

public class Prueba {

    public static void main(String[] args) {
        
        //Libros
        Libro lr =  new Libro("Mares", "Fawcett", true);
        Libro lr2  = new Libro("Comps", "Ferrari", false);


        //Usuarios

        Usuario us =  new Usuario("Alexis", "929292");
        Usuario us1 =  new Usuario("Nobuo", "838282");
        //
        Biblioteca br =  new Biblioteca("Casas", "Lima");

        //

        //br.registrarLibro(lr2);
        //

        br.prestarLibros(us,lr);

        //

        br.prestarLibros(us1,lr);
        //
        br.devolverLibroPrestado(lr);
        //
        
        br.prestarLibros(us1,lr);

    }
    
}
