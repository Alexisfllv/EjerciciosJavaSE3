package SE001Biblioteca;

public class Prueba {

    

    public static void main(String[] args) {
        Usuario us1 = new Usuario("Alexis", "202020");
        Usuario us2 = new Usuario("Ferrari", "324442");
        Usuario us3 = new Usuario("Shen", "32544");

        Libro lb1 =  new Libro("Pazx", "Norte", true);
        Libro lb2 =  new Libro("Orientada", "Sur", true);
        Libro lb3 =  new Libro("Mirada", "Este", false);

        //
        Biblioteca bl =  new Biblioteca("Sus", "Lima");

        //
        //bl.registrarLibro(lb1);
        //
        bl.prestarLibro(lb1, us3);
        bl.prestarLibro(lb2, us1);

        //
        bl.devolverLibro(lb1);

        bl.prestarLibro(lb1, us1);
    }


    
}
