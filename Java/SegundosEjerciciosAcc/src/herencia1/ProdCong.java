package herencia1;


public class ProdCong extends Producto {
	
	int tempRec;

	public ProdCong(String caducidad, String nLote, String nombreProd) {
		super(caducidad, nLote, nombreProd);
		this.tempRec=0;
	}
	
	public void imprimirProd() {
		imprimirCad();
		System.out.println("Producto " +super.nombreProd+ " del lote " +super.getnLote()+
				"\n y temperatura recomendada " +tempRec+ " �C");
	}

	public int getTempRec() {
		return tempRec;
	}

	public void setTempRec(int tempRec) {
		this.tempRec = tempRec;
	}
	

}
