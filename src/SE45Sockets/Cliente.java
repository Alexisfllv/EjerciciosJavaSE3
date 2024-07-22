package SE45Sockets;
import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {
        String direccionServidor = "localhost"; // Dirección del servidor
        int puerto = 1234; // Puerto del servidor
        try (Socket socket = new Socket(direccionServidor, puerto)) {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String mensaje;
            while (true) {
                System.out.print("Escribe un mensaje: ");
                mensaje = teclado.readLine();
                if (mensaje.equalsIgnoreCase("salir")) {
                    break;
                }
                salida.println(mensaje);
                System.out.println("Respuesta del servidor: " + entrada.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
