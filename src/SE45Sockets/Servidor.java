package SE45Sockets;

import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        int puerto = 1234; // El puerto en el que el servidor escuchará
        try (ServerSocket servidor = new ServerSocket(puerto)) {
            System.out.println("Servidor iniciado, esperando conexiones...");
            while (true) {
                try (Socket socket = servidor.accept()) {
                    System.out.println("Cliente conectado");
                    // Aquí puedes manejar la comunicación con el cliente
                    BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                    String mensaje;
                    while ((mensaje = entrada.readLine()) != null) {
                        System.out.println("Mensaje recibido: " + mensaje);
                        salida.println("Echo: " + mensaje); // Respuesta al cliente
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}