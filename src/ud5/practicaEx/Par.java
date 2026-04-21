package ud5.practicaEx;

public class Par<T,U> {
    T primero;
    U segundo;
    
    public Par(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public U getSegundo() {
        return segundo;
    }

    @Override
    public String toString() {
        return primero + ", " + segundo;
    }

    
}
