package ud4.practicaex.vehiculo2;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidad;
    
    public Vehiculo(String marca, String modelo) {
        if (marca == null || marca.isEmpty() || modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Datos incorrectos");
        }
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    public void frenar(int decremento){
        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }

    public abstract double calcularAutonomia();
    
}
