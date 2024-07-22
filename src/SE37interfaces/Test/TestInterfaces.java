package SE37interfaces.Test;

import SE37interfaces.Dom.IAccesoDatos;
import SE37interfaces.Dom.ImplOracle;
import SE37interfaces.Dom.ImplementacionSQL;

public class TestInterfaces {

    public static void main(String[] args) {
        

        //
        IAccesoDatos Idatos = new ImplementacionSQL();
        imprimir(Idatos);

        Idatos =  new ImplOracle();
        //Idatos.listar();
        imprimir(Idatos);
    }

    //generico
    public static void imprimir(IAccesoDatos data){
        data.listar();
    }

    
}