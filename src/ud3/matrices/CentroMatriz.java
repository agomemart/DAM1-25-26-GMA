package ud3.matrices;

public class CentroMatriz {
    public static int centroMatriz(int[][] t) {
        if (t == null || t[0].length == 0 && t.length == 0) {
            return 0;
        } else if (t.length % 2 == 0 && t[0].length % 2 != 0) {

            return 1;
        } else if (t.length % 2 != 0 && t[0].length % 2 == 0) {
            return 2;
        } else if (t.length % 2 == 0 && t[0].length % 2 == 0) {
            int posFilaCentral = t.length / 2;
            int posSiguienteFila = posFilaCentral + 1;
            int posColCentral = t[0].length / 2;
            int posSiguienteColumna = posColCentral + 1;
            int sumaElementos = 0;

            for (int i = posFilaCentral; i < posSiguienteFila; i++) {
                for (int j = posColCentral; j < posSiguienteColumna; j++) {
                    sumaElementos += t[i][j];
                }
            }

            int media = sumaElementos / 4;
            return media;
            
        } else {
            int posFilaCentral = t.length / 2;
            int posColCentral = t[0].length / 2;
            return t[posFilaCentral][posColCentral];
        }

    }
}
