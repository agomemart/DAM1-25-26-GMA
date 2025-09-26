package UD1.ejercicios;

import java.util.Scanner;

public class EP0121_CelsiusAFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta los grados Celsius a convertir: ");
        double celsius = sc.nextDouble();
        sc.close();

        double celsiusFarenheit = celsius * (9 / 5) + 32;

        System.out.println("El resultado es " + celsiusFarenheit + " grados Farenheit");
    }
}
