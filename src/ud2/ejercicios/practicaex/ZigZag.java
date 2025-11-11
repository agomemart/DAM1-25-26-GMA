package ud2.ejercicios.practicaex;

public class ZigZag {
    public static void zigZag(int n) {
        int divisor = 1;
        int cifraAnterior = 0;
        boolean subiendo = true;
        boolean haSubido = false;
        boolean haBajado = false;
        boolean valido = true;

        while (n / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            int cifra = n / divisor % 10;
            divisor /= 10;

            if (cifraAnterior != -1) {
                if (cifra == cifraAnterior) {
                    valido = false;
                    break;
                }
                if (subiendo) {
                    if (cifra < cifraAnterior) {
                        subiendo = false;
                        haSubido = true;
                    }
                } else {
                    if (cifra > cifraAnterior) {
                        valido = false;
                        break;
                    } else {
                        haBajado = true;
                    }
                }
            }

            cifraAnterior = cifra;
        }

        valido = valido && haSubido && haBajado;

        if (valido) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        System.out.print("12321 -> ");
        zigZag(12321); // SI
        System.out.print("356421 -> ");
        zigZag(356421); // SI
        System.out.print("12431 -> ");
        zigZag(12431); // SI
        System.out.print("4789831 -> ");
        zigZag(4789831); // SI

        System.out.print("11123 -> ");
        zigZag(11123); // NO (cifras repetidas)
        System.out.print("54321 -> ");
        zigZag(54321); // NO (solo baja)
        System.out.print("12345 -> ");
        zigZag(12345); // NO (solo sube)
        System.out.print("122321 -> ");
        zigZag(122321); // NO (repite 2)
        System.out.print("13245 -> ");
        zigZag(13245); // NO (sube, baja, vuelve a subir)
        System.out.print("13542 -> ");
        zigZag(13542); // NO (cambio irregular)

        System.out.print("989 -> ");
        zigZag(989); // SI
        System.out.print("212 -> ");
        zigZag(212); // SI
        System.out.print("221 -> ");
        zigZag(221); // NO (empieza bajando)
        System.out.print("101 -> ");
        zigZag(101); // NO (repetición y bajada brusca)
        System.out.print("1212 -> ");
        zigZag(1212); // NO (vuelve a subir al final)
    }
}