package herencia1;

public class Test {

	public static void main(String[] args) {
		
		ProdCong pc = new ProdCong("pasado", "0001", "prodcong1");
		ProdFresc pf = new ProdFresc("el jueves ", "0002", "prodfresc1", "Esp");
		ProdRefrig pr = new ProdRefrig("en 3 dias", "0003", "prodrefrig1", "Acc");

		
		pc.imprimirProd();
		pf.imprimirProd();
		pr.imprimirProd();
		
		pc.setTempRec(5);
		pc.imprimirProd();



	}

}
