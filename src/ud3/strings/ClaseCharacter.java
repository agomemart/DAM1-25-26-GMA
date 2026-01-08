package ud3.strings;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta un caracter: ");
        char c = sc.nextLine().charAt(0);
        sc.close();

        System.out.println("Es un dígito? " + Character.isDigit(c));
        System.out.println("Es una letra? " + Character.isLetter(c));
        System.out.println("Es digito o letra? " + Character.isLetterOrDigit(c));
        
        if (Character.isUpperCase(c)) {
            System.out.println("Es mayúscula. Su minúscula es " + Character.toLowerCase(c));
        } else {
            System.out.println("Es minúscula. Su mayúscula es " + Character.toUpperCase(c));
        }
        

    }
}
