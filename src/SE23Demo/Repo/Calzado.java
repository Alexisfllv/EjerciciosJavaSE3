package SE23Demo.Repo;

public class Calzado {

    private int idCalzado;
    private String nombreCalzado;
    private double precioCalzado;
    private static int contadorCalzado;

    public Calzado(){
        this.idCalzado =  ++Calzado.contadorCalzado;
    }

    public Calzado(String nombreCalzado, double precioCalzado){
        this();
        this.nombreCalzado  = nombreCalzado;
        this.precioCalzado =  precioCalzado;
    }

    public int getIdCalzado() {
        return idCalzado;
    }

    public void setIdCalzado(int idCalzado) {
        this.idCalzado = idCalzado;
    }

    public String getNombreCalzado() {
        return nombreCalzado;
    }

    public void setNombreCalzado(String nombreCalzado) {
        this.nombreCalzado = nombreCalzado;
    }

    public double getPrecioCalzado() {
        return precioCalzado;
    }

    public void setPrecioCalzado(double precioCalzado) {
        this.precioCalzado = precioCalzado;
    }

    @Override
    public String toString() {
        return "Calzado [idCalzado=" + idCalzado + ", nombreCalzado=" + nombreCalzado + ", precioCalzado="
                + precioCalzado + "]";
    }

    //
    
    
}
