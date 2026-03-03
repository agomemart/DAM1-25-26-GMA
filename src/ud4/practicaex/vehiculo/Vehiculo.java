package ud4.practicaex.vehiculo;

public class Vehiculo {
    private String marca;
    protected String modelo;
    public int velocidadMaxima;
    
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        if (marca != null && !marca.isEmpty() && modelo != null && !modelo.isEmpty() && velocidadMaxima > 0) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidadMaxima = velocidadMaxima;
        } else {
            throw new IllegalArgumentException("Datos inválidos");
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }

    
}
