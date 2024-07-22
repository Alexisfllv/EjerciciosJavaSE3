package SE23Productos.Play;

import SE23Productos.Servicio.Accesorio;
import SE23Productos.Servicio.Boleta;

public class Play {

    public static void main(String[] args) {
        //
        Accesorio ac1 = new Accesorio("Audifonos", 200.70);
        Accesorio ac2 = new Accesorio("Teclado", 300.90);
        Accesorio ac3 = new Accesorio("Mouse", 200.20);
        //

        Boleta bo = new Boleta();

        bo.agregarAccesorios(ac1);
        bo.agregarAccesorios(ac2);
        bo.agregarAccesorios(ac3);

        bo.publicarResultado();
    }
    
}
