package ud4.practicaex.vehiculo;

public abstract class Vehiculo implements Comparable<Vehiculo>, Competidor {
    protected String marca;
    protected String modelo;
    protected int potencia;

    public Vehiculo(String marca, String modelo, int potencia) {
        if (marca != null && !marca.isEmpty() && modelo != null && !modelo.isEmpty() && potencia > 0) {
            this.marca = marca;
            this.modelo = modelo;
            this.potencia = potencia;
        } else {
            throw new IllegalArgumentException("Datos inválidos");
        }

    }

    public abstract double calcularRendimiento();

    @Override
    public int compareTo(Vehiculo o) {
        return Double.compare(this.calcularRendimiento(), o.calcularRendimiento());
    }

}
