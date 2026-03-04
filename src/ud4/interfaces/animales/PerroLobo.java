package ud4.interfaces.animales;

public class PerroLobo implements AnimalDomestico, AnimalSalvaje {

    @Override
    public void vivirEnLaNaturaleza() {
      System.out.println("Vive en el monte.");
    }

    @Override
    public void tipo() {
        AnimalDomestico.super.tipo();
    }

    

}
