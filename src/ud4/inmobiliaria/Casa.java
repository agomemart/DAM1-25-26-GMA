package ud4.inmobiliaria;

public class Casa extends Inmueble {
    private int metrosTerreno;

    public Casa(String calle, int metrosCuadrados, int habitaciones, int banhos, int metrosTerreno) {
        super(calle, metrosCuadrados, habitaciones, banhos);
        this.metrosTerreno = metrosTerreno;
    }

    @Override
    public String detalle() {
        String str = "Casa en " + calle + "." + "\n" + metrosCuadrados + " m2, " + habitaciones + " hab, " + banhos
                + " baños, con terreno de " + metrosTerreno + "m2.\n";
        
        if (getPrecioAlquiler() > 0) {
            str += "Precio de alquiler: " + getPrecioAlquiler() + " euros.\n";
        }

        if (getPrecioVenta() > 0) {
            str += "Precio de venta: " + getPrecioVenta() + " euros.\n";
        }
        
        return str;
    }

}
