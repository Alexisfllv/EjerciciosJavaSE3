package SE05Operadores;

public class Ternario {

	
	public static void main(String[] args) {
		
		var resultado = (3 > 2) ? "Si es mayor" : "No es menor";
		
		System.out.println(resultado);
		
		
		var numero  = 8;
		
		resultado = numero%2 ==0 ? "es numero par" : "es numero impar";
		
		System.out.println(resultado);
		
	}
	
}
