package ud2.parejas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adrián Gómez
 */

public class EnquisaEspecializacion {
    static Scanner sc = new Scanner(System.in);

    public static int leerEnteroRango(int min, int max) {
        int valor = min - 1;
        boolean valido = false;

        do {
            try {
                System.out.print("Introduce un número entre " + min + " y " + max + ": ");
                valor = sc.nextInt();

                if (valor >= min && valor <= max) {
                    valido = true;
                } else {
                    System.out.println("Error. Número fuera de rango.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debes escribir un número entero.");
                sc.nextLine();
            }

        } while (!valido);

        return valor;
    }

    public static int preguntarIntereses() {
        System.out.println("Cando remates o ciclo superior, estarías interesad@ en continuar formándote no IES\r\n" + //
                "Chan do Monte facendo un Curso de Especialización? (1=Si/2=No/-1=Salir)");
        return leerEnteroRango(-1, 2);
    }

    public static int preguntarCurso() {
        System.out.println("Cal dos tres cursos de especialización che gustaría que ofertara o centro?");
        System.out.println("1. Ciberseguridade en contornos das tecnoloxías da información");
        System.out.println("2. Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3. Intelixencia artificial e big data");
        return leerEnteroRango(1, 3);
    }

    public static int preguntarHorario() {
        System.out.println("Preferirías que as clases foran pola mañá, pola tarde ou éche indiferente?");
        System.out.print("(1=Mañá / 2=Tarde / 3=Indiferente): ");
        return leerEnteroRango(1, 3);
    }

    public static void mostrarResultados(int totalEncuestados, int respuestasAfirmativas, int ciberseguridad,
            int videojuegos, int inteligenciaArtificial, int mañana, int tarde, int indiferente) {
        System.out.println("Resultados de la encuesta:");
        if (totalEncuestados == 0) {
            System.out.println("Non hai respostas rexistradas.");
            return;
        }

        double porcEspecializ = (double) respuestasAfirmativas / totalEncuestados * 100;
        double porcCiberseguridad = (double) ciberseguridad / respuestasAfirmativas * 100;
        double porcVideojuegos = (double) videojuegos / respuestasAfirmativas * 100;
        double porcInteligencia = (double) inteligenciaArtificial / respuestasAfirmativas * 100;
        double porcMañana = (double) mañana / respuestasAfirmativas * 100;
        double porcTarde = (double) tarde / respuestasAfirmativas * 100;
        double porcIndiferente = (double) indiferente / respuestasAfirmativas * 100;

        System.out.println("Total respuestas: " + totalEncuestados);
        System.out.printf("Quieren hacer curso de especialización: %d/%d encuestados (%.2f%%)\n", respuestasAfirmativas,
                totalEncuestados, porcEspecializ);
        System.out.printf("Interesados en ciberseguridad: %d/%d (%.2f%%)\n", ciberseguridad, respuestasAfirmativas,
                porcCiberseguridad);
        System.out.printf("Interesados en desarrollo de videojuegos: %d/%d (%.2f%%)\n", videojuegos,
                respuestasAfirmativas, porcVideojuegos);
        System.out.printf("Interesados en inteligencia artificial: %d/%d (%.2f%%)\n", inteligenciaArtificial,
                respuestasAfirmativas, porcInteligencia);
        System.out.printf("Prefieren clase por la mañana: %d/%d (%.2f%%)\n", mañana, respuestasAfirmativas, porcMañana);
        System.out.printf("Prefieren clase por la tarde: %d/%d (%.2f%%)\n", tarde, respuestasAfirmativas, porcTarde);
        System.out.printf("Les es indiferente: %d/%d (%.2f%%)\n", indiferente, respuestasAfirmativas, porcIndiferente);
    }

    public static void main(String[] args) {
        System.out.println("Encuesta Curso Especialización.");
        int ciberseguridad = 0;
        int videojuegos = 0;
        int inteligenciaArtificial = 0;
        int mañana = 0;
        int tarde = 0;
        int indiferente = 0;
        int opcion1 = 0;
        int totalEncuestados = 0;
        int respuestasAfirmativas = 0;

        do {
            opcion1 = preguntarIntereses();

            if (opcion1 == 1) {
                respuestasAfirmativas++;
                int opcionUsiarioCurso = preguntarCurso();

                switch (opcionUsiarioCurso) {
                    case 1:
                        ciberseguridad++;
                        break;
                    case 2:
                        videojuegos++;
                        break;
                    case 3:
                        inteligenciaArtificial++;
                        break;
                }

                int opcionClases = preguntarHorario();

                switch (opcionClases) {
                    case 1:
                        mañana++;
                        break;
                    case 2:
                        tarde++;
                        break;
                    case 3:
                        indiferente++;
                        break;
                }
            }
            if (opcion1 != -1) {
                totalEncuestados++;
            }
        } while (opcion1 != -1);
        sc.close();

        mostrarResultados(totalEncuestados, respuestasAfirmativas, ciberseguridad, videojuegos, inteligenciaArtificial,
                mañana, tarde, indiferente);
    }
}