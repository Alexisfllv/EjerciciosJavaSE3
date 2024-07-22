package SE11Alcances;

public class Caja {
	
	public int ancho;
	public int alto;
	public int profundo;
	
	public Caja() {
		System.out.println("Constructor vacio");
	}
	
	public Caja(int ancho, int alto, int profundo) {
		//
		this.ancho =  ancho;
		this.alto =  ancho;
		this.profundo = profundo;
		
		System.out.println("Constructor lleno");
	}
	//
	
	public void calcularVolumen() {
		int volumen = this.ancho * this.alto * this.profundo;
		System.out.println("Volumen es : " + volumen);
	}
	//
	

}
