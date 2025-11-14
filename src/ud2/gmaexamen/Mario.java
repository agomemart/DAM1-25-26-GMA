package ud2.gmaexamen;

import java.util.Scanner;

/**
 * @author Adrián Gómez Martínez
 */

public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIntroducido = 0;
        int numAnterior = 0;
        int saltosArriba = 0;
        int saltosAbajo = 0;

        do {
            System.out.print("Altura muro: ");
            numIntroducido = sc.nextInt();

            if (numIntroducido != -1) {
                if (numAnterior == 0) {
                    numAnterior = numIntroducido;
                } else if (numAnterior > numIntroducido) {
                    saltosAbajo++;
                } else if (numAnterior < numIntroducido) {
                    saltosArriba++;
                }
            }

            numAnterior = numIntroducido;
        } while (numIntroducido != -1);
        sc.close();

        System.out.print(saltosArriba + " " + saltosAbajo);
    }
}
