package SE34Casting.Domain;

import SE34Casting.Enums.Escritura;

public class Escritor extends Persona{

    //

    final Escritura escritura;

    public Escritor (String nombrePersona ,String direccionPersona , Escritura escritura ){
        super(nombrePersona, direccionPersona);
        this.escritura = escritura;
    }

    //
    @Override
    public String mostarmiInformacion() {
        
        return super.mostarmiInformacion() + " Tipo de Escritura : " + escritura.getDescripcion();
    }

    //
    public void vermiTipoEscritura(){
        System.out.println( " Mi escritura es: "+ escritura.getDescripcion());
    }

    public Escritura  getTipoEscrituraClase(){
        return this.escritura;
    }
    
}
