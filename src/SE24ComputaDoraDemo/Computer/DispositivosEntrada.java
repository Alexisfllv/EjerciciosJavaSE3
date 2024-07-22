package SE24ComputaDoraDemo.Computer;

public class DispositivosEntrada {

    private String tipoEntrada;
    private String marca;

    public DispositivosEntrada(String tipoEntrada, String marca){
        this.tipoEntrada =  tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivosEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
    }

    //
    
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //toString

    //
    


    //gts
    
}
