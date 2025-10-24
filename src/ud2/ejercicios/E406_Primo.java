package ud2.ejercicios;

public class E406_Primo {
    public static boolean esPrimo(int num){
        if (num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esPrimo(7));
    }
}
