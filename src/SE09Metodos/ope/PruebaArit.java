package SE09Metodos.ope;

public class PruebaArit {
	
	public static void main(String[] args) {
		
		Aritmetica ar =  new Aritmetica();
		
		ar.a = 12;
		ar.b = 23;
		ar.sumarNumero1();
		
		//
		
		int res =  ar.suma();
		
		System.out.println(res);
		
		ar.sumarNumero(22, 33);
		ar.sumarNumero(33, 55);
		
		ar.sumarNumero1();
	}

}
