package ud2.ejercicios;

import java.util.Scanner;

public class E0309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tabla de multiplicar del número(1-10): ");
        int n = sc.nextInt();
        sc.close();

        if (n >= 1 && n <= 10) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d x %d = %d %n", n, i, n * i);
            }
        } else {
            System.out.println("El número debe estar entre 1 y 10");
        }
    }
}
