package SE36ClasesAbstractas.Doman;

public class Rectangulo extends FiguraGeometrica{


    //incializar
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Esta figura es un : " + this.getClass().getSimpleName() + " : " + this.tipoFigura);
        
    }
    
}
