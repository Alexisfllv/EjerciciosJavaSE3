package SE33Instance.Test;

import SE33Instance.Domain.Empleado;
import SE33Instance.Domain.Gerente;

public class Prueba {

   

    public static void main(String[] args) {
        
        Gerente gn =  new Gerente("Alexis", "2929292", "Sistemas");
        //gn.mostrarInformacion();
        
        verlaInformacion(gn);
        
        //
        Empleado em = new Empleado("Ferari", "2929292");
        //em.mostrarInformacion();
        //
        //verlaInformacion(em);
        //

    }

    public static void verlaInformacion(Empleado empleado){
        if (empleado instanceof Gerente ) {
            System.out.println("Tipo gerente");
            Gerente ge = (Gerente)empleado;
            String tp = ge.getCargo();
            System.out.println(tp);
            //empleado.mostrarInformacion();
        }else if (empleado instanceof Empleado) {
            System.out.println("Tipo Empleado");
        }else if (empleado instanceof Object) {
            System.out.println("Tipo object");
        }
    }
    
}
