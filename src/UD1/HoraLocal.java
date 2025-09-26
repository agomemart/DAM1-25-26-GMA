package ud1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HoraLocal {
    public static void main(String[] args) {
        LocalTime horaActual;
        horaActual = LocalTime.now();

        System.out.println("Hora actual: " + horaActual);

        LocalDate fechaActual;
        fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        System.out.println("Fecha y hora actuales: " + LocalDateTime.now());
    }
}
