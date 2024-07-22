package SE27Bloques;

public class Persona {

    private int idPersona;
    private static int contadorPersonas;

    static{
        System.out.println("Primero bloq");
        ++Persona.contadorPersonas;
        //solo variables staticas
    }

    {
        System.out.println("Bloque no static o dinamico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona(){
        System.out.println("BLOQUE CONSTRUCTOR VACIO");
    }


    public int getIdPersona(){
        return this.idPersona;
    }


    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + "]";
    }
    

    
}
