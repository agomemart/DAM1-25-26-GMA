package ud2.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class E0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int numSecreto = rnd.nextInt(100) + 1;
        int numUsuario;

        do {
            System.out.print("Introduce un número: ");
            numUsuario = sc.nextInt();
            if (numUsuario == -1) {
                System.out.println("Hasta pronto!! El número secreto era " + numSecreto);
            } else if (numUsuario > numSecreto) {
                System.out.println("Pista: Prueba con un número menor al introducido");
            } else if (numUsuario < numSecreto) {
                System.out.println("Pista: Prueba con un número mayor al introducido");
            } else if (numSecreto == numUsuario) {
                System.out.println("Has acertado el número secreto. Enhorabuena!!");
            }
        } while (numUsuario != -1 && numUsuario != numSecreto);

        sc.close();
    }
}