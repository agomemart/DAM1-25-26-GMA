package ud3.practica;

import java.time.LocalDate;
import java.time.Period;

public class CalcularEdad {
    public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            return -1;
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
