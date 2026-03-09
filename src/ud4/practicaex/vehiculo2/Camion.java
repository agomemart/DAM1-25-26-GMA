package ud4.practicaex.vehiculo2;

public class Camion extends Vehiculo implements Transportable {
    private double cargaMaxima;
    private double cargaActual;

    public Camion(String marca, String modelo, double cargaMaxima) {
        super(marca, modelo);
        if (cargaMaxima > 0) {
            this.cargaMaxima = cargaMaxima;
        } else {
            throw new IllegalArgumentException("Carga máxima fuera de rango");
        }

    }

    @Override
    public void cargarMercancia(double peso) {
        if (peso > 0) {
            if (cargaActual + peso > cargaMaxima) {
                System.out.println("No se puede cargar la mercancía. Se supera la carga máxima!!");
            } else {
                cargaActual += peso;
            }
        }

    }

    @Override
    public void descargarMercancia() {
        cargaActual = 0;
    }

    @Override
    public double calcularAutonomia() {
        return 500 - (cargaActual * 2);
    }

}
