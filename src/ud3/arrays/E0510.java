package ud3.arrays;

import java.util.Arrays;
/**
 * @author Adrián Gómez
 */

public class E0510 {
    public static int[] eliminarMayores(int t[], int valor) {
        int[] array = t.clone();
        Arrays.sort(array);
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= valor) {
                cont++;
            }
        }

        int[] resultado = new int[cont];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = array[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] tabla = { 5, 6, 4, 2, 3, 7 };
        int[] pruebaEliminar = eliminarMayores(tabla, 5);
        System.out.println(Arrays.toString(pruebaEliminar));
    }
}
