package ud5.practicaEx;

enum Categoria {ELECTRONICA, ROPA, ALIMENTACION}

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private Categoria categoria;
    
    public Producto(String id, String nombre, double precio, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + " euros - " + categoria;
    }

    
}
