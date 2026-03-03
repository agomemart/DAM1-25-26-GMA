package ud4.practicaex.vehiculo;

enum TipoCombustible {
    GASOLINA,
    DIESEL,
    ELECTRICO,
    HIBRIDO
}

public class Coche extends Vehiculo{
    private int numPuertas;
    TipoCombustible combustible;

    public Coche(String marca, String modelo, int velocidadMaxima, TipoCombustible combustible) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = 3;
        this.combustible = combustible;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Combustible: " + combustible);
    }

    public static void main(String[] args) {
        Coche c = new Coche("Mercedes", "CLA", 240, TipoCombustible.ELECTRICO);

        c.mostrarInfo();
    }
    
}
