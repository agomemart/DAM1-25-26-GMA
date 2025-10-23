package ud2.ejercicios;

public class E406_Primo {
    public static boolean esPrimo(int num){
        boolean esPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0 && num % num == 0) {
                esPrimo = false;
            }
       }
       return esPrimo;
    }
    public static void main(String[] args) {
        System.out.println(esPrimo(7));
    }
}
