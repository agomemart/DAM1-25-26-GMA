package ud3.matrices;

/**
 * @author Adrián Gómez
 */
import java.util.Scanner;

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

    public static void mostarTableroConLeyenda(char[][] t) {
        System.out.println("a b c d e f g h");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.print(t.length - i);
            System.out.println();
        }
        System.out.println("a b c d e f g h");
        System.out.println();
    }

    public static int[] leerMovimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Movimiento? Ejemplo \"e2 e4\": ");
        String entrada = sc.nextLine();
        char columnaOrigen = entrada.charAt(0); // e columnaOrigen
        char filaOrigen = entrada.charAt(1); // 2 filaOrigen
        char columnaDestino = entrada.charAt(3); // e columnaDestino
        char filaDestino = entrada.charAt(4); // 4 filaDestino

        int[] movimiento = {
                7 - (filaOrigen - '1'),
                columnaOrigen - 'a',
                7 - (filaDestino - '1'),
                columnaDestino - 'a'
        };

        return movimiento;
    }

    public static void ejecutarMovimiento(char[][] t, int[] mov) {
        t[mov[2]][mov[3]] = t[mov[0]][mov[1]];
        t[mov[0]][mov[1]] = '-';
    }

    public static boolean esMovimientoValido(char[][] t, int[] mov, boolean turnoBlancas) {
        boolean esMovimientoValido = true;

        if (turnoBlancas) {
            if (t[mov[0]][mov[1]] != 'P' &&
                t[mov[0]][mov[1]] != 'T' &&
                t[mov[0]][mov[1]] != 'C' &&
                t[mov[0]][mov[1]] != 'A' &&
                t[mov[0]][mov[1]] != 'D' &&
                t[mov[0]][mov[1]] != 'R') {
                    System.out.println("La casilla de origen no contiene una pieza blanca");
                    return false;
                }
        } else {
            if (t[mov[0]][mov[1]] != 'p' &&
                t[mov[0]][mov[1]] != 't' &&
                t[mov[0]][mov[1]] != 'c' &&
                t[mov[0]][mov[1]] != 'a' &&
                t[mov[0]][mov[1]] != 'd' &&
                t[mov[0]][mov[1]] != 'r') {
                    System.out.println("La casilla de origen no contiene una pieza negra");
                    return false;
                }
        }

        if (turnoBlancas) {
            if (t[mov[2]][mov[3]] != 'P' &&
                t[mov[2]][mov[3]] != 'T' &&
                t[mov[2]][mov[3]] != 'C' &&
                t[mov[2]][mov[3]] != 'A' &&
                t[mov[2]][mov[3]] != 'D' &&
                t[mov[2]][mov[3]] != 'R') {
                    System.out.println("La casilla de destino no contiene una pieza blanca");
                    return false;
                }
        } else {
            if (t[mov[2]][mov[3]] != 'p' &&
                t[mov[2]][mov[3]] != 't' &&
                t[mov[2]][mov[3]] != 'c' &&
                t[mov[2]][mov[3]] != 'a' &&
                t[mov[2]][mov[3]] != 'd' &&
                t[mov[2]][mov[3]] != 'r') {
                    System.out.println("La casilla de destino no contiene una pieza negra");
                    return false;
                }
        }
        return esMovimientoValido;
    }

    public static void main(String[] args) {
        char tablero[][] = inicializarTablero();
        boolean turnoBlancas = true;
        boolean fin = false;

        mostarTableroConLeyenda(tablero);
        System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
        int[] movimiento = leerMovimiento();

        while (!fin) {
            ejecutarMovimiento(tablero, movimiento);
            turnoBlancas = !turnoBlancas;

            mostarTableroConLeyenda(tablero);
            System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
            movimiento = leerMovimiento();
        }

        // Mensaje final: ganador/a o tablas

        System.out.println("Fin de la partida!");

    }
}
