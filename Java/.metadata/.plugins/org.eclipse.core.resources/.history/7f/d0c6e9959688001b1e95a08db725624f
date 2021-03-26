package arrays2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Eje2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		List<Integer> numeros = Arrays.asList(6,5,4,2,2);
		
        numeros.stream().forEach(num->{
        	if (comprobar23(num.intValue())==false) {
        		System.out.println("He encontrado un 2 o un 3 en la lista");
        	}
        });

		sc.close();

	}
	
	public static boolean comprobar23(int num) {
		
		if((num==2) || (num==3)) {
			return false;
		}
		else 
			return true;
		
	}

}
