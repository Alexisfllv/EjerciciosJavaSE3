package SE32Polimorfismo;

public class Gerente extends Empleado{
    

    private String cargo;

    public Gerente(String nombre , double sueldo , String cargo){
        super(nombre, sueldo);
        this.cargo = cargo;
    }

    //
    @Override
    public String imprimirDatos() {
        
        return super.imprimirDatos() + " Cargo es : " + this.cargo;
    }
}
