package ud4.practicaex.empleado2;

public class EmpleadoJunior extends Empleado implements Ascendible{

    public EmpleadoJunior(String nombre, double salario, String categoria) {
        super(nombre, salario, categoria);
    }

    @Override
    double calcularSalarioFinal() {
        return salario;
    }

    public void ascender(){
        categoria = "SemiSenior";
        salario += salario * 0.15; 
    }
    
}
