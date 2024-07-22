package SE09Metodos.ope;

import java.util.Arrays;

public class Aritmetica {

	// Atributos de la clase
	int a;
	int b;
	
	//
	
	public void sumarNumero1() {
		int res =  a+b;
		System.out.println("respuesta es : " + res);
	}
	
	//
	
	public int suma() {
		int res = a+b;
		return res;
	}
	
	
	public void sumarNumero(int arga, int argb) {
		
		a= arga;
		b= argb;
		System.out.println("resultado    : " + (suma()));
	}

	
	//main
	public static void main(String[] args) {
		//
		Aritmetica ar = new Aritmetica();
		
		
		
		ar.sumarNumero(22, 33);
	}
	

}
