package main.java.es.ies.puerto.gestion.model;



public class Desarrollador extends Empleado {
  

    public Desarrollador() {
    }

    public Desarrollador(String id){
        super(id);
    }

    public Desarrollador(String id, String nombre, int edad, double salarioBase) {
      super(id, nombre, edad, salarioBase);
    }

    @Override
    public int calcularSalarioFinal() {
        return (int) (getSalarioBase() * 0.20 + getSalarioBase());
    }

}
