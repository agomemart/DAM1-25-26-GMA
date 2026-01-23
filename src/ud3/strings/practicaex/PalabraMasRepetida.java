package ud3.strings.practicaex;

public class PalabraMasRepetida {
    static String palabraMasRepetida(String frase) {
        if (frase == null || frase.length() == 0) {
            return null;
        }

        String[] palabras = frase.split(" ");
        String palabraMasRepetida = "";
        int maxFrecuencia = 0;


        for (int i = 0; i < palabras.length; i++) {
            int contador = 0;
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[i].equalsIgnoreCase(palabras[j]) ) {
                    contador++;
                }
            }

            if (contador > maxFrecuencia) {
                maxFrecuencia = contador;
                palabraMasRepetida = palabras[i];
            }
        }

        return palabraMasRepetida;
    }

    public static void main(String[] args) {
        System.out.println(palabraMasRepetida("java ruby java python ruby java"));
    }
}
