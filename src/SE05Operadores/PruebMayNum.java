package SE05Operadores;

import java.util.Scanner;

public class  PruebMayNum {
	
	public static void main(String[] args) {
		
		//
		var num1 = 0;
		var num2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar numero 1 : ");
		num1 =  scan.nextInt();
		
		System.out.println("Ingresar numero 2 : ");
		num2 =  scan.nextInt();

		
		
		//
		var res = num1>num2 ? "numero 1 es mayor : " + num1 : "numero 2 es mayor : " +num2;
		System.out.println(res);
	}
	

}
