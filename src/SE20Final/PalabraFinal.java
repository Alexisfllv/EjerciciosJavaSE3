package SE20Final;

import static SE19Paquetes.utills.util.imprimir;

public class PalabraFinal extends Modelo{

    //
    public static void main(String[] args) {
        
        //Variables Final

        final int numero = 10;

        System.out.println(numero);

        //metodo final
        //imprimir("vacio");

        System.out.println(MI_CONSTANTE);

        //
        final Modelo md = new Modelo();
        md.setNombre("nani");

        System.out.println(md.getNombre());
        md.setNombre("low");

        System.out.println(md.getNombre());

        Modelo mee=  new Modelo();

        System.out.println(mee.getNombre());
    }
    
}
