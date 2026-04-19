package ud3.practica;

public class PreguntaMasDificil {
    public static double preguntaMasDificil(double[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        double min = Double.MAX_VALUE;
        for (int i = 0; i < t.length; i++) {
            double sumaNotas = 0;
            for (int j = 0; j < t.length; j++) {
                sumaNotas += t[i][j];
            }
            double media = sumaNotas / t[i].length;

            if (media <= min) {
                min = media;
            }
        }

        return min;
    }
}
