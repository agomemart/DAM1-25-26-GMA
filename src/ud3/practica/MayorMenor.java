package ud3.practica;

public class MayorMenor {
    public static int mayor(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }
        int mayor = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] >= mayor) {
                    mayor = t[i][j];
                }
            }
        }
        return mayor;
    }

    public static int menor(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] <= menor) {
                    menor = t[i][j];
                }
            }
        }
        return menor;
    }


    public static void main(String[] args) {
        int[][] t = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Mayor: " + mayor(t));
        System.out.println("Menor: " + menor(t));
    }
}
