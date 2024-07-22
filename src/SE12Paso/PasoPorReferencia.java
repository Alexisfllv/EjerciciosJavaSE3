package SE12Paso;

import SE08Clases.Tem.Persona;

public class PasoPorReferencia {

	
	public static void main(String[] args) {
		
		
		//
		Persona p =  new Persona();
		
		p.nombre = "alexis";
		System.out.println("persona nombre : " + p.nombre);
		
		cambioValor(p);
		System.out.println("persona nombre per : " + p.nombre);
	}
	
	
	public static void cambioValor(Persona per) {
		per.nombre = "Karla";
	}
}
