package SE23Solve.Test;

import SE23Solve.Modelo.Orden;
import SE23Solve.Modelo.Producto;

public class Prueba {

    public static void main(String[] args) {
        
        Producto pr = new Producto("Zapatilla", 200.10);
        Producto pr2 =  new Producto("Sazos", 50);
        Producto pr3 =  new Producto("we", 120.20);

        //
        Orden or = new Orden();
        or.agregarProducto(pr);
        or.agregarProducto(pr2);
        or.agregarProducto(pr3);

        or.mostraOrden();
    }
    
}
