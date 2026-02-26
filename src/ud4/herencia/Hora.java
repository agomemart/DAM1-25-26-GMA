package ud4.herencia;

public class Hora {
    protected byte hora;
    protected byte minuto;

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
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
        return String.format("%02d:%02d", hora, minuto);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hora;
        result = prime * result + minuto;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hora other = (Hora) obj;
        if (hora != other.hora)
            return false;
        if (minuto != other.minuto)
            return false;
        return true;
    }

}
