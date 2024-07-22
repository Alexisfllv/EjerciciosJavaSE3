package SE04Fundamentos;

import java.util.Scanner;

public class prueba {

	
	public static void main(String[] args) {
		
		
		//
		
		String nombre ;
		int id ;
		double precio ;
		boolean envioGratuito;
		
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el nombre : ");
		nombre = scan.nextLine();
		
		System.out.println("Ingresar el id : ");
		id = scan.nextInt();
		
		System.out.println("Ingresar el precio : ");
		precio = scan.nextDouble();
		
		System.out.println("Envio gratuito  : ");
		envioGratuito = scan.nextBoolean();
		
		//
		System.out.println("Precio : " +precio);
		System.out.println("Envio Gratuito es  : " +envioGratuito);
	}
}
