package ud2.ejercicios;

public class Digitos {
    public static int numDigitos(long num) {
        int digitos = 0;
        for (int i = 1; i <= num; i *= 10) {
            digitos++;
        }
        return digitos;
    }

    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Inserta un número: ");
         * int num = sc.nextInt();
         * sc.close();
         * 
         * for (int i = 1; i <= num; i *= 10) {
         * System.out.println(num / i % 10);
         * }
         */
        System.out.println("Cifras: " + numDigitos(568971265));

    }
}
