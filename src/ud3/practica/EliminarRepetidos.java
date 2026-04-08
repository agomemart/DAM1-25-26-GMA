package ud3.practica;

import java.util.Arrays;

public class EliminarRepetidos {
    public static int[] sinRepetidos(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        int[] sinRepetidos = new int[1];
        sinRepetidos[0] = array[0];
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                sinRepetidos = Arrays.copyOf(sinRepetidos, sinRepetidos.length + 1);
                sinRepetidos[sinRepetidos.length - 1] = array[i];
            }
        }

        return sinRepetidos;
    }

    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 3, 2, 4, 3 };

        System.out.println(Arrays.toString(sinRepetidos(t)));
    }
}
