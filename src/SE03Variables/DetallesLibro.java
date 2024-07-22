package SE03Variables;

import java.util.Scanner;

public class DetallesLibro {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		var titulo = "";
		var autor = "";
		
		System.out.println("Ingresar el titulo : ");
		titulo = scan.nextLine();
		
		System.out.println("Ingresar el autor : ");
		autor = scan.nextLine();
		
		System.out.println("Titulo es : " +  titulo + " Fue escrito por : " + autor);
		
	}

}
