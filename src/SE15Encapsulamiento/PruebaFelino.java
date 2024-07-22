package SE15Encapsulamiento;

public class PruebaFelino {

    //
    public static void main(String[] args) {
        
        Felino fe =  new Felino("Leon", "Sabana", 450, false);

        System.out.println(fe.getRaza());
        System.out.println(fe.getAlias());
        System.out.println(fe.getCantidad());
        System.out.println(fe.isExstinto());

        //
        fe.setRaza("Tigre");
        fe.setAlias("Selva");
        fe.setCantidad(200);
        fe.setExstinto(true);

        //
        System.out.println(fe.getRaza());
        System.out.println(fe.getAlias());
        System.out.println(fe.getCantidad());
        System.out.println(fe.isExstinto());
    }
    
}
