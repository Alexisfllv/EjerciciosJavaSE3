package SE41Genericos.Test;

import SE41Genericos.Domain.ClaseGenerica;

public class TesGenerica {
    //
    public static void main(String[] args) {
        ClaseGenerica <Integer> objint =  new ClaseGenerica<Integer>(12);
        objint.obtenerTipo();

        ClaseGenerica<String> objString = new ClaseGenerica<String>("ss");
        objString.obtenerTipo();
    }
    
}
