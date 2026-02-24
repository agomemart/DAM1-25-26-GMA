package ud4.herencia;

import ud4.clases.Persona;

public class AppHerencia {
    public static void main(String[] args) {
        Persona p = new Persona("Marta", 30, 1.7);
        p.mostrarDatos();

        Empleado e = new Empleado("Sancho", 25, 1.8, 1725.49);
        e.mostrarDatos();

        Empleado e2 = new Empleado("Sancho2", 25, 1.8, 1725.49);
        e.mostrarDatos();

        Jefe j = new Jefe("Pepe", 2000, "Supervisor");
        j.mostrarDatos();
        
        Persona[] personas = {p, e, e2, j};

        for (Persona persona : personas) {
            persona.mostrarDatos();
            System.out.println();
        }



    }
}
