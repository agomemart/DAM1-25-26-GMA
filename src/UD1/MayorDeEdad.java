package UD1;

import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        String nombre;
        int edad;
        final int MAYORIA_EDAD = 18;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Escribe tu edad: ");
        edad = sc.nextInt();
        sc.close();

        boolean mayorEdad = edad >= MAYORIA_EDAD;

        System.out.println("Te llamas " + nombre + "y tienes " + edad + " años");
        System.out.println("Eres mayor de edad? " + mayorEdad);
    }
}
