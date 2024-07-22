package SE04Fundamentos;

public class Boleans {

	public static void main(String[] args) {
		
		
		//boleanos
		
		Boolean varbool = true;
		System.out.println(varbool);
		var dem = false;
		System.out.println(dem);
		
		
		//
		if (varbool) {
			System.out.println("es true");
		}else {
			System.out.println("es false");
		}
		
		//
		
		System.out.println(varbool ? "true" : "false");
		
		var mensaje = varbool ? "es verdadero" : " es falso";
		
		System.out.println(mensaje);
		
		//
		var edad =30;
		var esAdulto = edad >= 18;
		
		//
		
		System.out.println(esAdulto ? "eres mayor de edad " : "eres menor de edad");
		
	}
}
