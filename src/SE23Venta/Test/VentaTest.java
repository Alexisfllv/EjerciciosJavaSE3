package SE23Venta.Test;


import SE23Venta.Ventas.Orden;
import SE23Venta.Ventas.Producto;

public class VentaTest {

    public static void main(String[] args) {
        
        Producto p1 = new Producto("Zapatillas", 230.30);
        Producto p2 =  new Producto("Polo", 150);

        Orden orden1 = new Orden();
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);

        orden1.mostrarOrden();
    }
    
}
