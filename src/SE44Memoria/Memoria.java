package SE44Memoria;

import java.lang.ref.Cleaner;

public class Memoria {

    // Define una clase que usa recursos y necesita limpieza
    static class Resource implements AutoCloseable {
        private static final Cleaner cleaner = Cleaner.create();

        // Clase estática que realiza la limpieza
        private static class State implements Runnable {
            @Override
            public void run() {
                System.out.println("Limpiando recursos...");
            }
        }

        private final State state;
        private final Cleaner.Cleanable cleanable;

        public Resource() {
            this.state = new State();
            this.cleanable = cleaner.register(this, state);
        }

        @Override
        public void close() {
            cleanable.clean();
        }
    }

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            System.out.println("Usando el recurso...");
        } // El recurso se limpia automáticamente al salir del try-with-resources
    }
}
