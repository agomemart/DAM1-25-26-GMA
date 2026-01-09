package ud3.strings;

import java.util.Scanner;

public class E0603 {
    public static void main(String[] args) {
        final int MAX_INTENTOS = 5;
        Scanner sc = new Scanner(System.in);

        String passwordUsuario;
        int intentos = 0;

        System.out.print("Inserta una contraseña: ");
        String password = sc.nextLine();
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }

        do {
            System.out.print("Adivina la contraseña: ");
            passwordUsuario = sc.nextLine();

            if (passwordUsuario.equalsIgnoreCase(password)) {
                System.out.println("Has acertado. Enhorabuena!!");
            } else {
                System.out.println("Contraseña incorrecta.");
                intentos++;
            }
        } while (intentos < MAX_INTENTOS && !passwordUsuario.equalsIgnoreCase(password));
        sc.close();

        System.out.println("Fin de programa.");
    }
}
