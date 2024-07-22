package SE24ComputaDoraDemo.Computer;

public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    //vacio
    public Monitor(){
        this.idMonitor =  ++Monitor.contadorMonitores;
    }

    //lleno

    public Monitor(String marca,double tamano){
        this();
        this.marca =  marca;
        this.tamano = tamano;
    }
    //

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + "]";
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    

    
    
}
