package herencia;

import java.util.Date;

public class Persona {
	
	String tratamiento;
	String nombre;
	Date edad;
	
	public Persona(String tratamiento, String nombre, Date edad) {
		this.tratamiento=tratamiento;
		this.nombre=nombre;
		this.edad=edad;
	}

	//los getters y setters tambien los puedo modificar
	public String getNombre() {
		return tratamiento + " " + nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getEdad() {
		return edad;
	}

	public void setEdad(Date edad) {
		this.edad = edad;
	}
	
	
}
