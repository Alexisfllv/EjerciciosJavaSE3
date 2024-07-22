package SE38JabaBeans.Domain;

import java.io.Serializable;

public class Persona implements Serializable{

    //variables privadas`
    private String nombre;
    private String apellido;

    //constructor vacio
    public Persona(){

    }

    //consctructor con argumentos
    public Persona(String nombre , String apellido){
        this.nombre =  nombre;
        this.apellido = apellido;
    }
    //GTS STS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

   
    


    
}

