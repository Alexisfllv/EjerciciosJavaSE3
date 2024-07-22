package SE08Clases.Tem;

public class Persona {
	
	
	//atributos de la clase
	public String nombre =  "txt" ;
	public String apellido;
	public char genero ;
	public String ocupacion;
	
	//
	public String obtenerNombre() {
		return nombre;
	}
	
	//
	public char obtenerGenero() {
		return genero;
	}
	
	//
	public String obtenerOcupacion() {
		return ocupacion;
	}
	
	///
	public void modificarNombre(String nombre) {
		System.out.println("nuevo nombre : " + nombre);
	}
	///
	public void modificarGenero(char genero) {
		System.out.println("nuevo genero : " + genero);
	}
	///
	public void modificarOcupacion(String ocupacion) {
		System.out.println("nueva ocupacion : " + ocupacion);
	}
	
	
	
	//
	public void desplegarinformacion() {
		System.out.println("nombre es : "+nombre);
		System.out.println("apellidos es : " + apellido);
	}
	
	//main
	public static void main(String[] args) {
		Persona p = new Persona();
		
		
		
		
	}

}
