package ud3.strings;

public class E0605 {
    public static String invertirCadena(String cad) {
        String cadInvertida = "";

        for (int i = cad.length() - 1; i >= 0; i--) {
            cadInvertida += cad.charAt(i);
        }

        return cadInvertida;
    }
    public static void main(String[] args) {
        System.out.println(invertirCadena("Mi perro Perico"));
        
    }
}
