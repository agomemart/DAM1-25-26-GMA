package ud3.practica;

public class MatrizSimetrica {
    public static boolean matrizSimetrica(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] != t[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] tabla1 = {  { 1, 2, 3 },
                            { 2, 5, 6 },
                            { 3, 6, 9 } };
        System.out.println(matrizSimetrica(tabla1));
    }
}
