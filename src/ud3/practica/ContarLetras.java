package ud3.practica;

public class ContarLetras {
    public static int contarLetras(String frase) {
        if (frase == null || frase.length() == 0) {
            return -1;
        }
        frase = frase.replace(" ", "");
        return frase.length();
    }

    public static void main(String[] args) {
        System.out.println(contarLetras("En     mi prime"));
    }
}
