package SE05Operadores;

import java.util.Iterator;

public class Asignacion {

	
	public static void main(String[] args) {
		
		//
		
		int a= 3,b=2;
		int c = a+5-b;
		
		System.out.println("c = "  +c);
		
		a+= 1;  // a = a+1;
		
		System.out.println(a);
		
		//incremento de numeros de 0,2,4,6
		
		
		int dem = 0;
		for (int i = 0; i <=4; i++) {
			
			dem +=2;
			
			System.out.println(dem);
		}
		

		
		for (int i = 0; i <=10; i+=2) {
			
			System.out.println(i);
		}
		
		///
		//  -=2 , +=2 , *=2 , /=2 , %=2;;
	}
}
