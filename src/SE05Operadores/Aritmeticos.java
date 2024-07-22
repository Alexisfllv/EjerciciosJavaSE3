package SE05Operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		
		
		// +  - * / 
		
		//
		int a=1,b=2,c=3;
		
		var resultado  = a+b;
		
		//
		System.out.println("resultado : " + resultado);
		
		//
		var resMultiplicacion = a *b;
		System.out.println("Multiplicacion : " +  resMultiplicacion);
		
		
		// %
		
		resultado  = a%b;
		System.out.println(resultado);
		
		//numero impar
		
		if (a % 2 == 0) {
			System.out.println(a + " es un numero par");
		}else {
			System.out.println(a + " es un numero impar");
		}
		
		
		
	}
}
