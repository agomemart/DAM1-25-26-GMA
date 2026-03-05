package ud4.practicaex.vehiculo;

import java.util.Arrays;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];

        Moto m1 = new Moto("Yamaha", "Modelo 1", 120, 500);
        CocheCarreras c1 = new CocheCarreras("BMW", "Competition", 320, 120);
        CocheCarreras c2 = new CocheCarreras("Mercedes", "A35S", 360, 240);

        vehiculos[0] = c1;
        vehiculos[1] = m1;
        vehiculos[2] = c2;

        Arrays.sort(vehiculos);
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].calcularRendimiento());
        }
    }
}
