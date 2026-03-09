package ud4.practicaex.empleado3;

public class Manager extends EmpleadoFijo implements GestionProyecto{
    private String nombreProyecto;

    public Manager(String nombre, int id, double salarioBase, double bonus) {
        super(nombre, id, salarioBase, bonus);
    }

    @Override
    public void asignarProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto; 
    }

    @Override
    public void mostrarProyecto() {
        if (nombreProyecto == null || nombreProyecto.isEmpty()) {
            System.out.println("Sin proyecto asignado");
        } else {
            System.out.println("Proyecto: " + nombreProyecto);
        }
    }
    
    
}
