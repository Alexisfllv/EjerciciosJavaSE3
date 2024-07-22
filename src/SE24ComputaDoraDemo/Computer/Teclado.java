package SE24ComputaDoraDemo.Computer;

public class Teclado extends DispositivosEntrada{

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada , String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + ", toString()=" + super.toString() + "]";
    }

    //
    
    
    
}
