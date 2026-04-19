package ud3.practica;

import java.time.LocalTime;
import java.util.Random;

public class HoraFeliz {
    public static void main(String[] args) {
        Random rnd = new Random();

        int horaAleatoria = rnd.nextInt(24);
        int minAleatorio = rnd.nextInt(60);

        LocalTime inicioHoraFeliz = LocalTime.of(horaAleatoria, minAleatorio);
        LocalTime finHoraFeliz = inicioHoraFeliz.plusHours(1);

        LocalTime horaActual = LocalTime.now();

        System.out.println("Inicio: " + inicioHoraFeliz + " y fin: " + finHoraFeliz);
        System.out.println("Hora actual: " + horaActual);

        if (horaActual.isAfter(inicioHoraFeliz) && horaActual.isBefore(finHoraFeliz)) {
            System.out.println("Es la hora Feliz!!");
        } else {
            System.out.println("No es la hora Feliz");
        }
    }
}
