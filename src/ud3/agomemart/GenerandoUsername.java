package ud3.agomemart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Adrián Gómez Martínez
 */
public class GenerandoUsername {
    static char caracterValido(char c) {
        switch (c) {
            case 'á':
                return 'a';
            case 'é':
                return 'e';
            case 'í':
                return 'i';
            case 'ó':
                return 'o';
            case 'ú':
                return 'u';
            case 'ü':
                return 'u';
            case 'ñ':
                return 'n';
            default:
                return c;
        }
    }

    static String getUsername(String nombre, String ap1, String ap2) {
        if (nombre == null || ap1 == null || ap2 == null) {
            return null;
        }

        if (nombre.length() == 0 || ap1.length() == 0 || ap2.length() == 0) {
            return null;
        }

        String nombreUsuario = "";
        char primeraLetraNombre = Character.toLowerCase(nombre.charAt(0));
        String parteAp1 = ap1.toLowerCase().substring(0, 4);
        String parteAp2 = ap2.toLowerCase().substring(0, 4);
        String parteAp1Comprobada = "";
        String parteAp2Comprobada = "";

        primeraLetraNombre = caracterValido(primeraLetraNombre);

        for (int i = 0; i < ap1.length(); i++) {
            if (i < 4) {
                if (ap1.charAt(i) == ' ') {
                    int indiceUltimoEspacio = ap1.lastIndexOf(' ');
                    if (indiceUltimoEspacio + 3 < ap1.length()) {
                        parteAp1 = ap1.substring(indiceUltimoEspacio, indiceUltimoEspacio + 3);
                    } else {
                        parteAp1 = ap1.substring(indiceUltimoEspacio, ap1.length() - 1);
                    }
                }
            }
        }

        for (int i = 0; i < ap2.length(); i++) {
            if (i < 4) {
                if (ap2.charAt(i) == ' ') {
                    int indiceUltimoEspacio = ap2.lastIndexOf(' ');
                    if (indiceUltimoEspacio + 4 < ap2.length()) {
                        parteAp2 = ap2.substring(indiceUltimoEspacio + 1, indiceUltimoEspacio + 4);
                    } else {
                        parteAp2 = ap2.substring(indiceUltimoEspacio, ap2.length() - 1);
                    }
                }
            }

        }

        for (int i = 0; i < 4; i++) {
            char c = caracterValido(parteAp1.charAt(i));
            parteAp1Comprobada += c;
        }

        for (int i = 0; i < 4; i++) {
            char c = caracterValido(parteAp2.charAt(i));
            parteAp2Comprobada += c;
        }

        nombreUsuario = primeraLetraNombre + parteAp1Comprobada + parteAp2Comprobada;

        return nombreUsuario;
    }

    @Test
    void testGetUsername() {
        assertEquals("msoutsout", GenerandoUsername.getUsername("María", "Souto", "Souto"));
    }

    @Test
    void testTildesEnheDieresis() {
        assertEquals("ogranmull", GenerandoUsername.getUsername("Óscar", "Graña", "Müller"));
    }

    @Test
    void testEspacios() {
        assertEquals("acosde", GenerandoUsername.getUsername("Ángel", "Cos", "de la Torre"));
    }

    public static void main(String[] args) {
        System.out.println(getUsername("María", "Suto", "Souto"));
    }
}
