package ud3.practica;

public class CaracterMasRepetido {
    public static char masRepetido(String frase) {
        if (frase == null || frase.isBlank()) {
            return '0';
        }

        char masFrecuente = frase.charAt(0);
        int max = 0;

        for (int i = 0; i < frase.length(); i++) {
            int contador = 0;

            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(i) == frase.charAt(j)) {
                    contador++;
                }
            }

            if (contador >= max) {
                max = contador;
                masFrecuente = frase.charAt(i);
            }
        }
        return masFrecuente;
    }

    public static void main(String[] args) {
        System.out.println(masRepetido("mi casa es la más bonita del mundo mundial"));
    }
}
