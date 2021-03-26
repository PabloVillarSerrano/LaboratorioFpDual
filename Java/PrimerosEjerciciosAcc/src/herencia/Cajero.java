package herencia;

import java.text.SimpleDateFormat;

//Este es el nieto de Persona. El limite de lo recomendado. 
public class Cajero extends Empleado{
	
	public Cajero(String tratamiento, String nombre) {
		super(tratamiento, nombre);
	}
	
	@Override
	public void imprimirEdad() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(edad));
	}
	@Override
	public void imprimirNombre() {
		String[] partes = super.nombre.split(" ");
		System.out.println(partes[0] + " Cajero " + partes[1]);
	}
	public void imprimirTodo() {
		imprimirNombre();
		imprimirEdad();
	}
}
