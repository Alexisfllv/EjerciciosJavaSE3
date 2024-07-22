package SE13ReturnNull;

import SE08Clases.Tem.Persona;

public class RetornosNulls {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
//		cambiarValor(p);
//		System.out.println("valor : " + p.nombre);
		
		//
		p =  null;
		esNull(p);
		
	}
	
	//
	public static Persona cambiarValor(Persona per) {
		per.nombre = "sos";
		
		return per;
	}
	
	public static Persona esNull(Persona per) {
		if (per == null) {
			System.out.println("Este objeto esta nulo");
			return null;
		}else {
			return per;
		}
	}
}
