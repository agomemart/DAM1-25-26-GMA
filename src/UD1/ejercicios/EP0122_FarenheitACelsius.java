package UD1.ejercicios;

import java.util.Scanner;

public class EP0122_FarenheitACelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta los grados Farenheit a convertir: ");
        double farenheit = sc.nextDouble();
        sc.close();

        double farenheitCelsius = (5 / 9) * (farenheit - 32);
        System.out.println("El resultado es " + farenheitCelsius + " grados celsius");
    }
}
