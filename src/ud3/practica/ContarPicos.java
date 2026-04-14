package ud3.practica;

public class ContarPicos {
    public static int contarPicos(int[] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int contPicos = 0;
        for (int i = 1; i < t.length; i++) {
            if (i < t.length - 1) {
                if (t[i] > t[i - 1] && t[i] > t[i + 1]) {
                    contPicos++;
                }
            }

        }

        return contPicos;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5, 4, 7 };
        System.out.println(contarPicos(arr));
    }
}
