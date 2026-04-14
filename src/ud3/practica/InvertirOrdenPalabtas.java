package ud3.practica;

public class InvertirOrdenPalabtas {
    public static String invertirOrdenPalabras(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] palabras = s.split("\\s+");
        String res = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            if (i == 0) {
                res += palabras[i];
            } else {
                res += palabras[i] + " ";
            }
            
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(invertirOrdenPalabras("hola mundo"));
    }
}
