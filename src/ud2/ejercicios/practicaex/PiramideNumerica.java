package ud2.ejercicios.practicaex;

import java.util.Scanner;

public class PiramideNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n =  sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
