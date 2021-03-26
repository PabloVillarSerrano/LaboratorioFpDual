package herencia;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Empleado("Sr.", "Pablo");
		Empleado persona2 = new Empleado("Sra.","Vicky");
		Empleado persona3 = new Cajero("Sra.","Lucia");
		Cajero persona4 = new Cajero("Sr.","Guille");
		
		System.out.println(persona.getNombre());
		System.out.println("\n===========\n");
		
		persona2.imprimirNombre();		
		System.out.println(persona2.getNombre());
		persona2.imprimirEdad();
		
		System.out.println("\n===========\n");
		persona3.imprimirEdad();
		persona3.imprimirNombre();
		
		System.out.println("\n===========\n");
		persona4.imprimirTodo();

	
		
	}

}
