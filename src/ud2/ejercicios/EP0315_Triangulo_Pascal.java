package ud2.ejercicios;

public class EP0315_Triangulo_Pascal {
    public static int factorial(int n) {
        return 1;
    }

    public static void dibujarTrianguloPascal(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                int e = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        dibujarTrianguloPascal(4);
    }
}
