package ud5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E1214_EstMet {
    static Scanner sc = new Scanner(System.in);
    static List<RegistroTemp> registros = new ArrayList<>();

    public static int opcionMenu() {
        System.out.println("1. Nuevo registro");
        System.out.println("2. Listar registros");
        System.out.println("3. Mostrar estadísticas");
        System.out.println("4. Salir");

        return sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.print("Selección: ");
        int opcion = opcionMenu();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.print("Inserta la temperatura en grados: ");
                    double temp = sc.nextDouble();
                    registros.add(new RegistroTemp(LocalTime.now(), temp));
                    break;
                case 2:
                    System.out.println(registros);
                    break;
                case 3:
                    Comparator<RegistroTemp> comparador = (o1, o2) -> Double.compare(o1.grados, o2.grados);
                    System.out.println("Máximo temperatura: " + Collections.max(registros, comparador));
                    System.out.println("Mínimo temperatura: " + Collections.min(registros, (o1, o2) -> Double.compare(o1.grados, o2.grados)));
                    double promedio = 0;
                    for (RegistroTemp r : registros) {
                        promedio += r.grados;
                    }
                    promedio /= registros.size();
                    System.out.println("Promedio: " + promedio);
                    break;
            }
        }

        sc.close();
    }
}

class RegistroTemp {
    LocalTime hora;
    double grados;
    
    public RegistroTemp(LocalTime hora, double grados) {
        this.hora = hora;
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "RegistroTemp [hora=" + hora + ", grados=" + grados + "]";
    }

}
