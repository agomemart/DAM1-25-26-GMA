package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void desordenar(int t[]) {
        Random rnd = new Random();
        /*int[] arrayDesordenado = new int[t.length];
        int indiceAleatorio = 0;*/

        for (int i = 0; i < t.length; i++) {
            int indiceAleatorio = rnd.nextInt(t.length);

            int aux = t[i];
            t[i] = t[indiceAleatorio];
            t[indiceAleatorio] = aux;
            /*do {
                indiceAleatorio = rnd.nextInt(0, t.length);
                if (arrayDesordenado[indiceAleatorio] == 0) {
                    arrayDesordenado[indiceAleatorio] = t[i];
                }
            } while (arrayDesordenado[indiceAleatorio] == 0);*/
        }

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        desordenar(array);
        System.out.println(Arrays.toString(array));
    }
}
