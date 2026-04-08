package ud3.practica;

import java.util.Arrays;

public class ArrayInverso {
    public static int[] invertirArray(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        int[] invertido = new int[array.length];
        
        for (int i = 0; i < invertido.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }

        return invertido;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 4, 7, 9, 4};
        System.out.println(Arrays.toString(invertirArray(array)));
    }
}
