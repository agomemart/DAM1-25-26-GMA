package ud4.practicaex.vehiculo2;

public class MainVehiculo2 {
    public static void main(String[] args) {
        Coche co1 = new Coche("Mercedes", "Clase C", 50.2);
        Camion ca1 = new Camion("Iveco", "Truck2", 3542.5);

        co1.acelerar(20);
        ca1.acelerar(20);

        ca1.cargarMercancia(526.4);

        co1.mostrarInfo();
        System.out.println("Autonomía: " + co1.calcularAutonomia());
        System.out.println();
        ca1.mostrarInfo();
        System.out.println("Autonomía: " + ca1.calcularAutonomia());
    }
}
