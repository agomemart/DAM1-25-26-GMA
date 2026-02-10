package ud4.clases;

public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Hora(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = (byte) hora;
            this.minuto = (byte) minuto;
            this.segundo = (byte) segundo;
        } else {
            throw new IllegalArgumentException("Los valres de hora, minuto, o segundo son incorrectos.");
        }
    }

    public void mostrar() {
        System.out.printf("%02d:%02d:%02d %n", hora, minuto, segundo);
    }

    public void incSegundo(){
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

}
