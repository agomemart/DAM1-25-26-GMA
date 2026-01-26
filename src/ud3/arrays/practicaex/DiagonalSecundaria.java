package ud3.arrays.practicaex;

public class DiagonalSecundaria {
    public static void main(String[] args) {
        int[][] t = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (i + j == t.length - 1) {
                    System.out.print(t[i][j] + " ");
                }
            }
        }

        //Otra forma más optimizada
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i][t.length - 1 - i] + " ");
        }
    }
}
