package SE18Sobrecarga;

import SE17Herencia.Persona;

public class Trabajador extends Persona{
    
    private int horasTrabajadas;
    private String cargo;

    //vacio
    public Trabajador(){

        System.out.println("Vacio");
    }

    //lleno
    public Trabajador(String nombre,char genero,String cargo , int horasTrabajadas){
        super(nombre, genero, horasTrabajadas, cargo);
        this.cargo = cargo;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Trabajador [nombre=" + nombre + ", genero=" + genero + ", horasTrabajadas=" + horasTrabajadas
                + ", cargo=" + cargo + "]";
    }

    
}
