package ud4.interfaces.animales;

public interface AnimalSalvaje {
   void vivirEnLaNaturaleza();
    default void tipo() {
        System.out.println("Soy un animal salvaje.");
    }
}
