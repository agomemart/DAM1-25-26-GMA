package ud3.practica;

import java.util.Random;

public class GenerarMatrizTriangular {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] triangularInferior = new int[6][6];
        int[][] triangularSuperior = new int[6][6];

        for (int i = 0; i < triangularInferior.length; i++) {
            triangularInferior[i][i] = rnd.nextInt(1,10);
            for (int j = 0; j < i; j++) {
                triangularInferior[i][j] = rnd.nextInt(1,10);
            }
        }

        System.out.println("Triangular inferior: ");
        for (int i = 0; i < triangularInferior.length; i++) {
            for (int j = 0; j < triangularInferior[i].length; j++) {
                System.out.print(triangularInferior[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < triangularSuperior.length; i++) {
            triangularSuperior[i][i] = rnd.nextInt(1,10);
            for (int j = i + 1; j < triangularSuperior[i].length; j++) {
                triangularSuperior[i][j] = rnd.nextInt(1,10);
            }
        }

        System.out.println("Triangular superior:");
        for (int i = 0; i < triangularSuperior.length; i++) {
            for (int j = 0; j < triangularSuperior[i].length; j++) {
                System.out.print(triangularSuperior[i][j] + " ");
            }
            System.out.println();
        }
    }
}
