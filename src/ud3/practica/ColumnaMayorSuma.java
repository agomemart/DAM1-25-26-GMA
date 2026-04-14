package ud3.practica;

public class ColumnaMayorSuma {
    public static int columnaMayorSuma(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int maxSumaCol = Integer.MIN_VALUE;
        int indiceCol = 0;
        for (int i = 0; i < t[0].length; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < t.length; j++) {
                sumaColumna += t[j][i];
            }

            if (sumaColumna >= maxSumaCol) {
                maxSumaCol = sumaColumna;
                indiceCol = i;
            }

        }

        return indiceCol;
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 6, 7}, {5, 6, 7}};
        System.out.println(columnaMayorSuma(arr));
    }
}
