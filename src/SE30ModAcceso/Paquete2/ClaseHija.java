package SE30ModAcceso.Paquete2;

import SE30ModAcceso.Paquete1.Clase2;

public class ClaseHija extends Clase2{

    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion atributoProtected";
        System.out.println(atributoProtected);
        this.metodoProtected();
    }
    
}
