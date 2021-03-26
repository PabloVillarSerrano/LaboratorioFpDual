package herencia1;



public class ProdRefrig extends Producto {
	
	String empresaRefrig;

	public ProdRefrig(String caducidad, String nLote, String nombreProd, String empresaRefrig) {
		super(caducidad, nLote, nombreProd);
		this.empresaRefrig=empresaRefrig;
	}
	
	public void imprimirProd() {
		imprimirCad();
		System.out.println("Producto " +super.nombreProd+ " del lote " +super.getnLote()+
				"\n y empresa refrigeradora " +empresaRefrig);
	}

	public String getEmpresaRefrig() {
		return empresaRefrig;
	}

	public void setEmpresaRefrig(String empresaRefrig) {
		this.empresaRefrig = empresaRefrig;
	}
	

}
