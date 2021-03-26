package herencia2;

public class Empleado {
	
	String nomApe;
	String dni;
	//Tendrá que estar entre 18 y 45
	int edad;
	boolean casado;
	double salario;
	
	//Constructor sin parametros de entrada
	public Empleado() {
	}


	//Constructor con parametros de entrada
	public Empleado(String nomApe, String dni, int edad, boolean casado, double salario) {
		this.nomApe = nomApe;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public String clasificacion() {
		
		edad=getEdad();
		
		if(edad<=21) {
			return "Principiante";
		}
		else if(edad>=22 && edad <=35) {
			return "Intermedio";
		}
		else
			return "Senior";
	}
	
	
	public void imprimirEmp() {
		System.out.println("Empleado con nombre: " +nomApe+ 
				"\n dni: " +dni+
				"\n edad: " +edad+
				"\n salario: " +salario+
				"\n casado: " +casado+
				"\n clasificacion: " +clasificacion());
	}
	
	public void aumentSal(double porcentaje) {
		salario+=(salario*porcentaje);
	}
	
	public String getNomApe() {
		return nomApe;
	}


	public void setNomApe(String nomApe) {
		this.nomApe = nomApe;
	}


	public String getCedula() {
		return dni;
	}


	public void setCedula(String cedula) {
		this.dni = cedula;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	
}
