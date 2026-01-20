package ud3.arrays.practicaex;

import java.util.Arrays;

public class SumaFilasColumnas {
    public static void main(String[] args) {
        int[][] t = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int[] sumaFilas = new int[t.length];
        int[] sumaColumnas = new int[t[0].length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                sumaFilas[i] += t[i][j];
                sumaColumnas[j] += t[i][j]; 
            }
        }

        System.out.println("Suma filas: "+ Arrays.toString(sumaFilas));
        System.out.println("Suma columnas: "+ Arrays.toString(sumaColumnas));
    }
}
