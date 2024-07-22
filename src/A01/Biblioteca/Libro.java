package A01.Biblioteca;

public class Libro {

    protected String nombreLibro;
    protected String autorLibro;
    protected boolean estadoLibro;

    public Libro(String nombreLibro,String autorLibro,boolean estadoLibro){
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.estadoLibro =  estadoLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public boolean isEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(boolean estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    @Override
    public String toString() {
        return "Libro [nombreLibro=" + nombreLibro + ", autorLibro=" + autorLibro + ", estadoLibro=" + estadoLibro
                + "]";
    }

    

    
    
    
}
