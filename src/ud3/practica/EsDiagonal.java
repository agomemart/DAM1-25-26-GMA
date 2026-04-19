package ud3.practica;

public class EsDiagonal {
    public static boolean esDiagonal(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i != j && t[i][j] != 0) {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] t = { { 1, 0, 0 }, { 0, 5, 0 }, { 0, 0, 9 } };
        System.out.println(esDiagonal(t));
    }
}
