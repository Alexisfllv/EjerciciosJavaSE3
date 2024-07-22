package SE15Encapsulamiento;

public class Prueba {

    public static void main(String[] args) {
        
        //

        Persona pe =  new Persona("Alexis", 200, false);

        //gets
        String nombre = pe.getNombre();
        double sueldo =  pe.getSueldo();
        boolean eliminado =  pe.isEliminado();

        //sets

        pe.setNombre("Souce");

        //System.out.println(pe.getNombre() + " " + sueldo + " " + eliminado);
        
        
        System.out.println(pe.toString());
    }
    
}
