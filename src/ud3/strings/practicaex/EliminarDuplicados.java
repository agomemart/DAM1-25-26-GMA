package ud3.strings.practicaex;

public class EliminarDuplicados {
    static String eliminarPalabrasDuplicadas(String frase) {
        if (frase == null || frase.length() == 0) {
            return null;
        }

        String[] palabras = frase.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            boolean yaExiste = false;

            for (int j = 0; j < i; j++) {
                if (palabras[i].equalsIgnoreCase(palabras[j])) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste && palabras[i].length() > 0) {
                resultado += palabras[i] + " ";
            }
        }

        return resultado.trim();
    }

    public static void main(String[] args) {
        System.out.println(eliminarPalabrasDuplicadas("hola mundo hola java mundo"));
    }
}
