package A01.Biblioteca;

public class Persona {

    protected String nombrePersona;
    protected String apellidoPersona;
    
    public Persona(String nombrePersona , String apellidoPersona){
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    @Override
    public String toString() {
        return "Persona [nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + "]";
    }

    //

    //
    
    
}
