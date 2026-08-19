package Dominio;

import java.time.LocalDate;

public class Empleado extends Persona {
	private final int legajo = 0000;
	private String puesto;
	
	// Variable static
	static int cont = 1000;
	
	//Constructors
	
	public Empleado()
	{
		super();
		puesto = " Sin Puesto! ";
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto)
	{
		super(dni,nombre,apellido,fechaNacimiento,genero,direccion,telefono,email);
		this.puesto = puesto;
	}
	
	
	// setter y getter
	
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
	    return " es el empleado con legajo = " + legajo + ", con el puesto de " + puesto;
	}
}
