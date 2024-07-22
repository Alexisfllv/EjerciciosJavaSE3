package SE14Thies;

public class PalabrasThis {
	
	public static void main(String[] args) {
		
		
		Persona per = new Persona("Alexis", "Fawcett");
		System.out.println("Persona  : " + per);
		System.out.println(per.nombre);
		System.out.println(per.apellido);
	}

}


//
class Persona{
	String nombre;
	String apellido;
	
	Persona(String nombre , String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
		System.out.println(this);

		
		new Imprimir().imprimir(this);
	}
}

class Imprimir{
	
	public void imprimir(Persona per) {
		System.out.println(" Persona desde Imprimir : " +per );
		System.out.println(" obj this  : " + this );
	}
}