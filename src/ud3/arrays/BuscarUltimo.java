package ud3.arrays;
/**
 * @author Adrián Gómez
 */
public class BuscarUltimo {
    static int buscarUltimo(int t[], int clave) {
        int posicionClave = -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                posicionClave = i;
            }
        }
        return posicionClave;
    }
}
