package SE05Operadores;

import java.util.Scanner;

public class PruebRect {
	public static void main(String[] args) {
		
		var alto = 0.0;
		var ancho = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar alto : ");
		alto =  scan.nextDouble();
		System.out.println("Ingresar ancho : ");
		ancho =  scan.nextDouble();
		
		System.out.println("Area es : " + alto*ancho);
		System.out.println("Perimetro es : "+ (alto + ancho) *2);
		
	}

}
