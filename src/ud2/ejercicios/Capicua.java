package ud2.ejercicios;

public class Capicua {
public static long invertirNumero(long n) {
    long nInvertido = 0;
    while (n % 10 != 0) {
        nInvertido = nInvertido * 10 + n % 10;
        n = n / 10;
    }
    return nInvertido;
}

    public static boolean esCapicua(long n) {
        long nInvertido = invertirNumero(n);
        return n == nInvertido;
    }

    public static void main(String[] args) {
        System.out.println(esCapicua(1441));
        System.out.println(esCapicua(123456));
        System.out.println(esCapicua(45544554));
        System.out.println(esCapicua(0));
        System.out.println(esCapicua(121));
    }
}
