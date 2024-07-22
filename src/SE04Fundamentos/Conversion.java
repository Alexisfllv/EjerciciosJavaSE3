package SE04Fundamentos;

import java.util.Scanner;

public class Conversion {

	
	public static void main(String[] args) {
		
		
		//conversion de tipos primitivos
		
		var nombre = "Alexis";
		
		var edad = "23";
		
		System.out.println(Integer.parseInt(edad));
		System.out.println(nombre);
		
		
		// Integer.ParseInt
		
		var pi = Double.parseDouble("3.1416");
		System.out.println(pi);
		
		
		//
		var scan = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad");
		edad = scan.nextLine();
		
		System.out.println(Integer.parseInt(edad)+10);
		
		
		// String.valueOf
		
		var sueldo  = String.valueOf(200);
		var dni  =  String.valueOf(500);
		
		System.out.println(sueldo);
		
		//
		
		var care = "soma".charAt(2);
		
		System.out.println(care);
		
		//
		
		int numeroPos = 0;
		
		System.out.println("Ingresa el numero a posicion 1");
	    numeroPos = scan.nextInt();
		
		System.out.println(String.valueOf(numeroPos).charAt(0));
		
		scan.close();
	}
}
