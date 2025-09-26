package ud1.ejercicios;

/**
 * @author Adrián Gómez
 */

import java.util.Scanner;

public class E0109_Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserta un número entero: ");
        int numero = sc.nextInt();
        sc.close();

        boolean esPar = numero % 2 == 0;

        System.out.println("El número es par? " + esPar);
    }
}
