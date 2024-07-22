package SE23Productos.Servicio;


public class Boleta {

    private int idBoleta;
    private Accesorio accesorios[];
    private int contadordeProductos;

    private static int contadorBoleta;
    private static final int MAX_NUMEROS_INTENTOS  = 10;

    //
    public Boleta(){
        this.idBoleta = ++Boleta.contadorBoleta;
        this.accesorios = new Accesorio[Boleta.MAX_NUMEROS_INTENTOS];
    }

    //metodos

    public void agregarAccesorios(Accesorio accesorio){
        if (this.contadordeProductos < Boleta.MAX_NUMEROS_INTENTOS) {
            this.accesorios[this.contadordeProductos++] =  accesorio;
        }else{
            System.out.println("Numero maximo alcanzando es : 10");
        }
    }

    //calcular precio

    public double calcularelCosto(){
        double total = 0;

        for (int i = 0; i < this.contadordeProductos; i++) {
            //Accesorio accesorio = this.accesorios[i];
            //total = total + accesorio.getPrecioAcessorio();
            //
            total +=  this.accesorios[i].getPrecioAcessorio();
        }
        return total;
    }

    //Publicar
    public void publicarResultado(){
        System.out.println("Numero de Boleta es : " + Boleta.contadorBoleta);
        System.out.println("Total de Suma de Accesorios : S/" + calcularelCosto());
        for (int i = 0; i < this.contadordeProductos; i++) {
            System.out.println(this.accesorios[i]);
        }
    }

    
}