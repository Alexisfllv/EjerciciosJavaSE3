package SE00DEOS;

import java.util.Scanner;

public class ManipulacionCadenas {

    public static void contarPalabras(String texto) {
        String[] palabras = texto.split("\\s+");
        System.out.println("Número de palabras en el texto: " + palabras.length);
        
    }

    public static void invertirTexto(String texto) {
        StringBuilder nuevoNombre = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            nuevoNombre.append(texto.charAt(i));
        }
        System.out.println("Texto invertido: " + nuevoNombre.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String texto = scan.nextLine();

        contarPalabras(texto);
        invertirTexto(texto);

        scan.close();
    }
}
