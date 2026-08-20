package Dominio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] emp = new Empleado[3]; 
		emp[0] = new Empleado("42.345.678", "Sofia", "Martinez", LocalDate.of(1999, 11, 5), "Femenino", "Av. Cabildo 1560",
				"11-5678-1234", "sofia.martinez@utnfrgp.com", "Disenadora grafica");
		emp[1] = new Empleado("36.987.654", "Diego", "Ramirez", LocalDate.of(1991, 6, 17), "Masculino", "Calle Belgrano 430",
				"11-6789-2345", "diego.ramirez@utnfrgp.com", "Contador");
		emp[2] = new Empleado("41.876.543", "Valentina", "Lopez", LocalDate.of(1998, 1, 29), "Femenino", "Av. San Martin 3200",
				"11-7890-3456", "valentina.lopez@utnfrgp.com", "Recursos humanos");

		for (Empleado empleado : emp) {
			System.out.println(empleado.toString());
		}
		
		System.out.println("El proximó Legajo es: " + Empleado.devuelveProximoLegajo());
		
		Empleado emp3 = new Empleado();
		emp3.setDni("40.123.456");
		emp3.setNombre("Lucia");
		emp3.setApellido("Fernandez");
		emp3.setFechaNacimiento(LocalDate.of(1997, 3, 14));
		emp3.setGenero("Femenino");
		emp3.setDireccion("Av. Rivadavia 2450");
		emp3.setTelefono("11-4567-8901");
		emp3.setEmail("lucia.fernandez@utnfrgp.com");
		emp3.setPuesto("Analista administrativa");

		Empleado emp4 = new Empleado();
		emp4.setDni("38.765.432");
		emp4.setNombre("Martin");
		emp4.setApellido("Gomez");
		emp4.setFechaNacimiento(LocalDate.of(1994, 8, 22));
		emp4.setGenero("Masculino");
		emp4.setDireccion("Calle Moreno 875");
		emp4.setTelefono("11-4321-6789");
		emp4.setEmail("martin.gomez@utnfrgp.com");
		emp4.setPuesto("Soporte tecnico");
		
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		
		System.out.println("El proximó Legajo es: " + Empleado.devuelveProximoLegajo());
	}
}
