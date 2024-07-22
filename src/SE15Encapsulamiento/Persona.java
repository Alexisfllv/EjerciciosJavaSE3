package SE15Encapsulamiento;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre =  nombre;
        this.sueldo =  sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    //
    public String toString(){
        return "Nombre de persona : "+ this.nombre + 
                "Nombre de sueldo : " + this.sueldo + 
                "Eliminado : " + this.eliminado;
    }
    
    
    
}
