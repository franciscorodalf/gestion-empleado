package main.java.es.ies.puerto.gestion.model;

public class Programa {
    public static void main(String[] args) {
        Empleado trabajador1 = new Desarrollador("12345678", "Fran", 40, 1200);
        Empleado trabajador2 = new Diseniador("89101112", "Roberto", 25, 1600);
        Empleado trabajador3 = new Gerente("13141516", "Pablo", 50, 2000);

        System.out.println(trabajador1.mostrarInformacion());
        System.out.println(trabajador2.mostrarInformacion());
        System.out.println(trabajador3.mostrarInformacion());
    }
}
