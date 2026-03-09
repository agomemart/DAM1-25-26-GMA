package ud4.practicaex.productos;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        if (nombre != null && !nombre.isEmpty() && precio > 0 && stock >= 0) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("Datos incorrectos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void mostrarInfo(){
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }

    

}
