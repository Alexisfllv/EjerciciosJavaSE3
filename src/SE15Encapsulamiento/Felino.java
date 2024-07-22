package SE15Encapsulamiento;

public class Felino {
    
    private String raza;
    private String alias;
    private int cantidad;
    private boolean exstinto;

    public Felino(String raza, String alias,int cantidad, boolean exstinto){
        this.raza = raza;
        this.alias = alias;
        this.cantidad = cantidad;
        this.exstinto = exstinto;
    }

    //gts

    public String getRaza(){
        return this.raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    //
    public String getAlias(){
        return this.alias;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    //
    public boolean isExstinto(){
        return this.exstinto;
    }

    public void setExstinto(boolean exstinto){
        this.exstinto = exstinto;
    }

}
