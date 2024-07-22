package SE06Sentencias;

import java.util.Scanner;

public class EstancionesSwitch {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el nombre del mes:");
	        String mes = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas para facilitar la comparación

	        System.out.println("Ingrese el número del día (1-31):");
	        int dia = scanner.nextInt();

	        String estacion = determinarEstacion(mes, dia);
	        if (estacion != null) {
	            System.out.println("Estamos en " + estacion + ".");
	        } else {
	            System.out.println("Mes no válido.");
	        }
	    }

	    public static String determinarEstacion(String mes, int dia) {
	        switch (mes) {
	            case "enero":
	            case "febrero":
	                return "invierno";
	            case "marzo":
	                return (dia < 20) ? "invierno" : "primavera";
	            case "abril":
	            case "mayo":
	                return "primavera";
	            case "junio":
	                return (dia < 20) ? "primavera" : "verano";
	            case "julio":
	            case "agosto":
	                return "verano";
	            case "septiembre":
	                return (dia < 22) ? "verano" : "otoño";
	            case "octubre":
	            case "noviembre":
	                return "otoño";
	            case "diciembre":
	                return (dia < 20) ? "otoño" : "invierno";
	            default:
	                return null;
	        }
	    }

}
