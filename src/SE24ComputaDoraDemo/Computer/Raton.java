package SE24ComputaDoraDemo.Computer;

public class Raton extends DispositivosEntrada{
    private int idRaton;
    private static int contadorRaton;


    //no se puede inciar otro constructor 
    // public Raton(){
    //     this.idRaton =  ++Raton.contadorRaton;
    // }

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton =  ++Raton.contadorRaton;
    }


    @Override
    public String toString() {
        return "Raton [idRaton=" + idRaton + ", toString()=" + super.toString() + "]";
    }


    


    

    

    
    
}
