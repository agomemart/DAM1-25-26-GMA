package ud4.clases;

public class Bombilla {
    private boolean interruptor;
    private static boolean intGeneral;

    boolean estaEncendida() {
        return interruptor;
    }

    void encender() {
        interruptor = true;
    }

    void apagar() {
        interruptor = false;
    }

    static void encenderIntGeneral() {
        intGeneral = true;
    }

    static void apagarIntGeneral() {
        intGeneral = false;
    }

    static boolean intGeneralEncendido() {
        return intGeneral;
    }

}
