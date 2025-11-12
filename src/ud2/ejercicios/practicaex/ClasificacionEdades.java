package ud2.ejercicios.practicaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasificacionEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int mesNacimiento = 0;

        try {
            System.out.print("Introduce tu edad: ");
            edad = sc.nextInt();
            System.out.print("Introduce el mes de nacimiento (1-12): ");
            mesNacimiento = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Datos no válidos. " + e.getMessage());
        }
        sc.close();

        if (edad >= 0 && edad <= 3) {
            System.out.println("Eres un bebé. Tiempo de dormir y jugar.");
        } else if (edad >= 4 && edad <= 12) {
            System.out.println("Eres un niño/a. Puedes ir al colegio y jugar con amigos.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente. Estudia, haz deporte y diviértete.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres un adulto. Trabaja, cuida tu salud y disfruta tu tiempo libre.");
        } else {
            System.out.println("Eres una persona mayor. Disfruta de tus hobbies y cuida tu bienestar.");
        }

        if (mesNacimiento >= 1 && mesNacimiento <= 6) {
            System.out.println("Naciste en la primera mitad del año.");
        } else if (mesNacimiento >= 7 && mesNacimiento <= 12){
            System.out.println("Naciste en la segunda mitad del año.");
        } else {
            System.out.println("Mes no válido.");
        }
    }
}
