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
		
		Empleado emp4 = new Empleado();
		emp4.setDni("40.123.456");
		emp4.setNombre("Lucia");
		emp4.setApellido("Fernandez");
		emp4.setFechaNacimiento(LocalDate.of(1997, 3, 14));
		emp4.setGenero("Femenino");
		emp4.setDireccion("Av. Rivadavia 2450");
		emp4.setTelefono("11-4567-8901");
		emp4.setEmail("lucia.fernandez@utnfrgp.com");
		emp4.setPuesto("Analista administrativa");

		Empleado emp5 = new Empleado();
		emp5.setDni("38.765.432");
		emp5.setNombre("Martin");
		emp5.setApellido("Gomez");
		emp5.setFechaNacimiento(LocalDate.of(1994, 8, 22));
		emp5.setGenero("Masculino");
		emp5.setDireccion("Calle Moreno 875");
		emp5.setTelefono("11-4321-6789");
		emp5.setEmail("martin.gomez@utnfrgp.com");
		emp5.setPuesto("Soporte tecnico");
		
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());
		
		System.out.println("El proximó Legajo es: " + Empleado.devuelveProximoLegajo());
	}
}
