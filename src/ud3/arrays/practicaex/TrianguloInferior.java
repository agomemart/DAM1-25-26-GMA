package ud3.arrays.practicaex;

public class TrianguloInferior {
    static void mostrarTrianguloInferior(int t[][]) {
        if (t == null || t.length == 0) {
            System.out.println("Matriz nula o vacía");
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mostrarTrianguloSuperior(int t[][]) {
        if (t == null || t.length == 0) {
            System.out.println("Matriz nula o vacía");
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = i; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        mostrarTrianguloInferior(matriz);
        mostrarTrianguloSuperior(matriz);
    }
}
