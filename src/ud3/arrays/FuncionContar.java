package ud3.arrays;

public class FuncionContar {
    static int contar(int t[], int clave) {
        int contadorClave = 0;

        for (int i = 0; i < t.length; i++) {
            if(t[i] == clave) {
                contadorClave++;
            }
        }

        return contadorClave;
    }
}
