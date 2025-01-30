package main.java.es.ies.puerto.gestion.model;

import java.util.Objects;

public abstract class Empleado {
    private String id;
    private String nombre;
    private int edad;
    private double salarioBase;

    public Empleado() {
    }

    public Empleado(String id) {
        this.id = id;
    }

    public Empleado(String id, String nombre, int edad, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad, salarioBase);
    }

    @Override
    public String toString() {
        return " id= " + getId() + " " +
                ", nombre= " + getNombre() + " " +
                ", edad= " + getEdad() + " " +
                ", salarioBase= " + getSalarioBase() + " " +
                "salarioFinal= " + calcularSalarioFinal();
    }

    public abstract int calcularSalarioFinal();

    public String mostrarInformacion() {
        return "Empleado: " + getClass().getSimpleName() +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nSalario Base: $" + salarioBase +
                "\nSalario Final: $" + calcularSalarioFinal() +
                "\n";
    }

}
