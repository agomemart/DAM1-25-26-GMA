package ud3.arrays.practicaex;

import java.util.Random;
import java.util.Scanner;

public class JuegoSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[][] matriz = new int[5][5];
        System.out.println("Adivina donde está el número oculto: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int posAleatoriaI = rnd.nextInt(matriz.length);
        int posAleatoriaJ = rnd.nextInt(matriz[0].length);

        matriz[posAleatoriaI][posAleatoriaJ] = 1;
        System.out.println("Posicion 1: " + posAleatoriaI + " " + posAleatoriaJ);

        int indiceUsuarioI = 0;
        int indiceUsuarioj = 0;

        do {
            System.out.println("Inserta el indice i: ");
            indiceUsuarioI = sc.nextInt();
            System.out.println("Inserta el indice j: ");
            indiceUsuarioj = sc.nextInt();
        } while(matriz[posAleatoriaI][posAleatoriaJ] != matriz[indiceUsuarioI][indiceUsuarioj]);
        sc.close();

        if (matriz[posAleatoriaI][posAleatoriaJ] == matriz[indiceUsuarioI][indiceUsuarioj]) {
            System.out.println("Enhorabuena! Has acertado!!");
        }
    }
}