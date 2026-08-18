package Dominio;

public class Empleado extends Persona {
	private final int legajo;
	private String puesto;
	
	static int cont = 1000;
	
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
