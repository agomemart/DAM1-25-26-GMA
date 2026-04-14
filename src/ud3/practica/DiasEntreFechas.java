package ud3.practica;

import java.time.LocalDate;

public class DiasEntreFechas {
    public static int diasEntre(LocalDate f1, LocalDate f2) {
        if (f1 == null || f2 == null) {
            return -1;
        }

        return (int) Math.abs(f1.toEpochDay() - f2.toEpochDay());
    }

    public static void main(String[] args) {
        System.out.println(diasEntre(LocalDate.of(2026, 4, 1), LocalDate.of(2026, 5, 10)));
    }
}
