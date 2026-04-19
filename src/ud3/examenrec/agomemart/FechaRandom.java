package ud3.examenrec.agomemart;

import java.time.LocalDate;
import java.util.Random;

/**
 * @author Adrián Gómez Martínez
 */
public class FechaRandom {
    public static LocalDate fechaRandom() {
        Random rnd = new Random();
        boolean esBisiesto = LocalDate.now().plusYears(1).isLeapYear();
        int anho = LocalDate.now().plusYears(1).getYear();
        int mesAleatorio = rnd.nextInt(1,13);
        int diaAleatorio = 0;

        switch (mesAleatorio) {
            case 1, 3, 5, 7, 8, 10, 12:
                diaAleatorio = rnd.nextInt(1,32);
                break;
            case 2:
                if (esBisiesto) {
                    diaAleatorio = rnd.nextInt(1,30);
                } else {
                    diaAleatorio = rnd.nextInt(1,29);
                }

                break;
            case 4, 6, 9, 11:
                diaAleatorio = rnd.nextInt(1,31);
                break;
        }

        return LocalDate.of(anho, mesAleatorio, diaAleatorio);
    }

    public static void main(String[] args) {
        System.out.println(fechaRandom());
    }

}
