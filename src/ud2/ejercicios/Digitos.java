package ud2.ejercicios;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta un número: ");
        int num = sc.nextInt();
        sc.close();

        int digito = 0;
        int denominador = 0;

        for (int i = 1; i <= num; i *= 10) {
            System.out.println(num / i % 10);
        }

    }
}
