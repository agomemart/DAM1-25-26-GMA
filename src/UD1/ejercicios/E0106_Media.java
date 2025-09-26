package ud1.ejercicios;

import java.util.Scanner;

public class E0106_Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta la nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Inserta la nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Inserta la nota 3: ");
        double nota3 = sc.nextDouble();
        sc.close();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La nota media es: " + media);
    }
}
