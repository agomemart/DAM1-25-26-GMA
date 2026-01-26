package ud3.arrays.practicaex;

import java.util.Arrays;

public class InvertirArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayInvertido = new int[array.length];
        int cont = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            arrayInvertido[cont] = array[i];
            cont++;
        }

        System.out.println(Arrays.toString(arrayInvertido));
    }
}
