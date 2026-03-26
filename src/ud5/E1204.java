package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class E1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        Collection<Integer> numeros = new ArrayList<>();

        do {
            System.out.print("Inserta un número: ");
            num = sc.nextInt();
            if (num > -1) {
                numeros.add(num);
            }
        } while (num > -1);

        sc.close();

        System.out.println("Lista de números:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("Numeros pares:");
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        Iterator<Integer> itNumeros = numeros.iterator();
        while (itNumeros.hasNext()) {
            if (itNumeros.next() % 3 == 0) {
                itNumeros.remove();
            }
        }

        System.out.println("Colección resultante:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
