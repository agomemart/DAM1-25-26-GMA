package ud3.agomemart;

import java.time.LocalTime;
import java.util.Random;

/**
 * @author Adrián Gómez Martinez
 */

public class HoraFeliz {
    public static void main(String[] args) {
        Random rnd = new Random();

        int horaAleatoria = rnd.nextInt(24);
        int minutoAleatorio = rnd.nextInt(60);

        LocalTime inicio = LocalTime.of(horaAleatoria, minutoAleatorio);
        LocalTime fin = inicio.plusHours(1);

        System.out.println("Hora feliz: " + inicio + " Fin: " + fin);
        
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        if (horaActual.isAfter(inicio) && horaActual.isBefore(fin)) {
            System.out.println("Hora feliz");
        } else {
            System.out.println("No es hora feliz");
        }
    }
}
