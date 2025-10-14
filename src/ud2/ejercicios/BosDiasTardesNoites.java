package ud2.ejercicios;

import java.time.LocalTime;

public class BosDiasTardesNoites {
    public static void main(String[] args) {
        int horaActual = LocalTime.now().getHour();

        if (horaActual >= 7 && horaActual <= 13) {
            System.out.println("Bos días");
        } else if (horaActual >= 14 && horaActual <= 20) {
            System.out.println("Boas tardes");
        } else {
            System.out.println("Boas noites");
        }
    }
}
