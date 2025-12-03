package ud3.arrays;
/**
* @author Adrián Gómez
 */
public class BuscarDesde {
    static int buscarDesde(int[] t, int clave, int posicion) {
        for (int i = posicion; i < t.length; i++) {
            if (t[i] == clave) {
                return i;
            }
        }
        return -1;
    }
}
