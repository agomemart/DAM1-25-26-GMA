package ud3.practica;

public class GenerarUsername {
    public static char caracterValido(char c) {
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
        }
        return c;
    }

    public static String generarUsuario(String nombre, String ap1, String ap2) {
        if (nombre == null || nombre.isEmpty() || ap1 == null || ap1.isEmpty() || ap2 == null || ap2.isEmpty()) {
            return "";
        }

        String nombreUsuario = "";

        nombreUsuario += caracterValido(Character.toLowerCase(nombre.trim().charAt(0)));

        ap1 = ap1.toLowerCase().trim();
        int indiceEspAp1 = ap1.indexOf(' ');
        if (indiceEspAp1 != -1) {
            if (ap1.length() >= 4 && indiceEspAp1 <= 4) {
                for (int i = 0; i < indiceEspAp1; i++) {
                    nombreUsuario += caracterValido(ap1.charAt(i));
                }
            } else {
                for (int i = 0; i < ap1.length(); i++) {
                    nombreUsuario += caracterValido(ap1.charAt(i));
                }
            }

        } else {
            if (ap1.length() >= 4) {
                for (int i = 0; i < 4; i++) {
                    nombreUsuario += caracterValido(ap1.charAt(i));
                }
            } else {
                for (int i = 0; i < ap1.length(); i++) {
                    nombreUsuario += caracterValido(ap1.charAt(i));
                }
            }

        }

        ap2 = ap2.toLowerCase().trim();
        int indiceEspAp2 = ap2.indexOf(' ');
        if (indiceEspAp2 != -1 && indiceEspAp2 <= 4) {
            if (ap2.length() >= 4) {
                for (int i = 0; i < indiceEspAp2; i++) {
                    nombreUsuario += caracterValido(ap2.charAt(i));
                }
            } else {
                for (int i = 0; i < ap2.length(); i++) {
                    nombreUsuario += caracterValido(ap2.charAt(i));
                }
            }
        } else {
            if (ap2.length() >= 4) {
                for (int i = 0; i < 4; i++) {
                    nombreUsuario += caracterValido(ap2.charAt(i));
                }
            } else {
                for (int i = 0; i < ap2.length(); i++) {
                    nombreUsuario += caracterValido(ap2.charAt(i));
                }
            }
        }

        return nombreUsuario;
    }

    public static void main(String[] args) {
        System.out.println(generarUsuario("Ángel", "Cos", "de la Torre"));
    }
}
