package ud4.interfaces.animales;

public class Tigre implements Depredador, Sonido {
   @Override
   public void cazar() {
      System.out.println("El tigre caza en solitario.");
   }
   @Override
   public void acechar() {
      System.out.println("Acecha en silencio antes de atacar.");
   }
   @Override
   public void voz() {
    System.out.println("Grrrrrr");
   }
   @Override
   public void vivirEnLaNaturaleza() {
      System.out.println("Vive en la selva.");
    }

   

}
