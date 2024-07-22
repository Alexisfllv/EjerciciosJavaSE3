package SE34Casting.Test;

import SE34Casting.Domain.Escritor;
import SE34Casting.Domain.Persona;
import SE34Casting.Enums.Escritura;

public class Prueba {

    public static void main(String[] args) {
        //
        Persona pes;
        //
        pes =  new Escritor("Alexis", "Lima", Escritura.CLASICO);
        System.out.println(pes.mostarmiInformacion());
        System.out.println(pes);
        
        //
        // ((Escritor)es).getTipoEscrituraClase();
        
        //downCasting  de pes(Persona) -> Escritor
        ((Escritor)pes).getTipoEscrituraClase();
        System.out.println(((Escritor)pes).getTipoEscrituraClase());
        
        //upCastin uso deesc(Escritor) -> Persona 
        Escritor esc =  (Escritor)pes;
        //esc.getTipoEscrituraClase();
        System.out.println(esc.getTipoEscrituraClase());
        
    }
    
}
