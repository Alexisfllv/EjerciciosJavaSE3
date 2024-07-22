package SE31Sobreescritura;

public class Gerente extends Empleado{
    
    private String departamento;


    public Gerente(String nombre , double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //sobreescritura del metodo obtenerDetalles con el atributo departamento

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " y Departamento : " + this.departamento;
    }

}
