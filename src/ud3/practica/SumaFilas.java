package ud3.practica;

public class SumaFilas {
    public static int[] sumaFilas(int t[][]) {
        if (t == null || t.length == 0) {
            return null;
        }

        int[] sumaFilas = new int[t.length];
        
        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[i][j];
            }
            sumaFilas[i] = suma;
        }

        return sumaFilas;
    }
}
