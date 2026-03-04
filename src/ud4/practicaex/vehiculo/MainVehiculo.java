package ud4.practicaex.vehiculo;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];

        Moto m1 = new Moto("Yamaha", "Modelo 1", 120, 500);
        CocheCarreras c1 = new CocheCarreras("BMW", "Competition", 320, 120);
        CocheCarreras c2 = new CocheCarreras("Mercedes", "A35S", 360, 240);
    }
}
