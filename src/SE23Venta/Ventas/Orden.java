package SE23Venta.Ventas;

public class Orden {

    

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    //
    private static final int MAX_PRODUCTOS = 10;

    //
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //METODOS

    //
    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("maximo de productos superado : " + Orden.MAX_PRODUCTOS);
        }
    }

    //
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i];
            //total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }

        return total;
    }

    //
    public void mostrarOrden(){
        System.out.println("ID ORDEN : " + this.idOrden);
        double totalOrden =  this.calcularTotal();
        System.out.println("Total de la orden : $" + totalOrden );
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("Productos de la Orden "+this.productos[i]);
        }
    }
    
    
}
