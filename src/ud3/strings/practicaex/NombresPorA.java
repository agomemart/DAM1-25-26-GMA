package ud3.strings.practicaex;

import java.util.Arrays;

public class NombresPorA {
    public static String[] empiezaPorA(String[] nombres) {
        if (nombres == null || nombres.length == 0) {
            return null;
        }
        
        String[] nombresA = new String[0];
        int contNombres = 0;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null && Character.toUpperCase(nombres[i].charAt(0)) == 'A') {
                nombresA = Arrays.copyOf(nombresA, nombresA.length + 1);
                nombresA[contNombres] = nombres[i].toUpperCase();
                contNombres++;
            }
        }

        return nombresA;
    }
}
