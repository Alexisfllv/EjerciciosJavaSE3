package SE23Solve.Modelo;

public class Orden {

    //
    private int idOrden;
    private Producto  productos[];
    //STATIC
    private static int contadorOrden;
    private static final int MAX_VALOR = 10;
    
    // dato memoria
    private int contadorProductos;

    //constructor
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        //creamos el arreglo en 10
        this.productos = new Producto[Orden.MAX_VALOR];
    }

    //metodos

    public void agregarProducto(Producto producto){
        //
        if (this.contadorProductos < Orden.MAX_VALOR) {
            this.productos[this.contadorProductos++] = producto;
            //this.productos[contadorProductos] = producto;
        }else{
            System.out.println("Orden superado , maximo de 10 productos");
        }
    }

    //calcular total
    public double calcularTotal(){

        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    //
    public void mostraOrden(){
        System.out.println("Productos");
        System.out.println("TOTAL PRECIO ES : " + calcularTotal());
        for (int i = 0; i < this.contadorProductos; i++) {
            
            System.out.println(this.productos[i]);
        }
    }

    
}
