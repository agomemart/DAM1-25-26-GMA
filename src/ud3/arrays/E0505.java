package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class E0505 {
    static int[] rellenarPares(int longitud, int fin) {
        Random rnd = new Random();
        int[] tablaPares = new int[longitud];
        int numero = 0;
        for (int i = 0; i < tablaPares.length; i++) {
            do {
                numero = rnd.nextInt(2, fin + 1);
            } while (numero % 2 != 0);
            
            tablaPares[i] = numero;
        }
        Arrays.sort(tablaPares);
        return tablaPares;
    }

    public static void main(String[] args) {
        int[] tabla = rellenarPares(5, 10);

        System.out.println(Arrays.toString(tabla));
    }
}
