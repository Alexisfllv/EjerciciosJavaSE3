package SE06Sentencias;

import java.util.Scanner;

public class ifelse {
	
	public static void main(String[] args) {
		
		//
		
		var condicion = true;
		
		if (condicion) {
			System.out.println("valor es true");
		}else {
			System.out.println("valor es false");
		}
		
		//


		//
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        if(numero >= 1 && numero <= 100) {
            String[] nombresNumeros = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                                       "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                                       "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
                                       "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro", "treinta y cinco", "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve", "cuarenta",
                                       "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco", "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve", "cincuenta",
                                       "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro", "cincuenta y cinco", "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve", "sesenta",
                                       "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro", "sesenta y cinco", "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve", "setenta",
                                       "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro", "setenta y cinco", "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve", "ochenta",
                                       "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro", "ochenta y cinco", "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve", "noventa",
                                       "noventa y uno", "noventa y dos", "noventa y tres", "noventa y cuatro", "noventa y cinco", "noventa y seis", "noventa y siete", "noventa y ocho", "noventa y nueve", "cien"};

            System.out.println("El número ingresado está entre 1 y 100: " + nombresNumeros[numero - 1]);
        } else {
            System.out.println("El número ingresado no está entre 1 y 100.");
        }
        
        //
        
        //
        //
        var numere = 2;
        
        if (numere ==1) {
			
		}else if (numere ==2) {
			System.out.println("numero 2");
		}else if (numere ==3) {
			System.out.println("numero 3");
			
		}else if (numere ==4) {
			System.out.println("numero 4");
		}else if (numere == 5) {
			System.out.println("numero 5");
		}else {
			System.out.println("numero no esta dentro de 1 y 5");
		}
	}

}
