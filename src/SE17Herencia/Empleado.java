package SE17Herencia;


//heredar la clase persona
public class Empleado extends Persona{
    //
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;


    //constructor inizializado a usar
    public Empleado(String nombre, boolean genero , int edad , String direccion ,double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }


    public int getIdEmpleado() {
        return this.idEmpleado;
    }



    public double getSueldo() {
        return this.sueldo;
    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado [idEmpleado= ").append(idEmpleado);
        sb.append(", SUeldo = ").append(this.sueldo);
        sb.append(", ").append(super.toString());

        sb.append(']');
        return sb.toString();
    }

    //
    
    

    

   
    


}
