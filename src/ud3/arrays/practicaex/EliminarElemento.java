package ud3.arrays.practicaex;

public class EliminarElemento {
    static int[] eliminarElemento(int[] array, int numero) {
        int pos = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                pos = 1;
                break;
            }
        }

        if (pos == -1) {
            return array;
        }

        int[] nuevo = new int[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != pos) {
                nuevo[j++] = array[i];
            }
        }

        return nuevo;
    }
}
