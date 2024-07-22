package SE03Variables;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
		
		
		var usuario = "Alexis";
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un nombre : ");
		var usuario2 = scan.nextLine();
		
		System.out.println(usuario2 + " && " + usuario);
	}
}
