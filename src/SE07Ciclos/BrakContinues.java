package SE07Ciclos;

import java.util.Iterator;

public class BrakContinues {
	
	public static void main(String[] args) {
		
		//var
		
		var num = 10;
		var text = "";
		
		
		
		for (int i = 0; i <= num; i++) {
			//
			if (i % 2 !=0) {
				continue ;
			}
			System.out.println("numero pares : " + i );
		}
		
		//break; cancelar el ciclo
		//continue; ir a la siguiente
	}

}
