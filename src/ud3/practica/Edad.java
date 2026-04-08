package ud3.practica;

import java.time.LocalDate;
import java.time.Period;

public class Edad {
    public static void main(String[] args) {
        LocalDate fechaNac = LocalDate.of(2014, 4, 8);
        Period periodo = Period.between(fechaNac, LocalDate.now());

        System.out.println("Tienes " + periodo.getYears() + " años.");
    }
}
