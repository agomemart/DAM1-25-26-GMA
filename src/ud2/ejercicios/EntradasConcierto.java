package ud2.ejercicios;

import java.util.Scanner;

public class EntradasConcierto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Aforo máximo: ");
        int aforoMaximo = sc.nextInt();
        System.out.print("Precio por entrada: ");
        double precioEntrada = sc.nextDouble();
        System.out.print("Número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();
        sc.close();


    }
}
