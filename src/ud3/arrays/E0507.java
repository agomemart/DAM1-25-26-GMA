package ud3.arrays;

import java.util.Arrays;

public class E0507 {
    static int[] sinRepetidos(int t[]) {
        int[] temporal = new int[t.length];
        int tamano = 0;

        for (int numero : t) {
            boolean existe = false;
            for (int i = 0; i < tamano; i++) {
                if (temporal[i] == numero) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                temporal[tamano++] = numero;
            }
        }

        int[] resultado = new int[tamano];
        resultado = Arrays.copyOf(temporal, tamano);
        return resultado;
    }

    public static void main(String[] args) {
        int t[] = { 1, 2, 1, 3, 5, 6, 6 };
        int sinRepetidos[] = sinRepetidos(t);

        System.out.println(Arrays.toString(sinRepetidos));
    }
}
