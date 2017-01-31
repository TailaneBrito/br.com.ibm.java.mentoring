package main;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDs cd1 = new CDs("2ne1",15);
		CDs cd2 = new CDs("Sandy&Junior",15);
		CDs cd3 = new CDs("Sandy&Junior",95);
		CDs cd4 = new CDs("Sandy&Junior",15);
		CDs cd5 = new CDs("Sandy&Junior",15);
		
		cd1.colecaoCD(cd1);
		cd2.colecaoCD(cd2);
		cd3.colecaoCD(cd3);
		cd4.colecaoCD(cd4);
		cd5.colecaoCD(cd5);
		
		cd5.verColecao();
	}

}
