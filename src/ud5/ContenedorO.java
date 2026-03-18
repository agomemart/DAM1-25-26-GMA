package ud5;

public class ContenedorO {
    private Object objeto;

    public ContenedorO() {

    }

    void guardar(Object nuevo) {
        objeto = nuevo;
    }

    Object extraer() {
        Object res = objeto;
        objeto = null;
        return res;
    }

    public static void main(String[] args) {
        ContenedorO c = new ContenedorO();
        c.guardar(7);
        c.guardar("roca");
        Double x = (Double) c.extraer(); //error ejecucuión
    }
}
