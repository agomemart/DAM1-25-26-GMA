package ud3.practica;

import java.time.LocalDate;

public class FormatearFecha {
    public static String formatearFecha(LocalDate fecha) {
        if (fecha == null) {
            return "";
        }

        return fecha.getDayOfMonth() + " de " + fecha.getMonth().toString().toLowerCase() + " de " + fecha.getYear();
    }

    public static void main(String[] args) {
        System.out.println(formatearFecha(LocalDate.of(2026, 4, 12)));
    }
}
