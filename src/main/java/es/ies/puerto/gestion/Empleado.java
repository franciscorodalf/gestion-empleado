package main.java.es.ies.puerto.gestion;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salarioBase;

    public Empleado() {
    }

    
    public Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }


    public String mostrarInformacion() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            "}";
    }

}