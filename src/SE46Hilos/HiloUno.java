package SE46Hilos;

public class HiloUno {
    
    public static void main(String[] args) {
        HiloCeros ceros =  new HiloCeros();

        ceros.start();

        HiloUnos unos =  new HiloUnos();
        unos.start();
    }
}


class HiloCeros extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" 0 - ");
        }
    }

}


class HiloUnos extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" 1 - ");
        }
    }
    
}