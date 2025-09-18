package UD1.ejercicios;

import java.util.Scanner;

public class E0109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserta un número entero: ");
        int numero = sc.nextInt();
        sc.close();

        boolean esPar = numero % 2 == 0;

        System.out.println("El número es par? " + esPar);
    }
}
