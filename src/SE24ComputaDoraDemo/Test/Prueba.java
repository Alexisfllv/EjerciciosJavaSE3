package SE24ComputaDoraDemo.Test;

import SE24ComputaDoraDemo.Computer.Computadora;
import SE24ComputaDoraDemo.Computer.Monitor;
import SE24ComputaDoraDemo.Computer.OrdenComputo;
import SE24ComputaDoraDemo.Computer.Raton;
import SE24ComputaDoraDemo.Computer.Teclado;

public class Prueba {

    //
    public static void main(String[] args) {
        
        //teclado

        Teclado tc1 = new Teclado("USB2", "Logitech");
        Raton rt1 =  new Raton("USB3", "Ryzer");
        Monitor mn1 =  new Monitor("Samsung", 3440);

        Teclado tc2 = new Teclado("USB3", "teck");
        Raton rt2 =  new Raton("USB3.4", "how");
        Monitor mn2 =  new Monitor("LG", 1440);

        //COMPUTADORA CLASE
        
        Computadora cm1 =  new Computadora("Mac", mn1, tc1, rt1);
        Computadora cm2 =  new Computadora("Windos", mn2, tc2, rt2);

        

        //
        OrdenComputo oc =  new OrdenComputo();
        oc.agregarComputadora(cm1);
        oc.agregarComputadora(cm2);
        oc.mostrarOrden();

    }
    
}
