package SE16Estaticos;

public class Persona {

    //
    private int idPersona;
    private String nombre;
    //variable static
    private static int contadorPersonas;


    public Persona(String nombre){
        this.nombre = nombre;
        //incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }


    public int getIdPersona() {
        return idPersona;
    }


    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public static int getContadorPersonas() {
        return contadorPersonas;
    }


    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }


    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
    }

    
    
        

}
