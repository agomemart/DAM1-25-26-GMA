package ud4.interfaces.animales;

public interface AnimalDomestico {
    default void tipo() {
        System.out.println("Soy un animal doméstico.");
    }
}
