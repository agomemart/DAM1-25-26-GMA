package ud3.practica;

public class DiagonalesIguales {
    public static boolean diagonalesIguales(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            if (t[i][i] != t[i][t.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] tabla1 = {  { 1, 2, 1 },
                            { 1, 2, 1 },
                            { 1, 2, 1 } };

        System.out.println(diagonalesIguales(tabla1));
    }
}
