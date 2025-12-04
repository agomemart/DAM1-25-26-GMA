package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class E0508 {
    static int[] tablaRandom(int n) {
        Random rnd = new Random();
        int[] arrayAleatorio = new int[n];

        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = rnd.nextInt(1,101);
        }
        return arrayAleatorio;
    }

    static int[] getPares(int t[]) {
        int tamano = 0;
        int posicion = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                tamano++;
            }
        }
        int[] arrayPares= new int[tamano];

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                arrayPares[posicion] = t[i];
                posicion++;
            }
        }
        return arrayPares;
    }

    static int[] getImpares(int t[]) {
        int tamano = 0;
        int posicion = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                tamano++;
            }
        }
        int[] arrayPares= new int[tamano];

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                arrayPares[posicion] = t[i];
                posicion++;
            }
        }
        return arrayPares;
    }



    public static void main(String[] args) {
        int[] tabla = tablaRandom(10);

        int[] pares = getPares(tabla);
        int[] impares = getImpares(tabla);

        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
