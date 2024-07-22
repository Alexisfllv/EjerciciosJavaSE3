package SE06Sentencias;

import java.util.Scanner;

public class Estaciones {

	
	public static void main(String[] args) {
		
		//
		var dia = 0;
		var mes = "";
		
		Scanner scan =  new Scanner(System.in);
		//
		System.out.println("Ingrese numero de dia  : ");
		dia =  scan.nextInt();
		System.out.println("Ingrese mes : ");
		mes = scan.next().toLowerCase();
		
		
		if ((mes.equals("junio") && dia > 20) || mes.equals("julio") || mes.equals("agosto") || mes.equals("septiembre") && dia <=20) {
		    System.out.println("Es Verano");
		}else if ((mes.equals("septiembre") && dia > 20) || mes.equals("noviembre") || mes.equals("diciembre") || mes.equals("septiembre") && dia <=20) {
		    System.out.println("Es Otonio");
		}else if ((mes.equals("diciembre") && dia > 20) || mes.equals("enero") || mes.equals("febrero") || mes.equals("marzo") && dia <=20) {
		    System.out.println("Es Invierno");
		}else if ((mes.equals("marzo") && dia > 20) || mes.equals("abril") || mes.equals("mayo") || mes.equals("junio") && dia <=20) {
		    System.out.println("Es Primavera");
		}else {
			System.out.println(dia + " y el mes  " + mes + " no existen .");
		}
		
	}
}
