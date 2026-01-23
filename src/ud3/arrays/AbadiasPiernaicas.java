package ud3.arrays;

import java.util.Arrays;

public class AbadiasPiernaicas {
    static int[] getMontanasAbadias(int[] montanasCordilleras) {
        if (montanasCordilleras == null || montanasCordilleras.length == 0) {
            return null;
        }
        int[] abadias = new int[0];
        int contadorAbadias = 0;
        int maximo = 0;
        int posicionMaximo = 0;

        for (int i = 0; i < montanasCordilleras.length; i++) {
            if (montanasCordilleras[i] > maximo) {
                maximo = montanasCordilleras[i];
                posicionMaximo = i;
            }
        }

        for (int i = posicionMaximo; i < montanasCordilleras.length; i++) {
            if (i + 1 < montanasCordilleras.length) {
                if (montanasCordilleras[i] > montanasCordilleras[i + 1]) {
                    abadias = Arrays.copyOf(abadias, contadorAbadias + 1);
                    abadias[contadorAbadias] = i + 1;
                    contadorAbadias++;
                }
            }
        }
        abadias = Arrays.copyOf(abadias, abadias.length + 1);
        abadias[abadias.length - 1] = montanasCordilleras.length;

        return abadias;
    }

    public static void main(String[] args) {
        int[] cordillera = { 3000, 3500, 3200, 3400, 3200 };
        int[] cordillera2 = { 4000, 3500, 3500, 3200 };
        int[] cordillera3 = { 3500, 3400, 3200, 3000, 3100 };
        int[] cordillera4 = { 3500, 3400, 3700, 3000, 3100 };

        System.out.println(Arrays.toString(getMontanasAbadias(cordillera)));
        System.out.println(Arrays.toString(getMontanasAbadias(cordillera2)));
        System.out.println(Arrays.toString(getMontanasAbadias(cordillera3)));
        System.out.println(Arrays.toString(getMontanasAbadias(cordillera4)));
    }
}
