package ud3.strings;

public class E0606 {
    public static boolean esVocal(char c) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";

        boolean esVocal = false;

        for (int i = 0; i < vocales.length(); i++) {
            if (c == vocales.charAt(i)) {
                esVocal = true;
            }
        }

        return esVocal;
    }

    public static String sinVocales(String cad) {
        String sinVocales = "";
        
        for (int i = 0; i < cad.length(); i++) {
            char caracter = cad.charAt(i);
            if (!esVocal(caracter)) {
                sinVocales += caracter;
            }
        }
        
        return sinVocales;
    }

    

    public static void main(String[] args) {
        System.out.println(esVocal('ü'));
        System.out.println(esVocal('Á'));
        System.out.println(sinVocales("Álvaro Pérez"));
    }
}
