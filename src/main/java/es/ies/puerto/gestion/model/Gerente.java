package main.java.es.ies.puerto.gestion.model;

public class Gerente extends Empleado {
    public Gerente() {
    }

    public Gerente(String id, String nombre, int edad, double salarioBase) {
        super(id, nombre, edad, salarioBase);
    }

    public Gerente(String id) {
        super(id);
    }

    @Override
    public int calcularSalarioFinal() {
        return (int) (getSalarioBase() * 0.30 + getSalarioBase());
    }

}
