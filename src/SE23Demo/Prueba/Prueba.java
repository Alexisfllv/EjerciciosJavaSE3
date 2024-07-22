package SE23Demo.Prueba;

import SE23Demo.Repo.Calzado;
import SE23Demo.Repo.VentaCalzado;

public class Prueba {


    public static void main(String[] args) {
            
        Calzado cl1 = new Calzado("Nike", 200);
        Calzado cl2 =  new Calzado("Adidas", 230.20);

        //Venta
        VentaCalzado vc = new VentaCalzado();
        vc.agregarCompra(cl1);
        vc.agregarCompra(cl2);
        vc.mostrarVenta();
        
            
    }
    
}
