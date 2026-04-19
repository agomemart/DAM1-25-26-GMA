package ud3.practica;

public class MatriculaValida {
    public static boolean esLetraValida(char c) {
        String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";

        for (int i = 0; i < letrasValidas.length(); i++) {
            if (c == letrasValidas.charAt(i)) {
                return true;
            }
        }

        return false;
    }
    public static boolean esMatriculaValida(String matricula) {
        if (matricula == null || matricula.length() != 7) {
            return false;
        }

        

        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }

        for (int i = 4; i < matricula.length(); i++) {
            if (!esLetraValida(matricula.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(esMatriculaValida("1111BBB"));
    }
}
