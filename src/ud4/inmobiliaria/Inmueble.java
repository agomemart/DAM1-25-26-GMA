package ud4.inmobiliaria;

public abstract class Inmueble {
    protected String calle;
    protected int metrosCuadrados;
    protected int habitaciones;
    protected int banhos;
    private int precioAlquiler;
    private int precioVenta;
    
    public Inmueble(String calle, int metrosCuadrados, int habitaciones, int banhos) {
        if (calle != null && !calle.isEmpty() && metrosCuadrados > 0) {
            this.calle = calle;
            this.metrosCuadrados = metrosCuadrados;
            this.habitaciones = habitaciones;
            this.banhos = banhos;
        } else {
            throw new IllegalArgumentException("Datos inválidos.");
        }
        
    }

    public abstract String detalle();

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public String toString() {
        return "Inmueble en " + calle + " (" + metrosCuadrados + " m2, " + habitaciones + " hab)";
    }

    
}
