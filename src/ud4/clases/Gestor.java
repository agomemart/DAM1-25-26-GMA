package ud4.clases;

public class Gestor {
    public String nombre;
    public final String TELEFONO;
    private double importeMax;

    public Gestor(String nombre, String telefono, double importeMax) {
        this.nombre = nombre;
        this.TELEFONO = telefono;
        this.importeMax = importeMax;
    }

    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public double getImporteMax() {
        return importeMax;
    }

    public void setImporteMax(double importeMax) {
        this.importeMax = importeMax;
    }

    public void mostrar() {
        System.out.println("INFORMACIÓN GESTOR");
        System.out.println("==================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + TELEFONO);
        System.out.println("Importe máximo: " + importeMax);
    }

}
