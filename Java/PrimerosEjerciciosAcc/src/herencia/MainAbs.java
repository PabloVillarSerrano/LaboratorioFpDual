package herencia;

public class MainAbs {

	public static void main(String[] args) {
		
		ClaseAbstracta clase = new HerenciaAbstract();
		HerenciaAbstract clase2 = new HerenciaAbstract();

		clase.imprimir();
		clase.imprimirAbstract();
		
		System.out.println("\n===========\n");
		clase2.imprimir();
		clase2.imprimirAbstract();
		
		EjemploFinal ejemplo1 = new EjemploFinal("Ejemplo");
		EjemploFinal ejemplo2 = new EjemploFinal(null);
		
		

	}

}
