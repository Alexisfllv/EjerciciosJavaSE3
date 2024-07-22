package SE001Biblioteca;

public class Usuario {

    private String nombre;
    private String telefono;

    public Usuario(String nombre , String telefono){
        this.nombre =  nombre;
        this.telefono = telefono;
    }
    //
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
