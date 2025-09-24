package UD1.ejercicios;

import java.util.Scanner;

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta la coordenada X del punto 1: ");
        int x1 = sc.nextInt();
        System.out.print("Inserta la coordenada Y del punto 1: ");
        int x2 = sc.nextInt();
        System.out.print("Inserta la coordenada X del punto 2: ");
        int y1 = sc.nextInt();
        System.out.print("Inserta la coordenada Y del punto 2: ");
        int y2 = sc.nextInt();
        sc.close();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre ambos puntos es de: " + distancia);
    }
}
