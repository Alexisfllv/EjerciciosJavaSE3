package SE35ClaseObject.Domain;

public class Empleado {

    protected String nombreEmpleado;
    protected double sueldoEmpleado;

    public Empleado(String nombreEmpleado, double sueldoEmpleado){
        this.nombreEmpleado =  nombreEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado [nombreEmpleado=" + nombreEmpleado + ", sueldoEmpleado=" + sueldoEmpleado + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreEmpleado == null) ? 0 : nombreEmpleado.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sueldoEmpleado);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (nombreEmpleado == null) {
            if (other.nombreEmpleado != null)
                return false;
        } else if (!nombreEmpleado.equals(other.nombreEmpleado))
            return false;
        if (Double.doubleToLongBits(sueldoEmpleado) != Double.doubleToLongBits(other.sueldoEmpleado))
            return false;
        return true;
    }

    //

    
    
    
}
