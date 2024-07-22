package SE17Herencia;

import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        
        // Empleado em = new Empleado("Alexis", 322);
        // System.out.println(em);


       Cliente cl = new Cliente("Alexis", 'M', 22, "habe", new Date(), true);
       System.out.println(cl);

    }
    
}
