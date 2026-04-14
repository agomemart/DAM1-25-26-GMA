package ud3.practica;

import java.time.LocalDate;

public class ComprobarFinDeSemana {
    public static boolean esFinDeSemana(LocalDate fecha) {
        if (fecha == null) {
            return false;
        }

        if (fecha.getDayOfWeek().toString() != "SATURDAY" && fecha.getDayOfWeek().toString() != "SUNDAY") {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(esFinDeSemana(LocalDate.of(2026, 4, 12)));
    }
}
