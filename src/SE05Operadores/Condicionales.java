package SE05Operadores;

public class Condicionales {
	
	public static void main(String[] args) {
		
		
		//
		var a = 10;
		
		var valorMinimo = 0;
		
		var valorMaximo = 10;
		
		//
		var res =  a>=10 && a <=10;
		
		System.out.println(res);
		
		if (res) {
			System.out.println("valor verdadero");
		}else {
			System.out.println("valor falso");
		}
		
		//pr
		
		var vacaciones  = false;
		var diaDescanso = false;
		
		if (vacaciones || diaDescanso) {
			System.out.println("esta libre");
		}else {
			System.out.println("no esta libre");
		}
	
	}

}
