package SE11Alcances;

public class Prueba {

	
	public static void main(String[] args) {
		
		//
		
		Caja caja1 =  new Caja();
		caja1.ancho = 5;
		caja1.alto = 6;
		caja1.profundo = 7;
		
		caja1.calcularVolumen();
		
		//
		
		Caja caja2 =  new Caja(3, 4, 5);
		caja2.calcularVolumen();
		
	}
}
