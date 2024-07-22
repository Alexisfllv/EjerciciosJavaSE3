package SE34Casting.Enums;

public enum Escritura {
    
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    private final String descripcion;

    private Escritura(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    
}
