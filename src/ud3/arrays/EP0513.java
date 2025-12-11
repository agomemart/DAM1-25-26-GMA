package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class EP0513 {
    public static int[] copiaDesordenada(int[] tOrdenada) {
        int[] t = tOrdenada.clone();
        Random rnd = new Random();
        for (int i = 0; i < tOrdenada.length; i++) {
            int indiceAleatorio = rnd.nextInt(t.length);

            int aux = t[i];
            t[i] = t[indiceAleatorio];
            t[indiceAleatorio] = aux;
        }
        return t;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int[] arrayDesordenado = copiaDesordenada(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayDesordenado));
    }
}
