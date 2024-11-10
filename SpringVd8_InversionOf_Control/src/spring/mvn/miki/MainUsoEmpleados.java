package spring.mvn.miki;

public class MainUsoEmpleados {

	public static void main(String[] args) {
		
		// Creacion de objetos de tipo empleado
		
		Empleados empleado1 = new DirectorEmpleado();
	
		// Uso de los objetos
		
		System.out.println(empleado1.getTareas());
	}
}
