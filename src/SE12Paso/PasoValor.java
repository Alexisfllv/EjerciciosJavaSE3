package SE12Paso;

public class PasoValor {
	
	public static void main(String[] args) {
		
		//
		
		var x = 10;
		
		System.out.println("x = : " + x);
		
		
		cambioValor(x);
		
		
		System.out.println("x nuevo valor = : " + x);
		
		
		System.out.println("cambio valor 2 , x = : " +cambioValor2(x));
		
	}
	
	//metodos
	public static void cambioValor(int arg1) {
		System.out.println("arg1 = "  + arg1);
		arg1 = 15;
	}
	
	public static int cambioValor2(int arg1) {
		
		return arg1 = 15;
	}

}
