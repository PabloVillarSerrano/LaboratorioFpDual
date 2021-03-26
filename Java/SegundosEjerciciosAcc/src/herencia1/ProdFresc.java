package herencia1;



public class ProdFresc extends Producto {
	
	String paisOrig;

	public ProdFresc(String caducidad, String nLote, String nombreProd, String pais) {
		super(caducidad, nLote, nombreProd);
		this.paisOrig=pais;
	}
	
	public void imprimirProd() {
		imprimirCad();
		System.out.println("Producto " +super.nombreProd+ " del lote " +super.getnLote()+
				"\n y pais de origen " +paisOrig);
	}

	public String getPaisOrig() {
		return paisOrig;
	}

	public void setPaisOrig(String paisOrig) {
		this.paisOrig = paisOrig;
	}


}
