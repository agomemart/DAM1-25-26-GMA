package ud4.practicaex.vehiculo2;

public class Coche extends Vehiculo{
    private double combustible;

    public Coche(String marca, String modelo, double combustible) {
        super(marca, modelo);
        if (combustible > 0) {
            this.combustible = combustible;
        } else {
            throw new IllegalArgumentException("Valor de combustible fuera de rango");
        }
        
    }

    @Override
    public double calcularAutonomia() {
        return combustible * 15;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Combustible: " + combustible);
    }

    
    
}
