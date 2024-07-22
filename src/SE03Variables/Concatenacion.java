package SE03Variables;

public class Concatenacion {
	public static void main(String[] args) {
		
		
		//concatenar
		
		var usuario = "Alexis";
		var titulo = "Fawcett";
		
		var union =  usuario + " de " + titulo;
		
		System.out.println("union " + union);
		
		var valor1 = 1;
		var valor2 = 5;
		
		System.out.println(valor1+valor2);
		System.out.println(valor1+valor2+union);
		System.out.println(union + (valor1+valor2));
	}

}
