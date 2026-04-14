package ud3.practica;

public class InvertirCadena {
    public static String invertirCadena(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return null;
        }

        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        return invertida;
    }

    public static void main(String[] args) {
        System.out.println(invertirCadena("casa"));
    }
}
