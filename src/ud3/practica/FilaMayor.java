package ud3.practica;

public class FilaMayor {
    public static int filaMayorSuma(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int filaMayor = 0;
        for (int i = 0; i < t.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < t.length; j++) {
                sumaFila += t[i][j];
                if (sumaFila >= filaMayor) {
                    filaMayor = sumaFila;
                }
            }
        }

        return filaMayor;
    }

    public static void main(String[] args) {
        int[][] tabla1 = {  { 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 1, 0 } };
        System.out.println(filaMayorSuma(tabla1));
    }
}
