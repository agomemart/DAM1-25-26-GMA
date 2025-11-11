package ud2.ejercicios.practicaex;

public class MontañaPerfecta {
    public static boolean esMontañaPerfecta(int n) {
        int cifraAnterior = -1;
        int divisor = 1;
        boolean subiendo = true;
        boolean haSubido = false;
        boolean haBajado = false;

        while (n / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            int cifra = (n / divisor) % 10;
            divisor /= 10;

            if (cifraAnterior != -1) {

                if (cifra == cifraAnterior)
                    return false;

                if (subiendo) {
                    if (cifra > cifraAnterior) {
                        haSubido = true; 
                    } else {
                        subiendo = false;
                        haBajado = true;
                    }
                } else {
                    if (cifra > cifraAnterior)
                        return false;
                    haBajado = true;
                }
            }

            cifraAnterior = cifra;
        }

        // Debe haber subida y bajada
        return haSubido && haBajado;
    }

    public static void main(String[] args) {
        System.out.println("12321 -> " + esMontañaPerfecta(12321) + "   (esperado: true)");
        System.out.println("356421 -> " + esMontañaPerfecta(356421) + "   (esperado: true)");
        System.out.println("12431 -> " + esMontañaPerfecta(12431) + "   (esperado: true)");
        System.out.println("4789831 -> " + esMontañaPerfecta(4789831) + "   (esperado: true)");

        System.out.println("11123 -> " + esMontañaPerfecta(11123) + "   (esperado: false, tiene cifras repetidas)");
        System.out.println("54321 -> " + esMontañaPerfecta(54321) + "   (esperado: false, solo baja)");
        System.out.println("12345 -> " + esMontañaPerfecta(12345) + "   (esperado: false, solo sube)");
        System.out.println("122321 -> " + esMontañaPerfecta(122321) + "   (esperado: false, repite 2)");
        System.out.println("13245 -> " + esMontañaPerfecta(13245) + "   (esperado: false, baja y vuelve a subir)");
        System.out.println("13542 -> " + esMontañaPerfecta(13542) + "   (esperado: false, cambio irregular)");

        System.out.println("989 -> " + esMontañaPerfecta(989) + "   (esperado: true)");
        System.out.println("212 -> " + esMontañaPerfecta(212) + "   (esperado: true)");
        System.out.println("221 -> " + esMontañaPerfecta(221) + "   (esperado: false, empieza bajando)");

        System.out.println(
                "101 -> " + esMontañaPerfecta(101) + "   (esperado: false, bajada demasiado brusca y repetición)");
        System.out.println("1212 -> " + esMontañaPerfecta(1212) + "   (esperado: false, vuelve a subir al final)");

    }
}
