package ud3.practica;

public class EliminarRepetidosConsecutivos {
    public static String eliminarRepetidosConsecutivos(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String res = "";
        res += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                res += s.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(eliminarRepetidosConsecutivos("aaabbccdaa"));
    }
}
