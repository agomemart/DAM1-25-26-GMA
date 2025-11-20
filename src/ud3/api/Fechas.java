package ud3.api;

import java.time.LocalDate;

public class Fechas {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        LocalDate vacaciones = LocalDate.of(2025, 12, 19);
        System.out.println(vacaciones);

        if (hoy.isAfter(vacaciones)) {
            System.out.println("Estamos de vacaciones");
        } else {
            System.out.println("Aún no estamos de vacaciones");
            int diaHoy = hoy.getDayOfYear();
            int diaVacaciones = vacaciones.getDayOfYear();
            int dias = diaVacaciones - diaHoy;

            System.out.println("Faltan... " + dias + " dias");
        }
    }

}
