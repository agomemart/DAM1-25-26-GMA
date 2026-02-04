package ud4.clases;

public class CuentaCorriente {
    private String dni;
    private String nombreTitular;
    private double saldo;

    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad > saldo) {
            return false;
        }

        saldo -= cantidad;
        return true;
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("-------------------------");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
    }

}
