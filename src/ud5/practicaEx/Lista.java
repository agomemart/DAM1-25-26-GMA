package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Jorge");
        nombres.add("Pepe");
        nombres.add("Adrián");
        nombres.add("Martín");
        nombres.add("Hugo");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        for (String nombre : nombres) {
            if (Character.toUpperCase(nombre.charAt(0)) == 'A') {
                System.out.println(nombre);
            }
        }

        String nombreEliminar = "Hugo";
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            if (it.next().equals(nombreEliminar)) {
               it.remove();
            }
        }

        while (it.hasNext()) {
            if (it.next().length() < 4) {
                it.remove();
            }
        }
    }
}
