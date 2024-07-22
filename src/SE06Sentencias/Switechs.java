package SE06Sentencias;

import java.util.Scanner;

public class Switechs {

	public static void main(String[] args) {

		// sentencias swith : case

		// date

		var numero = 2;
		var numeroTexto = "Valor desconocido";

		Scanner scan = new Scanner(System.in);

		//System.out.println("Ingrese numero ");

		//

		switch (numero) {
		case 1:
			numeroTexto = "es numero uno";
			break;
		case 2:
			numeroTexto = "es numero 2";
			break;
		case 3:
			numeroTexto = "es numero 3";
			break;
		case 4:
			numeroTexto = "es numero 4";
			break;
		default:
			numeroTexto = "numero no encontrado";
			break;
		
		}
		
		System.out.println(numeroTexto);

	}

}
