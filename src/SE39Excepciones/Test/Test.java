package SE39Excepciones.Test;

import SE39Excepciones.Dom.Aritmetica;
import SE39Excepciones.Dom.Operaciones;

public class Test {
    public static void main(String[] args) {
        
        int res =0;


        try{
            res = Aritmetica.division(10, 0);
        }catch(Operaciones s){
            System.out.println("Ocurrio un error de tipo Operaciones");
            System.out.println(s.getMessage());
        }
        catch(Exception e){
            System.out.println("Error de tipo Excepcion");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }

        //
        finally{
            System.out.println("La funsion se realizo de todas formas");
        }

        

        System.out.println(res);
    }
    
}
