package ud4.interfaces.relacionable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AppRelacionable {
    public static void main(String[] args) {
        // Creamos dos fracciones y mostramos cuál es la mayor y cuál menor.
        Fraccion f1 = new Fraccion(3, 5);
        Fraccion f2 = new Fraccion(2, 8);

        if (f1.esMayorQue(f2)) {
            System.out.println(f1 + " > " + f2);
        } else {
            System.out.println(f1 + " <= " + f2);
        }

        // Creamos un ArrayList de fracciones y las mostramos ordenadas de menor a mayor
        ArrayList<Fraccion> fracciones = new ArrayList();

        fracciones.add(new Fraccion(10, 7));
        fracciones.add(new Fraccion(-2, 3));
        fracciones.add(new Fraccion(1, 9));
        fracciones.add(new Fraccion(6, 25));
        fracciones.add(new Fraccion(3, 8));
        fracciones.add(new Fraccion(8, 3));

        Collections.sort(fracciones, new Comparator<Fraccion>() {

            @Override
            public int compare(Fraccion o1, Fraccion o2) {
                if (o1.esMayorQue(o2)) {
                    return 1;
                } else if (o1.esMenorQue(o2)) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });

        System.out.println("Fracciones ordenadas de menor a mayor");
        for (Fraccion f : fracciones) {
            System.out.print(f + " ");
        }
    }
}
