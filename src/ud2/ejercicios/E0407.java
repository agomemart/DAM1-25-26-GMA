package ud2.ejercicios;

public class E0407 {
    public static int numDivisoresPrimos(int num) {
        int numDivisores = 0;
       for (int i = 2; i < num / 2; i++) {
            if (num % i == 0 && num % num == 0) {
                numDivisores++;
            }
       }
       return numDivisores;
    }
    public static void main(String[] args) {
        System.out.println(numDivisoresPrimos(10));
    }
}
