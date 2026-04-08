package ud3.practica;

public class EliminarRepetidosCadena {
    public static String elminarRepetidosCadena(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return "";
        }

        String res = "";

        for (int i = 0; i < palabra.length(); i++) {
            if (res.indexOf(palabra.charAt(i)) == -1) {
                res += palabra.charAt(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(elminarRepetidosCadena("programacion"));
    }
}
