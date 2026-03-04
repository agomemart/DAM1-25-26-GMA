package ud4.interfaces.animales;

import java.util.Random;

interface Sonido {
    int version = 1;
    void voz(); //método de la interfaz

    default void anunciar() {
        System.out.print("El " + getClass().getSimpleName() + " dice: ");
        voz();  // chamada ao método abstracto
    }


   default void vozDurmiendo() {
      System.out.println("Zzz");
      Random rnd = new Random();
      if (rnd.nextInt(10) < 5) {
         roncar();
      }      
   }

   static void bostezo() {  // public por defecto
      System.out.println("Aaaauuuh!");
      Random rnd = new Random();
      if (rnd.nextInt(10) < 5) {
         bostezoLargo();
      }
   }

   private static void bostezoLargo() {
      System.out.println("aaaaaaaaaaaaaah!");
   }

   private void roncar() {
      System.out.println("rororororororrrr!");
   }   

}
