package ud2.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try{
            System.out.print("Inserta un número: ");
            num1 = sc.nextInt();
            System.out.print("Inserta otro número: ");
            num2 = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Error: Introduce un dato de tipo int");
        }
        sc.close();
        
        try{
            System.out.println((double)num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Error: división por 0");
        }
        
        
    }
}
