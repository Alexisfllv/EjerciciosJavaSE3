package SE26Enums;

public class Prueba {

    public static void main(String[] args) {

        System.out.println(Dias.DOMINGO);

        indicarDiadelaSemana(Dias.LUNES);

        //

        //uso del metodo enum
        System.out.println("cont 4 :" + Continentes.AFRICA );
        System.out.println("numero de paises 4 :" + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiadelaSemana(Dias dias) {
        switch (dias) {
            case DOMINGO:
                System.out.println(Dias.DOMINGO + "DIA 7");
                break;
            case LUNES:
                System.out.println(Dias.LUNES + " DIA 1");
                break;
            case MARTES:
                System.out.println(Dias.MARTES);
                break;
            case MIERCOLES:
                System.out.println(Dias.MIERCOLES);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
