package SE34Casting.Domain;


public class Persona {

    protected String nombrePersona;
    protected String direccionPersona;

    public Persona(String nombrePersona, String direccionPersona){
        this.nombrePersona = nombrePersona;
        this.direccionPersona = direccionPersona;
    }

    //
    public String mostarmiInformacion(){
        return "Informacion = Persona : " + this.nombrePersona + " direccion : " + this.nombrePersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    //
    

    
}