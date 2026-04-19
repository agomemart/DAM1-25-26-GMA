package ud3.practica;

public class SumaBorde {
    public static int sumaBorde(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int sumaBordes = 0;
        for (int j = 0; j < t[0].length; j++) {
            sumaBordes += t[0][j];
        }

        for (int j = 0; j < t[0].length; j++) {
            sumaBordes += t[t.length - 1][j];
        }
        
        for (int i = 0; i < t.length - 1; i++) {
            sumaBordes += t[i][0];
        }
        for (int i = 0; i < t.length - 1; i++) {
            sumaBordes += t[i][t[0].length - 1];
        }

        return sumaBordes;
    }

    public static void main(String[] args) {
        int[][] t = {   {1, 2, 3}, 
                        {1, 2, 3}};
        System.out.println(sumaBorde(t));
    }
}
