package ud4.rol;

import java.util.Arrays;
import java.util.Comparator;

public class AppCombateGrupos {
    public static void main(String[] args) {

        Personaje[] equipoA = {
                new Personaje("A-1"),
                new Personaje("A-2"),
                new Personaje("A-3"),
        };

        Personaje[] equipoB = {
                new Personaje("B-1"),
                new Personaje("B-2"),
                new Personaje("B-3"),
        };

        System.out.println("Equipo A");
        imprimirEquipo(equipoA);
        System.out.println("Equipo B");
        imprimirEquipo(equipoB);

        

        Comparator<Personaje> comparadorAgilidad = new Comparator<>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getAgilidad() - o2.getAgilidad();
            }
        };

        Personaje[] todos = new Personaje[equipoA.length + equipoB.length];

        for (int i = 0; i < todos.length; i++) {
            if (i < 3) {
                todos[i] = equipoA[i];
            } else {
                todos[i] = equipoB[i - equipoA.length];
            }
        }

        Arrays.sort(todos, comparadorAgilidad.reversed());

        int turno = 0;

        while (alguienVive(equipoA) && alguienVive(equipoB)) {
            Personaje pConTurno = todos[turno];
            if (pConTurno.estaVivo()) {
                if(pertenece(pConTurno, equipoA)){
                    System.out.println("al equipo B");
                    atacar(pConTurno, equipoB);

                } else{
                    System.out.println("al equipo A");
                    atacar(pConTurno, equipoA);
                }
            }
            turno = (turno + 1) % todos.length;
        }

    }

    private static void atacar(Personaje pConTurno, Personaje[] equipo) {
        Comparator<Personaje> comparadorPV = new Comparator<>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getPv() - o2.getPv();
            }
        };

        Arrays.sort(equipo, comparadorPV);

        for (Personaje pAtacado : equipo) {
            if (pAtacado.estaVivo()) {
                int danho = pConTurno.atacar(pAtacado);
                if (danho > 0) {
                    System.out.println(pConTurno + " ataca a " + pAtacado + "y le quita " + danho + " pv.");
                } else {
                    System.out.println(pAtacado + " esquiva el ataque de " + pConTurno);
                }
                return;
            }
        }
    }

    private static boolean pertenece(Personaje pConTurno, Personaje[] equipo) {
        for (Personaje personaje : equipo) {
            if (pConTurno.equals(personaje)) {
                return true;
            }
        }
        return false;
    }

    private static boolean alguienVive(Personaje[] equipo) {
        for (Personaje personaje : equipo) {
            if (personaje.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    private static void imprimirEquipo(Personaje[] equipo) {
        for (Personaje personaje : equipo) {
            System.out.println(personaje);
        }
    }
}
