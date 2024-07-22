package SE00DEOS;

import java.util.Iterator;
import java.util.Scanner;

public class UnoUno {

	
	
	public static void contarLetras(String tes) {
		//palabra
		int contador = 0;
		for (int i = 0; i < tes.length(); i++) {

			if (tes.charAt(i) != '\0') {
				contador++;
			}
		}
		System.out.println(contador);
	}
	
	public static void invertirTexto(String tes) {
		//alexis        //6
		int nav = tes.length();
		var nuevoNombre = "";
		for (int i = tes.length(); i >0 ; i--) {
			nav -=1;
			//System.out.println(tes.charAt(nav));
			nuevoNombre = nuevoNombre+String.valueOf(tes.charAt(nav));
		}
		System.out.println(nuevoNombre);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un texto : " );
		var texto =  scan.next();

		contarLetras(texto);
		invertirTexto(texto);

	}
}
