package ud3.practica;

public class ContarPalabras {
    public static int contarPalabras(String frase) {
        if (frase == null || frase.isEmpty()) {
            return -1;
        }

        String[] palabras = frase.trim().split("\\s+");

        return palabras.length;
    }

    public static void main(String[] args) {
        System.out.println(contarPalabras("Hola      que tal"));
    }
}
