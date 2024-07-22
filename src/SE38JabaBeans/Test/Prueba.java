package SE38JabaBeans.Test;

import SE38JabaBeans.Domain.Persona;

public class Prueba {
    

    public static void main(String[] args) {
        
        Persona p =  new Persona();

        p.setNombre("Alexsi");
        p.setApellido("Call");

        System.out.println(p);

        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
    }
}
