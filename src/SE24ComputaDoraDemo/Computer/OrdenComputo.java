package SE24ComputaDoraDemo.Computer;

public class OrdenComputo {

    private int idOrdenComputo;
    private Computadora computadora[];

    //
    private static int contadorOrdenComputo;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    //
    public OrdenComputo(){
        this.idOrdenComputo = ++OrdenComputo.contadorOrdenComputo;
        this.computadora =  new Computadora[OrdenComputo.MAX_COMPUTADORAS];
    }

    //agregar computadora 

    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < OrdenComputo.MAX_COMPUTADORAS) {
            this.computadora[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("maximo logrados");
        }
    }


    //mostrar orden

    public void mostrarOrden(){
        System.out.println("Numero de orden es : " + this.idOrdenComputo);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadora[i]);
        }


    }

    
}
