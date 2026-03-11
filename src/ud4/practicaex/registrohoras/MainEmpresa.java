package ud4.practicaex.registrohoras;

import java.time.LocalTime;
import java.util.Arrays;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[5];

        EmpleadoOficina eo1 = new EmpleadoOficina("Pepe");
        EmpleadoOficina eo2 = new EmpleadoOficina("Luis");
        EmpleadoOficina eo3 = new EmpleadoOficina("Jose");
        EmpleadoTurno et1 = new EmpleadoTurno("Gabriel");
        EmpleadoTurno et2 = new EmpleadoTurno("Javi");

        empleados[0] = eo1;
        empleados[1] = eo2;
        empleados[2] = eo3;
        empleados[3] = et1;
        empleados[4] = et2;

        Arrays.sort(empleados);
        Arrays.sort(empleados, new ComparadorHorasTrabajadas());
    }

    public static void mostrarTrabajando(Empleado[] empleados) {
        for (Empleado empleado : empleados) {
            if (empleado.horaEntrada != null && empleado.horaSalida == null) {
                empleado.mostrarInfo();
            }
        }
    }

    public static void buscarPorHora(Empleado[] empleados, LocalTime hora) {
        for (Empleado empleado : empleados) {
            if (empleado.horaEntrada != null && empleado.horaEntrada.isBefore(hora)) {
                empleado.mostrarInfo();
            }
        }
    }

    public static double horasTotales(Empleado[] empleados) {
        double horasTrabajadas = 0;

        for (Empleado empleado : empleados) {
            horasTrabajadas += empleado.calcularHorasTrabajadas();
        }

        return horasTrabajadas;
    }
}
