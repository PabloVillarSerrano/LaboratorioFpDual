package herencia;

public class PrimerBoton extends AbstractBoton implements EventoPantalla, EventoRaton{

	public PrimerBoton(String nombreBoton) {
		super.nombreBoton = nombreBoton;
	}
	
	@Override
	public void llenaCampo(String campo) {
		System.out.println("llenando campo: "+campo);
	}
	
	@Override
	public void cierraPantalla() {
		System.out.println("cerrando pantalla");
	}
	
	@Override
	public boolean registrarLog() {
		System.out.println("Registrando en el log... o no :)");
		return true;
	}
	
	
}
