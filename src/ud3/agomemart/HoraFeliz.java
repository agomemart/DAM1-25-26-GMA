package ud3.agomemart;

import java.time.LocalTime;
import java.util.Random;

/**
 * @author Adrián Gómez Martinez
 */

public class HoraFeliz {
    public static void main(String[] args) {
        Random rnd = new Random();

        int horaAleatoria = rnd.nextInt(23);
        int minutoAleatorio = rnd.nextInt(59);

        int horaAleatoriaAMinutos = horaAleatoria * 60 + minutoAleatorio;
        int horaFelizTermina = horaAleatoriaAMinutos + 60;
        int horasHoraFeliz = horaFelizTermina / 60;
        int minutosHoraFeliz = horaFelizTermina % 60;

        String horaAleatoriaString = String.valueOf(horaAleatoria);
        String minutoAleatorioString = String.valueOf(minutoAleatorio);

        if (horaAleatoriaString.length() < 2) {
            horaAleatoriaString = 0 + horaAleatoriaString;
        }
        if (minutoAleatorioString.length() < 2) {
            minutoAleatorioString = 0 + minutoAleatorioString;
        }

        String horaAleatoriaGenerada = horaAleatoria + ":" + minutoAleatorio;

        System.out.println("Hora feliz: " + horaAleatoriaGenerada);

        String horaActual = String.valueOf(LocalTime.now());
        int horasActuales = Integer.valueOf(horaActual.substring(0, 2));
        int minutosActuales = Integer.valueOf(horaActual.substring(3, 5));

        if (horasActuales == horaAleatoria || horasActuales == horasHoraFeliz) {
            if (minutosActuales > minutosHoraFeliz && minutosActuales < minutosHoraFeliz) {
                System.out.println("ESTÄS EN LA HORA FELIZ");
            }
        }
    }
}
