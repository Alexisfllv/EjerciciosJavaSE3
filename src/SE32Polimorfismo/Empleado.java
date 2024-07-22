package SE32Polimorfismo;

public class Empleado {
    //
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String imprimirDatos(){
        return "Nombres  : " + this.nombre  + " Sueldo es : " + this.sueldo;
    }

    

    
    
}
