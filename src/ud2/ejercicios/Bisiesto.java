package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author Adrián Gómez
 */
public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta un año: ");
        int anho = sc.nextInt();
        sc.close();

        if (anho % 400 == 0 || anho % 4 == 0 && !(anho % 100 == 0)) {
            System.out.println("Es año bisiesto");
        } else {
            System.out.println("NO es año bisiesto");
        }
    }
}
