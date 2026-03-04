package ud4.interfaces.animales;

class Perro implements Sonido {

    @Override
    public void voz() {
        System.out.println("Guau!");
    }

   // Resto de la implementación de Perro
   public void husmear() {
      System.out.println("Snif, snif!");
   }
   // Resto de la implementación de Perro

   public void correr() {
       System.out.println("El perro está corriendo.");
   }
}

