package ud3.arrays.practicaex;

public class MatrizIdentidad {
    public static int[][] generarMatrizIdentidad(int n) {
        int[][] t = new int[n][n];
        for (int i = 0; i < t.length; i++) {
            t[i][i] = 1;
        }

        return t;
    }

    public static void main(String[] args) {
        int[][] matrizIdentidad = generarMatrizIdentidad(8);
        for (int i = 0; i < matrizIdentidad.length; i++) {
            for (int j = 0; j < matrizIdentidad.length; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }
    }
}
