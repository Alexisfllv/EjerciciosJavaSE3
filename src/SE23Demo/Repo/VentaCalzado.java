package SE23Demo.Repo;

public class VentaCalzado {

    private int idVentaCalzado;
    private Calzado calzados[];
    private static final int MAX_VALOR  = 10;
    //clase propia
    private static int contadorVentaCalzado;
    //aux
    private  int contadorVentas;

    public VentaCalzado(){
        this.idVentaCalzado =  VentaCalzado.contadorVentaCalzado++;
        //inicialzar el valor en 10;
        calzados = new Calzado[VentaCalzado.MAX_VALOR];

        //
        
    }

    //metodos

    //Agregar compra;

    public void agregarCompra(Calzado calzado){
        if (this.contadorVentas < VentaCalzado.MAX_VALOR) {
            this.calzados[this.contadorVentas++] = calzado;
        }
    }

    //Calcular precios

    public double calcularPrecios(){
        double total = 0;
        for (int i = 0; i < this.contadorVentas; i++) {
            total += this.calzados[i].getPrecioCalzado();
        }
        return total;
    }

    //Mostrar la venta
    public void mostrarVenta(){
        System.out.println("Venta calzado : " + VentaCalzado.contadorVentaCalzado);
        System.out.println("Total venta es : " + calcularPrecios());
        for (int i = 0; i < this.contadorVentas; i++) {
            System.out.println(calzados[i]);
        }
    }

    
}
