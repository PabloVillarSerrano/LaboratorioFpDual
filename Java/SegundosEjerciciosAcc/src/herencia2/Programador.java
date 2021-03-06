package herencia2;

public class Programador extends Empleado {
	
	int lineasDeCodigoPorHora;
	String lenguajeDominante;
	
	
	
	public Programador() {
		super();
	}
	public Programador(String nomApe, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nomApe, dni, edad, casado, salario);
		this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
		this.lenguajeDominante=lenguajeDominante;
	}
	
	
	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public void imprimirProg() {
		imprimirEmp();
		System.out.println("\n Programador con lineas/hora: " +lineasDeCodigoPorHora+ " especializado en  " +lenguajeDominante);
				
	}

}
