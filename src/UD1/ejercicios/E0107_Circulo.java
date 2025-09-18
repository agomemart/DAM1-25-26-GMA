package UD1.ejercicios;

import java.util.Scanner;

public class E0107_Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserta el radio del circulo: ");
        double radio = sc.nextDouble();
        sc.close();

        double  area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del circulo es de: " + area);
        System.out.println("El perímetro del circulo es de: " + perimetro);
    }
}
