package SE46Hilos;

public class Hilo {

    public static void main(String[] args) {
        HiloMostrarCero h1 = new HiloMostrarCero();
        HiloMostrarUno h2 = new HiloMostrarUno();
    }
}

class HiloMostrarCero implements Runnable {
    private Thread t;

    public HiloMostrarCero() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int f = 1; f <= 3; f++)
            System.out.print(" 0 - ");
    }
}

class HiloMostrarUno implements Runnable {
    private Thread t;

    public HiloMostrarUno() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int f = 1; f <= 3; f++)
            System.out.print(" 1 - ");
    }
}