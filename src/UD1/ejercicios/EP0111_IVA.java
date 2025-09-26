package UD1.ejercicios;

import java.util.Scanner;

public class EP0111_IVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta la base imponible: ");
        double baseImponible = sc.nextDouble();
        System.out.print("Inserta el IVA a aplicar: ");
        int iva = sc.nextInt();
        sc.close();
        
        double cantidadIva = baseImponible * iva / 100;
        double precioFinal = baseImponible + cantidadIva;

        System.out.println("El iva del producto es de " + cantidadIva + " euros.");
        System.out.println("El precio fnal del producto es de " + precioFinal+ " euros.");
    }
}
