package ud2.ejercicios;

public class E402 {
    static void intervalo(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(n1++);
        }
    }
    public static void main(String[] args) {
        intervalo(1, 3);
    }
}
