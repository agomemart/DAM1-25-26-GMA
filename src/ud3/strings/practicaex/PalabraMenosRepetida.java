package ud3.strings.practicaex;

public class PalabraMenosRepetida {
    static String palabraMenosRepetida(String frase) {
        if (frase == null || frase.length() == 0) {
            return null;
        }

        String[] palabras = frase.split(" ");
        String palabraMenosRepetida = "";
        int minFrecuencia = Integer.MAX_VALUE;
        
        for (int i = 0; i < palabras.length; i++) {
            int contador = 0;
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[i].equalsIgnoreCase(palabras[j])) {
                    contador++;
                }
            }

            if (contador < minFrecuencia) {
                minFrecuencia = contador;
                palabraMenosRepetida = palabras[i];
            }
        }

        return palabraMenosRepetida;
    }
}
