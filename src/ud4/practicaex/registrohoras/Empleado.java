package ud4.practicaex.registrohoras;

import java.time.LocalTime;

public abstract class Empleado implements Comparable<Empleado>{
    protected String nombre;
    protected LocalTime horaEntrada;
    protected LocalTime horaSalida;

    

    public Empleado(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre inválido");
        }
        
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        if (horaEntrada != null) {
            System.out.println("Entrada: " + horaEntrada.getHour() + ":" + horaEntrada.getMinute());
        }
        if (horaSalida != null) {
            System.out.println("Salida: " + horaSalida.getHour() + ":" + horaSalida.getMinute());
        }
        
    }

    public abstract double calcularHorasTrabajadas();

    @Override
    public int compareTo(Empleado e) {
        if (this.horaEntrada.compareTo(e.horaEntrada) == 0) {
            return this.nombre.compareTo(e.nombre);
        }
        return this.horaEntrada.compareTo(e.horaEntrada);
    }

    public int contarLetrasNombre() {
        String[] palabras = nombre.split(" ");
        String nombreSinEspacios = "";

        for (String string : palabras) {
            nombreSinEspacios += string;
        }

        return nombreSinEspacios.length();
    }
}
