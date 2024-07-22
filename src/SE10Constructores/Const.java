package SE10Constructores;

public class Const {
	
	//Atri
	
	int a ;
	int b ;
	
	//constructor vacio
	public Const() {
		System.out.println("Hola Const creado");
		//sumarNumero(12,33);
	}
	
	public Const(int a , int b) {
		this.a = a;
		this.b = b;
		System.out.println("Execute sobrecarga");
	}
	
	
	public void sumarNumero(int a, int b) {
		System.out.println(a+b);
	}
	
	//
	public static void main(String[] args) {
		//
		
		//variables locales
		var val1 = 10;
		var val2 = 20;
		
		
		Const const1 =  new Const();
		
		System.out.println(const1.a);
		System.out.println(const1.b);
		
		Const cnt =  new Const(11, 22);
		System.out.println(cnt.a);
		System.out.println(cnt.b);
		
		//
		miMetodo();
		
	}
	
	//metodo
	
	public static void miMetodo() {
		System.out.println("otro metodo");	
	}

}
