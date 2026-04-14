package ud3.practica;

import java.time.LocalDate;

public class SumarDias {
    public static LocalDate sumarDias(LocalDate fecha, int dias) {
        if (fecha == null) {
            return null;
        }

        return fecha.plusDays(dias);
    }

    public static void main(String[] args) {
        System.out.println(sumarDias(LocalDate.of(2026, 1, 30), 10));
    }
}
