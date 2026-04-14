package ud3.practica;

public class BuscarNum {
    public static boolean buscarNumero(int t[][], int num) {
        if (t == null || t.length == 0) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (num == t[i][j]) {
                    return true;
                }
            }
        }
        return true;
    }
}
