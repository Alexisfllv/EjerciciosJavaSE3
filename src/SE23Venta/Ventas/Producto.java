package SE23Venta.Ventas;

public class Producto {
    //

    private int IdProducto;
    private String nombre;
    private double precio;
    private static int contarProductos;

    private Producto() {
        this.IdProducto = ++Producto.contarProductos;
    }
    public Producto( String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getIdProducto() {
        return IdProducto;
    }
    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto [IdProducto=" + IdProducto + ", nombre=" + nombre + ", precio=" + precio + ", contarProductos="
                + contarProductos + "]";
    }

    //Funcionalidad
    //Crear objetos de tipo producto
    

    

    
}
