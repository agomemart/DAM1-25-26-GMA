package ud3.practica;

import java.time.Duration;
import java.time.LocalTime;

public class DiferenciaHoras {
    public static String diferenciaHoras(LocalTime h1, LocalTime h2){
        if (h1 == null || h2 == null) {
            return "";
        }

        Duration duracion = Duration.between(h1, h2).abs();
        long horas = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;

        return horas + " horas y " + minutos + " minutos";
    }

    public static void main(String[] args) {
        System.out.println(diferenciaHoras(LocalTime.of(1, 10, 30), LocalTime.of(10, 25, 10)));
    }
}
