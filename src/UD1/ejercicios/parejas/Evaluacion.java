package ud1.ejercicios.parejas;

import java.util.Scanner;

/**
 * @author Adrián Gómez
 */

public class Evaluacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.El programa funciona?");
        System.out.println("Si y funciona -> 4 puntos");
        System.out.println("Si pero no hace lo que debe -> 2 puntos");
        System.out.println("No -> 0 puntos");
        System.out.print("Inserta la nota del apartado 1: ");
        int nota1 = sc.nextInt();

        System.out.println("2.El programa funciona y es eficiente");
        System.out.println("Si -> 1 punto");
        System.out.println("Regular -> 0,5 puntos");
        System.out.println("No -> 0 puntos");
        System.out.print("Inserta la nota del apartado 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("3.Usa estructuras y tipos de datos adecuados al problema");
        System.out.println("Siempre -> 1 punto");
        System.out.println("A veces -> 0,5 puntos");
        System.out.println("Nunca -> 0 puntos");
        System.out.print("Inserta la nota del apartado 3: ");
        double nota3 = sc.nextDouble();

        System.out.println("4.Usa identificadores adecuados");
        System.out.println("Siempre -> 1,5 puntos");
        System.out.println("A veces -> 0,75 puntos");
        System.out.println("Nunca -> 0 puntos");
        System.out.print("Inserta la nota del apartado 4: ");
        double nota4 = sc.nextDouble();

        System.out.println("5.El programa es legible");
        System.out.println("Mucho -> 1,5 puntos");
        System.out.println("Regular -> 0,75 puntos");
        System.out.println("Poco -> 0 puntos");
        System.out.print("Inserta la nota del apartado 5: ");
        double nota5 = sc.nextDouble();

        System.out.println("6.Presenta la información completa al usuario");
        System.out.println("Si -> 1 punto");
        System.out.println("Regular -> 0,5 puntos");
        System.out.println("No -> 0 puntos");
        System.out.print("Inserta la nota del apartado 6: ");
        double nota6 = sc.nextDouble();
        sc.close();

        double notaFinal = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;

        System.out.printf("La nota final es: %.2f", notaFinal);
    }
}
