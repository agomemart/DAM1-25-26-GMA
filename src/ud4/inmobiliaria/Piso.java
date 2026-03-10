package ud4.inmobiliaria;

public class Piso extends Inmueble {
    private int planta;

    public Piso(String calle, int metrosCuadrados, int habitaciones, int banhos, int planta) {
        super(calle, metrosCuadrados, habitaciones, banhos);
        this.planta = planta;
    }

    @Override
    public String detalle() {
        String str = "Piso en " + calle + "." + "\n" + metrosCuadrados + " m2, " + habitaciones + " hab, " + banhos
                + " baños, " + planta + "ª planta.\n";
        
        if (getPrecioAlquiler() > 0) {
            str += "Precio de alquiler: " + getPrecioAlquiler() + " euros.\n";
        }

        if (getPrecioVenta() > 0) {
            str += "Precio de venta: " + getPrecioVenta() + " euros.\n";
        }

        return str;
    }

}
