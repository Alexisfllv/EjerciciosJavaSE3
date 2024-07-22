package SE30ModAcceso.Test;

import SE30ModAcceso.Paquete1.Clase1;
import SE30ModAcceso.Paquete1.Clase2;
import SE30ModAcceso.Paquete1.Clase4;
import SE30ModAcceso.Paquete2.ClaseHija;

public class TestModificador {
    

    public static void main(String[] args) {
        

        //public
        Clase1 cl1 =  new Clase1();
        System.out.println(cl1.atributoPublico);
        cl1.mostrarMensaje();

        //protected
        //Clase2 cl2 =  new Clase2();
        //System.out.println(cl2.atributoProtected);
        //cl2.metodoProtected;

        //Clase hija 
        ClaseHija ch =  new ClaseHija();
        

        //Clase 4 = privado

        Clase4 cl4 = new Clase4("Mensaje privado desde Test");

        cl4.setMensajePrivado("Nuevo mensaje modificado por set");
        System.out.println(cl4.getMensajePrivado());
        


        

    }
}
