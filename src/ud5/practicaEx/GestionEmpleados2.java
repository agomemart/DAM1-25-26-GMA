package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionEmpleados2 {
    static void altaEmpleado(Map<String, Empleado> empleados, String dni, Empleado e) {
        if (empleados.get(dni) == null) {
            empleados.put(dni, e);
        }
    }

    static Empleado eliminarEmpleado(Map<String, Empleado> empleados, String dni) {
        if (empleados == null || empleados.isEmpty() || dni == null) {
            return null;
        }

        return empleados.remove(dni);
    }

    static void mostrar(Map<String, Empleado> empleados) {
        for (Empleado e : empleados.values()) {
            System.out.println(e.getDni() + "  - " + e.getNombre() + " - " + e.getSalario());
        }
    }

    static List<Empleado> empleadosPorDepartamento(Map<String, Empleado> empleados, Departamento d) {
        if (empleados == null || empleados.isEmpty() || d == null) {
            return new ArrayList<>();
        }

        List<Empleado> porDepartamento = new ArrayList<>();
        for (Empleado e : empleados.values()) {
            if (e.getDepartamento() == d) {
                porDepartamento.add(e);
            }
        }
        return porDepartamento;
    }

    static Empleado mejorPagado(Map<String, Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Empleado mejorPagado = null;
        for (Empleado e : empleados.values()) {
            if (mejorPagado == null || e.getSalario() > mejorPagado.getSalario()) {
                mejorPagado = e;
            }
        }

        return mejorPagado;
    }

    static Map<Departamento, Integer> contarPorDepartamento(Map<String, Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Map<Departamento, Integer> porDepartamento = new HashMap<>();
        for (Empleado e : empleados.values()) {
            Departamento d = e.getDepartamento();
            if (porDepartamento.get(d) != null) {
                porDepartamento.put(d, porDepartamento.get(d) + 1);
            } else {
                porDepartamento.put(d, 1);
            }
        }

        return porDepartamento;
    }

    static void ordenar(List<Empleado> lista, Comparator<Empleado> comp) {
        lista.sort(comp);
    }

    public static void main(String[] args) {
        Comparator<Empleado> porSalarioAsc = (e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario());
        Comparator<Empleado> porNombreAsc = (e1, e2) -> e1.getNombre().compareTo(e2.getNombre());
        Comparator<Empleado> porSalarioDescNombre = (e1, e2) -> {
            if (Double.compare(e2.getSalario(), e1.getSalario()) == 0) {
                return e1.getNombre().compareTo(e2.getNombre());
            }

            return Double.compare(e2.getSalario(), e1.getSalario());
        };
    }
}

enum Departamento {
    RRHH, IT, VENTAS
}

class Empleado {
    private String dni;
    private String nombre;
    private double salario;
    private Departamento departamento;

    public Empleado(String dni, String nombre, double salario, Departamento departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + salario + " - " + departamento;
    }

}
