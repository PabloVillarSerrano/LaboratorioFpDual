package herencia2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Programador e2 = new Programador("Pablo Villar", "1234567G", 25, false, 1000, 60, "JAVA");

		e2.imprimirProg();
		e2.aumentSal(0.5);
		e2.imprimirProg();
		
		e2.setLenguajeDominante("PYTHON");
		e2.imprimirProg();
		
		Programador e3 = new Programador();
		
		System.out.println("Introduca nombre");
		e3.setNomApe(sc.next());
		System.out.println("Introduca dni");
		e3.setCedula(sc.next());
		System.out.println("Introduca edad");
		e3.setEdad(sc.nextInt());
		System.out.println("Introduca casado (true/false)");
		e3.setCasado(sc.nextBoolean());
		System.out.println("Introduca salario");
		e3.setSalario(sc.nextDouble());
		System.out.println("Introduca lineas de cod / hora");
		e3.setLineasDeCodigoPorHora(sc.nextInt());
		System.out.println("Introduca cod dominante");
		e3.setLenguajeDominante(sc.next());

		e3.imprimirProg();

		
		
		
		sc.close();

	}

}
