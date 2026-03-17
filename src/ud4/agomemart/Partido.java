package ud4.agomemart;

import java.time.LocalDateTime;

/**
 * @author Adrián Gómez Martínez
 */
public class Partido {
    private Equipo equipoVisitante;
    private Equipo equipoLocal;
    private Arbitro arbitro;
    private LocalDateTime fechaPartido;
    private String lugar;
    private String resultado;

    public Partido(Equipo equipoVisitante, Equipo equipoLocal) {
        if (!equipoVisitante.equals(equipoLocal)) {
            this.equipoVisitante = equipoVisitante;
            this.equipoLocal = equipoLocal;
        } else {
            throw new IllegalArgumentException("Los equipos son iguales.");
        }
    }

    public void setDetalles(Arbitro arbitro, LocalDateTime fechaHora, String lugar) {
        if (arbitro != null && fechaHora != null && lugar != null && !lugar.isEmpty()) {
            this.arbitro = arbitro;
            this.fechaPartido = fechaHora;
            this.lugar = lugar;
        }
    }

    public void setResultado(int puntosLocal, int puntosVisitante) {
        if (puntosLocal >= 0 && puntosVisitante >= 0) {
            if (puntosLocal > puntosVisitante) {
                this.resultado = "Ganó el equipo " + equipoLocal.getNombre() + " " + puntosLocal + " - "
                        + puntosVisitante;
            } else if (puntosVisitante > puntosLocal) {
                this.resultado = "Ganó el equipo " + equipoVisitante.getNombre() + " " + puntosVisitante + " - "
                        + puntosVisitante;
            }
        }
    }

    public LocalDateTime getFechaPartido() {
        return fechaPartido;
    }

    public String getLugar() {
        return lugar;
    }

    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        String salida = "";
        if (resultado == "" || resultado == null) {
            salida += equipoLocal.getNombre() + " VS " + equipoVisitante.getNombre() + "\n";
            salida += "Árbitro: " + arbitro.getNombre() + "\n" + "Fecha y hora: " + getFechaPartido().toString() + "\n"
                    + "Pista: "
                    + getLugar();
        } else {
            salida += getResultado() + "\n" + "Partido finalizado!";
        }
        return salida;
    }

}
