package SE06Sentencias;

import java.util.Scanner;

public class Notas {

	
	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un valor de 0 - 10 : ");
		var nota  = scan.nextInt();
		
		//fun
		
		if (nota == 9 || nota ==10) {
			System.out.println("Nota es A");
		}else if (nota == 8 || nota ==9) {
			System.out.println("Nota es B");	
		}else if (nota == 7 || nota ==8) {
			System.out.println("Nota es C");	
		}else if (nota == 6 || nota ==7) {
			System.out.println("Nota es D");	
		}else if (nota >= 0 && nota <6) {
			System.out.println("Nota es F");	
		}else {
			System.out.println("Valor errado");
		}
	}
	
}
