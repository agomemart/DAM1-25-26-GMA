package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GestionEmpleados {
    public static void altaEmpleado(Map<String, Empleado> empleados, String dni, Empleado e) {
        if (dni != null && empleados != null && !empleados.containsKey(dni)) {
            empleados.put(dni, e);
        } else {
            System.out.println("Empleado duplicado o no válido!!");
        }
    }

    static Empleado eliminarEmpleado(Map<String, Empleado> empleados, String dni) {
        if (dni == null || dni.isEmpty()) {
            return null;
        }

        return empleados.remove(dni);
    }

    static void mostrar(Map<String, Empleado> empleados) {
        for (Map.Entry<String, Empleado> entry : empleados.entrySet()) {
            System.out.println(
                    entry.getKey() + " - " + entry.getValue().getNombre() + " - " + entry.getValue().getSalario());
        }
    }

    static void mostrarPorDepartamento(Map<String, Empleado> empleados, Departamento d) {
        System.out.println("Empleados del departamento " + d + ":");
        for (Empleado e : empleados.values()) {
            if (e.getDepartamento() == d) {
                System.out.println(e);
            }
        }
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
        Map<Departamento, Integer> resultado = new HashMap<>();

        for (Empleado e : empleados.values()) {
            Departamento d = e.getDepartamento();
            if (resultado.get(d) != null && resultado.get(d) > 0) {
                resultado.put(d, resultado.get(d) + 1);
            } else {
                resultado.put(d, 1);
            }
        }

        return resultado;
    }

    static List<Empleado> empleadosConSalarioMayorA(Map<String, Empleado> empleados, double salario) {
        List<Empleado> salarioMayor = new ArrayList<>();

        for (Empleado e : empleados.values()) {
            if (e.getSalario() >= salario) {
                salarioMayor.add(e);
            }
        }

        return salarioMayor;
    }

    static Set<String> obtenerDNIs(Map<String, Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        return new HashSet<>(empleados.keySet());
    }
}
