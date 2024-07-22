package SE34Casting.Domain;

public class Trabajador extends Persona{

    private String cargoTrabajador;

    public Trabajador(String nombrePersona,String direccionPersona, String cargoTrabajador){
        super(nombrePersona, direccionPersona);
        this.cargoTrabajador =  cargoTrabajador;
    }
    //

    public String getCargoTrabajador() {
        return cargoTrabajador;
    }

    public void setCargoTrabajador(String cargoTrabajador) {
        this.cargoTrabajador = cargoTrabajador;
    }

    //Metodo de Mostrar
    @Override
    public String mostarmiInformacion() {
        
        return super.mostarmiInformacion() + " Trabajador = Cargo :  " + this.cargoTrabajador;
    }


    
    
}
