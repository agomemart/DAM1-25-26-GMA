package ud1;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int num = sc.nextInt();
        sc.close();

        double raiz = Math.sqrt(num);

        System.out.println("La raíz cuadrada de " + num + " es: " + raiz);
    }
}
