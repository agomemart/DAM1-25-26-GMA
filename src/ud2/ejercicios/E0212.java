package ud2.ejercicios;

import java.util.Scanner;

public class E0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el día: ");
        int dia = sc.nextInt();
        System.out.print("Inserta el mes: ");
        int mes = sc.nextInt();
        System.out.print("Inserta el año: ");
        int anho = sc.nextInt();
        sc.close();

        if (anho >= 1 && anho <= 2025) {
            switch (mes) {
            case 1, 3, 5, 7, 10, 12:
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 2:
                if (dia >= 1 && dia <= 28) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 4, 6, 8, 9, 11:
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            default:
                System.out.println("Fecha incorrecta");
                break;
            }
        } else {
            System.out.println("Fecha incorrecta");
        }

        
    }
}
