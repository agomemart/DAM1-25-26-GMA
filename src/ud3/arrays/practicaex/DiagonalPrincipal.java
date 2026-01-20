package ud3.arrays.practicaex;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] t = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i][i] + " ");
        }
    }
}
