package herencia;

public class MainBoton {

	public static final String CONSTANTE= "A";

	public static void main(String[] args) {
		
		PrimerBoton primerBoton = new PrimerBoton("Primer");
		SegundoBoton segundoBoton = new SegundoBoton("Segundo");
		BotonSubmit botonSubmit = new BotonSubmit("Submit");

		//EventoRaton evento = new PrimerBoton("");
		
		primerBoton.llenaCampo("Nombre persona");
		primerBoton.llenaCampo("Apellidos persona");
		botonSubmit.llenaCampo(" ");
		
		primerBoton.registrarLog();
		botonSubmit.registrarLog();
		
		primerBoton.cierraPantalla();
		botonSubmit.submitFormulario("Nombre","Apellidos");

	}

}
