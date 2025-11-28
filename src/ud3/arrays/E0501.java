package ud3.arrays;

import java.util.Random;

public class E0501 {
    static int[] arrayAleatorio(int n) {
        Random rnd = new Random();
        int[] arrayAleatorio = new int[n];

        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = rnd.nextInt(100);
        }
        return arrayAleatorio;
    }
    
    static int sumarNumerosArray(int t[]) {
        int sumaNumeros = 0;
        for (int i = 0; i < t.length; i++) {
            sumaNumeros += t[i];
        }
        return sumaNumeros;
    }

    public static void main(String[] args) {
        int[] tabla = arrayAleatorio(10);
        System.out.println("Suma números: " + sumarNumerosArray(tabla));
    }
}
