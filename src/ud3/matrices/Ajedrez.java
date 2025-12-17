package ud3.matrices;

public class Ajedrez {
    public static void mostrarTableroColoresCasillas(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    t[i][j] = 'B';
                } else {
                    t[i][j] = 'N';
                }
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; i++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] inicializarTablero() {
        char[][] nuevoTablero = {
                { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { 'T', 'C', 'A', 'D', 'R', 'A', 'C', 'T' }
        };

        return nuevoTablero;

    }

    public static void main(String[] args) {
        char tablero[][] = new char[8][8];
        mostrarTableroColoresCasillas(tablero);

        tablero = inicializarTablero();
    }
}
