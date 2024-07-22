package SE46Hilos;

class MiHilo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Contador: " + i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
        }
    }

    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        hilo1.setName("Hilo-1");
        hilo1.start();

        MiHilo hilo2 = new MiHilo();
        hilo2.setName("Hilo-2");
        hilo2.start();
    }
}

