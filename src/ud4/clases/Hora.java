package ud4.clases;

public class Hora {
    protected byte hora;
    protected byte minuto;

    public Hora(int hora, int minuto) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60) {
            this.hora = (byte) hora;
            this.minuto = (byte) minuto;
        } else {
            throw new IllegalArgumentException("Los valres de hora, minuto, o segundo son incorrectos.");
        }
    }

    public void inc() {
        if (minuto == 59) {
            minuto = 0;
            if (hora == 23) {
                hora = 0;
            } else {
                hora++;
            }
        } else {
            minuto++;
        }
    }

    public boolean setMinuto(int minutoIntroduc) {
        if (minutoIntroduc >= 0 && minutoIntroduc < 60) {
            minuto = (byte) minutoIntroduc;
            return true;
        }
        return false;
    }

    public boolean setHora(int horaIntroduc) {
        if (horaIntroduc >= 0 && horaIntroduc < 24) {
            hora = (byte) horaIntroduc;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto;
    }

    /*
     * public void mostrar() {
     * System.out.printf("%02d:%02d:%02d %n", hora, minuto);
     * }
     */

}
