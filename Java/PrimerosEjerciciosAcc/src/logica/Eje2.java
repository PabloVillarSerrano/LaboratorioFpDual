package logica;

import java.util.Scanner;

public class Eje2 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String alumno = null;
		
		System.out.println("Escribe el nombre del alumno sin ningun numero");
		alumno = sc.nextLine();
		
		while (Eje3.contieneNum(alumno)) {
			System.out.println("Tu alumno contiene un num");
			alumno = sc.nextLine();
			Eje3.cont++;
		}

		System.out.println("Lo has intentado sin exito " +Eje3.cont+ " veces");

		System.out.println("Alumno: " +alumno);
		
		sc.close();
	}
	public static boolean contieneNum(String alum) {
		return alum.contains("1")||alum.contains("2")||
				alum.contains("3")||alum.contains("4")||
				alum.contains("5")||alum.contains("6")||
				alum.contains("7")||alum.contains("8")||
				alum.contains("9")||alum.contains("0");
	}
}
