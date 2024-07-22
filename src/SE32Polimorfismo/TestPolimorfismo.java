package SE32Polimorfismo;

public class TestPolimorfismo {

    

    public static void main(String[] args) {
        Gerente gn =  new Gerente("Alexis", 200.20, "Fawcett.com");
        //System.out.println(gn.imprimirDatos());

        imprimir(gn);

        //
        Empleado em =  new Empleado("tempo", 200);
        //System.out.println(em.imprimirDatos());
        imprimir(em);
    }

    //
    public static void imprimir(Empleado empleado){
        System.out.println("detalles : " + empleado.imprimirDatos());
    }
    
}
