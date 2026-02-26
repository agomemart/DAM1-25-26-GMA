package ud4.herencia;

public class HoraExacta extends Hora {
    protected byte segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        setSegundo(segundo);
    }

    public boolean setSegundo(int segundoIntroduc) {
        if (segundoIntroduc >= 0 && segundoIntroduc < 60) {
            segundo = (byte) segundoIntroduc;
            return true;
        }
        return false;
    }

    public void inc() {
        segundo++;
        if (segundo == 60) {
            super.inc();
            segundo = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s:%2d", super.toString(), segundo);
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
        if (segundo != other.segundo)
            return false;
        return super.equals(obj);
    }
}
