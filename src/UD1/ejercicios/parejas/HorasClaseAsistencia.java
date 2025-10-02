package ud1.ejercicios.parejas;

import java.util.Scanner;
/**
 * @author Adrián Gómez
 */

public class HorasClaseAsistencia {
    public static void main(String[] args) {
        final int HORAS_PROGRAMACION = 240;
        final int HORAS_LENGUAJE_MARCAS = 133;
        final int HORAS_BASE_DATOS = 187;
        final String PROGRAMACION = "Programación";
        final String LENGUAJES = "Lenguaje de Marcas";
        final String BASES = "Base de Datos";

        int sesionesProgramacion = HORAS_PROGRAMACION * 60 / 50;
        int sesionesLenguajes = HORAS_LENGUAJE_MARCAS * 60 / 50;
        int sesionesBases = HORAS_BASE_DATOS * 60 / 50;

        double sesionesApercProg = sesionesProgramacion * 0.06;
        double sesionesApercLenguajes = sesionesLenguajes * 0.06;
        double sesionesApercBases = sesionesBases * 0.06;

        double sesionesPerdidaProg = sesionesProgramacion * 0.1;
        double sesionesPerdidaLenguajes = sesionesLenguajes * 0.1;
        double sesionesPerdidaBases = sesionesBases * 0.1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el número de faltas de " + PROGRAMACION + ": ");
        int faltasProgramacion = sc.nextInt();
        System.out.print("Inserta el número de faltas de " + LENGUAJES + ": ");
        int faltasLenguajes = sc.nextInt();
        System.out.print("Inserta el número de faltas de " + BASES + ": ");
        int faltasBases = sc.nextInt();
        sc.close();

        String resultadoProgramacion = (faltasProgramacion >= sesionesPerdidaProg)
                ? "Pérdida de evaluación continua"
                : (faltasProgramacion >= sesionesApercProg)
                        ? "Apercibimiento"
                        : "Ningún problema";
        String resultadoLenguajes = (faltasLenguajes >= sesionesPerdidaLenguajes)
                ? "Pérdida de evaluación continua"
                : (faltasLenguajes >= sesionesApercLenguajes)
                        ? "Apercibimiento"
                        : "Ningún problema";
        String resultadoBases = (faltasBases >= sesionesPerdidaBases)
                ? "Pérdida de evaluación continua"
                : (faltasBases >= sesionesApercBases)
                        ? "Apercibimiento"
                        : "Ningún problema";

        System.out.println("Sesiones " + PROGRAMACION + ": " + sesionesProgramacion);
        System.out.println("Sesiones " + LENGUAJES + ": " + sesionesLenguajes);
        System.out.println("Sesiones " + BASES + ": " + sesionesBases);
        
        System.out.printf("Apercibimiento " + PROGRAMACION + ": %.2f sesiones%n", sesionesApercProg);
        System.out.printf("Apercibimiento " + LENGUAJES + ": %.2f sesiones%n", sesionesApercLenguajes);
        System.out.printf("Apercibimiento " + BASES + ": %.2f sesiones%n", sesionesApercBases);

        System.out.printf("Pérdida de evaluación continua " + PROGRAMACION + ": %.2f sesiones%n", sesionesPerdidaProg);
        System.out.printf("Pérdida de evaluación continua " + LENGUAJES + ": %.2f sesiones%n",
                sesionesPerdidaLenguajes);
        System.out.printf("Pérdida de evaluación continua " + BASES + ": %.2f sesiones%n", sesionesPerdidaBases);

        System.out.println(PROGRAMACION + ": " + resultadoProgramacion);
        System.out.println(LENGUAJES + ": " + resultadoLenguajes);
        System.out.println(BASES + ": " + resultadoBases);
    }
}
