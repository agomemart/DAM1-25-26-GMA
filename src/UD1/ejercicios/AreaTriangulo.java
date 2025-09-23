package UD1.ejercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta la base del triángulo(cm): ");
        double b = sc.nextDouble();
        System.out.print("Inserta la altura del triángulo(cm): ");
        double h = sc.nextDouble();
        sc.close();

        double areaTriangulo = b * h / 2;
        System.out.println("El área del triángulo es de " + areaTriangulo + "cm2");
    }
}
