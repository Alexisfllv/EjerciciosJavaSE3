package SE23Productos.Servicio;

public class Accesorio {

    private int idAccesorio;
    private String nombreAccesorio;
    private double precioAcessorio;

    private static int contadorAccesorio;

    public Accesorio(){
        this.idAccesorio = ++Accesorio.contadorAccesorio;
    }

    public Accesorio(String nombreAcessorio,double precioAcessorio){
        this();
        this.nombreAccesorio =  nombreAcessorio;
        this.precioAcessorio =  precioAcessorio;
    }

    public int getIdAccesorio() {
        return idAccesorio;
    }

    public void setIdAccesorio(int idAccesorio) {
        this.idAccesorio = idAccesorio;
    }

    public String getNombreAccesorio() {
        return nombreAccesorio;
    }

    public void setNombreAccesorio(String nombreAccesorio) {
        this.nombreAccesorio = nombreAccesorio;
    }

    public double getPrecioAcessorio() {
        return precioAcessorio;
    }

    public void setPrecioAcessorio(double precioAcessorio) {
        this.precioAcessorio = precioAcessorio;
    }

    @Override
    public String toString() {
        return "Accesorio [idAccesorio=" + idAccesorio + ", nombreAccesorio=" + nombreAccesorio + ", precioAcessorio="
                + precioAcessorio + "]";
    }

    
    
}
