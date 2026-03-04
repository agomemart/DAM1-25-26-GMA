package ud4.practicaex.empleado;

public class MainEmpleado {
    public static void main(String[] args) {
        Trabajable t1 = new EmpleadoTiempoCompleto("Ana", 2000);
        Trabajable t2 = new EmpleadoPorHoras("Luis", 1200, 80, 15);

        t1.trabajar();
        t2.trabajar();
    }
}
