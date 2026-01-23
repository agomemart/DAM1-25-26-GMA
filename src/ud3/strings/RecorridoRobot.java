package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RecorridoRobot {
    static boolean recorridoRobot(String[] mapa, String instrucciones) {
        char direccion = 'W';
        int fila = 0;
        int columna = 0;

        for (int i = 0; i < mapa.length; i++) {
            if (mapa[i].indexOf('A') != -1) {
                fila = i;
                columna = mapa[i].indexOf('A');
            }
        }

        for (int i = 0; i < instrucciones.length(); i++) {
            switch (instrucciones.charAt(i)) {
                case 'A':
                    switch (direccion) {
                        case 'W':
                            fila--;
                            if (fila < 0) {
                                return false;
                            }
                            break;
                        case 'S':
                            fila++;
                            if (fila >= mapa.length) {
                                return false;
                            }
                            break;
                        case 'A':
                            columna--;
                            if (columna < 0) {
                                return false;
                            }
                            break;
                        case 'D':
                            columna++;
                            if (columna >= mapa[fila].length()) {
                                return false;
                            }
                            break;
                    }

                    if (mapa[fila].charAt(columna) == '*') {
                        return false;
                    }

                    break;
                case 'L':
                    switch (direccion) {
                        case 'W':
                            direccion = 'A';
                            break;
                        case 'S':
                            direccion = 'D';
                            break;
                        case 'A':
                            direccion = 'S';
                            break;
                        case 'D':
                            direccion = 'W';
                            break;
                    }
                    break;
                case 'R':
                    switch (direccion) {
                        case 'W':
                            direccion = 'D';
                            break;
                        case 'S':
                            direccion = 'A';
                            break;
                        case 'A':
                            direccion = 'W';
                            break;
                        case 'D':
                            direccion = 'S';
                            break;
                    }
                    break;
            }
        }

        return mapa[fila].charAt(columna) == 'Z';
           
    }

    @Test
    void recorridoRobotTest() {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };
        assertTrue(recorridoRobot(mapa, "AALARAARAA"));
        assertTrue(recorridoRobot(mapa, "RAALAAAALA"));
        assertFalse(recorridoRobot(mapa, "ARALA"));
        assertFalse(recorridoRobot(mapa, "LAA"));
    }
}
