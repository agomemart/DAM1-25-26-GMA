package ud4.clases;

public class HoraExacta extends Hora {
    protected byte segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (segundo >= 0 && segundo < 60) {
            this.segundo = (byte) segundo;
        } else {
            throw new IllegalArgumentException("El valor de segundo es incorrecto.");
        }
    }

    public void setSegundo(int segundoIntroduc) {
        if (segundoIntroduc >= 0 && segundoIntroduc < 60) {
            segundo = (byte) segundoIntroduc;
        }
    }

    public void inc() {
        if (segundo == 59) {
            segundo = 0;
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
        } else {
            segundo++;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + segundo;
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
        HoraExacta other = (HoraExacta) obj;
        if (hora != other.hora)
            return false;
        if (minuto != other.minuto)
            return false;
        if (segundo != other.segundo)
            return false;
        return true;
    }
}
