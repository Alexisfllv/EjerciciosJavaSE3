package SE18Sobrecarga;

public class Sobrecarga {
    
    public static int sumarEntero(int a , int b){
        return a+b;
    }

    //

    public static double  sumar(double a , double b){
        return a+b;
    }

    //
    public static void main(String[] args) {
       
        System.out.println(sumar(2, 4));

        var resultado = sumar(2, 5);

        System.out.println(resultado);

        resultado =  sumar(2, 3.4);

        System.out.println(resultado);
    }
}
