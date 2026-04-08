package ud3.practica;

public class SumaElementos {
    public static int sumaElementos(int[][] t) {
        if (t == null || t.length == 0) {
            return 0;
        }
        
        int suma = 0;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                suma += t[i][j];
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        int[][] t = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(sumaElementos(t));
    }
}
