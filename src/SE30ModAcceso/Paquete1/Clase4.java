package SE30ModAcceso.Paquete1;

public class Clase4 {

    private String mensajePrivado = "Mensaje privado";

    private Clase4(){
        System.out.println("Constructor privado");
    }

    private void metodoPrivado(){
        System.out.println("Metodo privaod");
        
    }

    public Clase4(String mensajePrivado){
        this();
        this.mensajePrivado =  mensajePrivado;
    }

    public String getMensajePrivado() {
        return mensajePrivado;
    }

    public void setMensajePrivado(String mensajePrivado) {
        this.mensajePrivado = mensajePrivado;
    }
    
    
}
