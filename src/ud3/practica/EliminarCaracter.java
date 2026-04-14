package ud3.practica;

public class EliminarCaracter {
    public static String eliminarCaracter(String s, char c) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String caracter = "";
        caracter += c;
        return s.replace(caracter, "");
    }

    public static void main(String[] args) {
        System.out.println(eliminarCaracter("cama", 'a'));
    }
}
