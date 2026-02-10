package ud4.clases;

public class CuentaCorriente {
    private String dni;
    public String nombreTitular;
    private double saldo;
    private Gestor gestor;

    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "", saldo);
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

    public static boolean transferencia(CuentaCorriente c1, CuentaCorriente c2, double importe) {
        if (c1.saldo >= importe) {
            c2.saldo += importe;
            c1.saldo -= importe;
            return true;
        }

        return false;
    }

    public boolean transferir(CuentaCorriente ccDestino, double importe) {
        if (this.saldo >= importe) {
            ccDestino.saldo += importe;
            this.saldo -= importe;
            return true;
        }

        return false;
    }

    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("-------------------------");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
        if (gestor != null) {
            gestor.mostrar();
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}
