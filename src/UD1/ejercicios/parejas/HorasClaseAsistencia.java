package ud1.ejercicios.parejas;

import java.util.Scanner;

public class HorasClaseAsistencia {
    public static void main(String[] args) {
        final int HORAS_PROGRAMACION = 240;
        final int HORAS_LENGUAJE_MARCAS = 133;
        final int HORAS_BASE_DATOS = 187;

        int sesionesProgramacion = HORAS_PROGRAMACION * 60 / 50;
        int sesionesLenguajes = HORAS_LENGUAJE_MARCAS * 60 / 50;
        int sesionesBases = HORAS_BASE_DATOS * 60 / 50;

        double sesionesApercProg = sesionesProgramacion * 0.06;
        double sesionesApercLenguajes = sesionesLenguajes * 0.06;
        double sesionesApercBases = sesionesBases * 0.06;

        double sesionesPerdidaProg = sesionesProgramacion * 0.1;
        double sesionesPerdidaLenguajes = sesionesProgramacion * 0.1;
        double sesionesPerdidaBases = sesionesBases * 0.1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el número de faltas de programación: ");
        int faltasProgramacion = sc.nextInt();
        System.out.print("Inserta el número de faltas de lenguaje de marcas: ");
        int faltasLenguajes = sc.nextInt();
        System.out.print("inserta el número de faltas de base de datos: ");
        int faltasBases = sc.nextInt();
        sc.close();

        String resultadoProgramacion = faltasProgramacion >= sesionesPerdidaProg ? "Pérdida de evaluación continua" : "Apercibimiento";
        resultadoProgramacion = faltasProgramacion >= sesionesApercProg  && faltasProgramacion < sesionesPerdidaProg ? "Apercibimiento" : "Ningún problema";

        System.out.println("Apercibimiento Programación: " + sesionesApercProg);
        System.out.println("Apercibimiento Lenguaje de Marcas " + sesionesApercLenguajes);
        System.out.println("Apercibimiento Base de Datos: " + sesionesApercBases);
        System.out.println("Pérdida de evaluación continua Programación: " + sesionesPerdidaProg);
        System.out.println("Pérdida de evaluación continua Lenguaje de Marc");
        
        System.out.println("Programación: " + resultadoProgramacion);
    }
}
