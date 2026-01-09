package ud3.strings;

import java.util.Scanner;

public class E0604 {
    static int contarEspacios(String cad) {
        if (cad.length() == 0) {
            return 0;
        }

        int contadorEspacios = 0;

        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == ' ') {
                contadorEspacios++;
            }
        }

        return contadorEspacios;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta una frase: ");
        String frase = sc.nextLine();
        sc.close();

        System.out.println("La frase tiene " + contarEspacios(frase) + " espacios.");

    }
}
