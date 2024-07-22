package SE08Clases.Tem;

public class PruebaPersona {

	
	public static void main(String[] args) {
		
		Persona per = new Persona();
		
		per.nombre = "Alexis";
		per.apellido = "Ferrari";
		
		per.desplegarinformacion();
		
		Persona per2 =  new Persona();
		System.out.println("per : " + per);
		System.out.println("per2 : " + per2);
		
		per2.nombre = "Karla";
		per2.apellido = "Lara";
		
		per2.desplegarinformacion();
		
		
	}
}
