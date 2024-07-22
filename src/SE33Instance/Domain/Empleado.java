package SE33Instance.Domain;

public class Empleado {
    protected String nombre;
    protected String telefono;

    public Empleado(String nombre , String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //metodo de mostrar informacion
    public void mostrarInformacion(){
        System.out.println(" nombre es : " + this.nombre + " telefono es  : " + this.telefono);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //
    
    
}
