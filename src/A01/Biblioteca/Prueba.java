package A01.Biblioteca;

public class Prueba {

    public static void main(String[] args) {
        //
        Libro lb1 = new Libro("Magia", "Ferr",false);
        Libro lb2 =  new Libro("Tiempo", "Sous",false);

        //
        Persona p1 =  new Persona("Alexis", "Fawcett");
        Persona p2 =  new Persona("Temu", "Yun");

        //
        Biblioteca bl = new Biblioteca("Andes");

        //
        bl.registrarLibro(lb1);
        //bl.registrarLibro(lb2);
        //
        bl.prestarLibro(p2, lb1);
        //
        bl.devolverLibro(lb1);
        //
        bl.listadodeLibro();
    }
    
}
