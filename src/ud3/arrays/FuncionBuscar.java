package ud3.arrays;

public class FuncionBuscar {
    static int buscar(int t[], int clave) {
        int resultado = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                resultado = i;
                break;
            } else {
                resultado = -1;
            }
        }
        return resultado;
    }
}