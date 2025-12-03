package ud3.arrays;

import java.util.Scanner;

public class E503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres introducir? ");
        int numeroNumeros = sc.nextInt();

        int[] numeros = new int[numeroNumeros];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Numeros introducidos en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
