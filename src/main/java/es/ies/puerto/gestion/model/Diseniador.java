package main.java.es.ies.puerto.gestion.model;

public class Diseniador extends Empleado {

    public Diseniador(){}
    
    public Diseniador(String id, String nombre, int edad, double salarioBase) {
        super(id, nombre, edad, salarioBase);
      }

      public Diseniador(String id){
        super(id);
    }
    @Override
    public int calcularSalarioFinal() {
        return (int) (getSalarioBase() * 0.10 + getSalarioBase());
    }

    
    
}
