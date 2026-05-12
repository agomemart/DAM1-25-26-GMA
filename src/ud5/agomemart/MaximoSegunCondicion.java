package ud5.agomemart;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 * @author Adrián Gómez Martínez
 */
public class MaximoSegunCondicion {
    public static <T> T maximoSegunCondicion(Collection<T> col, Comparator<T> comp, Predicate<T> p) {
        if (col == null || col.isEmpty() || comp == null || p == null) {
            return null;
        }

        T mayor = null;
        for (T e : col) {
            if (p.test(e)) {
                if (mayor == null || comp.compare(e, mayor) > 0) {
                    mayor = e;
                }
            }
        }

        if (mayor == null) {
            throw new IllegalArgumentException("Ningún elemento cumple la condición");
        }

        return mayor;
    }

    public static void main(String[] args) {
        Collection<LocalDate> fechas = Arrays.asList(LocalDate.of(2026, 3, 28), LocalDate.of(2026, 2, 28));
        Predicate<LocalDate> p = f -> f.isBefore(LocalDate.now());
        Comparator<LocalDate> comp = (f1, f2) -> f1.compareTo(f2);

        System.out.println(maximoSegunCondicion(fechas, comp, p));
    }
}
