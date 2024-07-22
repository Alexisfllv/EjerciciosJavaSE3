package SE33Instance.Domain;

public class Gerente extends Empleado{

    private String cargo;

    public Gerente(String nombre , String telefono , String cargo){
        super(cargo, telefono);
        this.cargo = cargo;
    }

    //
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(" y cargo es  : " + this.cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
}
