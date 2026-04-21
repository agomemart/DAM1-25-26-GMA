package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EliminarMultiplos3 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            lista.add(rnd.nextInt(10) + 1);
        }

        System.out.println(lista);

        Iterator<Integer> it = lista.iterator();

        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
        }

        System.out.println("Sin múltiplos de 3: " + lista);
    }
}
