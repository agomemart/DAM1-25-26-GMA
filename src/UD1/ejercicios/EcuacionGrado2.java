package UD1.ejercicios;

import java.util.Scanner;

public class EcuacionGrado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Inserta el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Inserta el valor de c: ");
        double c = sc.nextDouble();
        sc.close();

        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        Double.isNaN(sqrt);

        double resultado1 = (-b + sqrt) / 2 * a;
        double resultado2 = (-b - sqrt) / 2 * a;

        String sol1 = "Primera solución " + resultado1;
        String sol2 = "Segunda solución " + resultado2;

        String salida = Double.isNaN(sqrt) ? "No hay solución real" : "Soluciones: " + sol1 + ". " + sol2;

        System.out.println(salida);
    }
}
