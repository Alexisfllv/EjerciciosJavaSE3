package SE42ManejoArchivos.Test;

import SE42ManejoArchivos.Domain.ManejoArchivos;

public class TestArchivo {

    public static void main(String[] args) {
        var nm =  "D:\\prueba\\te.java";

        //ManejoArchivos.crearArchivo(nm);
        ManejoArchivos.escribirArchivo(nm, "public class te {\r\n" + //
                        "\r\n" + //
                        "    \r\n" + //
                        "}");

        //
        ManejoArchivos.anexarArchivo(nm, "save");

        //

        ManejoArchivos.leerArchivo(nm);
    }
    
}
