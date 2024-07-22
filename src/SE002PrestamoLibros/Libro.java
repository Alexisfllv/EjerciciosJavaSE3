package SE002PrestamoLibros;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo , String autor, boolean disponible){
        this.titulo =  titulo;
        this.autor =  autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

    
    
}
