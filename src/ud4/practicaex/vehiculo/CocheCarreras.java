package ud4.practicaex.vehiculo;

public class CocheCarreras extends Vehiculo{
    private double factorAerodinamico;

    public CocheCarreras(String marca, String modelo, int potencia, double factorAerodinamico) {
        super(marca, modelo, potencia);
        this.factorAerodinamico = factorAerodinamico;
    }

    @Override
    public double calcularRendimiento() {
        return potencia * factorAerodinamico;
    }

    @Override
    public double obtenerVelocidadCompeticion() {
        return calcularRendimiento();
    }
}
