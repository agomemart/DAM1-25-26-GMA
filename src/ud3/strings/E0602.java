package ud3.strings;

/**
 * @author Adrián Gómez
 */
import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce otra frase: ");
        String frase2 = sc.nextLine();
        sc.close();

        if (frase.length() > frase2.length()) {
            System.out.println("La segunda frase es la más corta.");
        } else if (frase.length() < frase2.length()) {
            System.out.println("La primera frase es la más corta.");
        } else {
            System.out.println("Las dos frases son de la misma longitud.");
        }
    }
}
