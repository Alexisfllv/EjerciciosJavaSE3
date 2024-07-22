package SE41Genericos.Domain;

public class ClaseGenerica<T> {
    
    private T objeto;

    //
    public ClaseGenerica(T objecto){
        this.objeto = objecto;
    }

    //
    public void obtenerTipo(){
        System.out.println(objeto);
        System.out.println(objeto.getClass());
        System.out.println(" tipo clase : " + objeto.getClass().getSimpleName());
    }
}
