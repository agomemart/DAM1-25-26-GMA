package ud3.strings;

public class E0607 {
    public static int contarOcurrencias(String frase, String palabra) {
        int contador = 0;
        int posicionBusqueda = 0;
        
        while (frase.indexOf(palabra, posicionBusqueda) != -1) {
            contador++;
            posicionBusqueda = frase.indexOf(palabra, posicionBusqueda) + 1;
        }

        return contador;
    }

    public static void main(String[] args) {
        String texto = "Probando a buscar ocurrencias en un texto buscar";

        System.out.println(contarOcurrencias(texto, "buscar"));
    }
}
