package ud4.practicaex.vehiculo;

public class Moto extends Vehiculo{
    private double peso;

    public Moto(String marca, String modelo, int potencia, double peso) {
        super(marca, modelo, potencia);
        this.peso = peso;
    }

    @Override
    public double calcularRendimiento() {
        return (double) potencia / peso;
    }

    @Override
    public double obtenerVelocidadCompeticion() {
        return calcularRendimiento();
    }

    

    
}
