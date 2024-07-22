package SE46Hilos;
public class Hile {
    public static void main(String[] args) {
        HiloMostrarCero hiloCero = new HiloMostrarCero();
        HiloMostrarUnos hiloUnos = new HiloMostrarUnos();

        Thread t1 = new Thread(hiloCero);
        Thread t2 = new Thread(hiloUnos);

        t1.start();
        t2.start();
    }
}

class HiloMostrarCero implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.print(" 0 - ");
        }
    }
}

class HiloMostrarUnos implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.print(" 1 - ");
        }
    }
}
