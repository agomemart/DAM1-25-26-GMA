package ud4.interfaces.animales;

class Leon implements Sonido {
   public void voz() {
      System.out.println("Grrrr!");
   }

   @Override
   public void vozDurmiendo() {
    System.out.println("Grrrrrrrrrrrrr!");
   }

   

}
