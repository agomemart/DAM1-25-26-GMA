package ud2.ejercicios;

import java.util.Scanner;

public class E0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = sc.nextInt();
        System.out.print("Numero 2: ");
        int n2 = sc.nextInt();
        sc.close();

        if (n1 > n2) {
            System.out.println(n1);
        } else if (n2 > n1) {
            System.out.println(n2);
        } else {
            System.out.println("Son iguales");
        }
    }
}
