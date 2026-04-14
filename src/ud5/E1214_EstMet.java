package ud5;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E1214_EstMet {
    public static void mostrarMenu() {
        System.out.println("1. Nuevo registro");
        System.out.println("2. Listar registros");
        System.out.println("3. Mostrar estadísticas");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        System.out.print("Selección: ");
        int opcion = sc.nextInt();
        Map<Integer, LocalTime> estacion = new HashMap<>();

        switch (opcion) {
            case 1:
                System.out.print("Inserta la temperatura: ");
                int temperatura = sc.nextInt();
                estacion.put(temperatura, LocalTime.now());
                break;
            case 2:
                System.out.println(estacion);
                break;
            case 3:

                break;
            case 4:
                System.out.println("Hasta pronto!!");
                break;
        }

        sc.close();
    }
}
