package Dominio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		emp1.setDni("40.123.456");
		emp1.setNombre("Lucia");
		emp1.setApellido("Fernandez");
		emp1.setFechaNacimiento(LocalDate.of(1997, 3, 14));
		emp1.setGenero("Femenino");
		emp1.setDireccion("Av. Rivadavia 2450");
		emp1.setTelefono("11-4567-8901");
		emp1.setEmail("lucia.fernandez@utnfrgp.com");
		emp1.setPuesto("Analista administrativa");

		Empleado emp2 = new Empleado();
		emp2.setDni("38.765.432");
		emp2.setNombre("Martin");
		emp2.setApellido("Gomez");
		emp2.setFechaNacimiento(LocalDate.of(1994, 8, 22));
		emp2.setGenero("Masculino");
		emp2.setDireccion("Calle Moreno 875");
		emp2.setTelefono("11-4321-6789");
		emp2.setEmail("martin.gomez@utnfrgp.com");
		emp2.setPuesto("Soporte tecnico");

		Empleado emp3 = new Empleado("42.345.678", "Sofia", "Martinez",
				LocalDate.of(1999, 11, 5), "Femenino", "Av. Cabildo 1560",
				"11-5678-1234", "sofia.martinez@utnfrgp.com", "Disenadora grafica");

		Empleado emp4 = new Empleado("36.987.654", "Diego", "Ramirez",
				LocalDate.of(1991, 6, 17), "Masculino", "Calle Belgrano 430",
				"11-6789-2345", "diego.ramirez@utnfrgp.com", "Contador");

		Empleado emp5 = new Empleado("41.876.543", "Valentina", "Lopez",
				LocalDate.of(1998, 1, 29), "Femenino", "Av. San Martin 3200",
				"11-7890-3456", "valentina.lopez@utnfrgp.com", "Recursos humanos");

		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());
		System.out.println("El proximó Legajo es:"+Empleado.devuelveProximoLegajo());
	}
}
