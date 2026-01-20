package ud3.arrays.practicaex;

public class MatrizTraspuesta {
    public static int[][] matrizTraspuesta(int[][] t) {
        int[][] traspuesta = new int[t[0].length][t.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                traspuesta[j][i] = t[i][j];
            }
        }
        return traspuesta;
    }
    public static void main(String[] args) {
        int[][] t = {
            {1, 2, 3}, 
            {4, 5, 6}
        };
        int[][]traspuesta = matrizTraspuesta(t);

        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[0].length; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
