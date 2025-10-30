package ud2.ejercicios;

public class E0412_Fibbonacci {
    static int fibonacci(int n) {
        int fibonacci = 0;
        if (n <= 1) {
            fibonacci = 1;
        } else {
            fibonacci = fibonacci(n - 1) + fibonacci(n - 2);
        } 
        return fibonacci;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
}
