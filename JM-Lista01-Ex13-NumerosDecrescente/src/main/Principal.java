package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
			
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero......");
		double p1= leitor.nextDouble();
		
		System.out.print("Digite o segundo numero.......");
		double p2 = leitor.nextDouble();
		
		System.out.print("Digite o terceiro numero......");
		double p3 = leitor.nextDouble();
		
		ArrayList<Double> lProdutos = new ArrayList<>();	
		lProdutos.add(p1);
		lProdutos.add(p2);
		lProdutos.add(p3);
				
		NumDecrescente i = new NumDecrescente();	
		i.calcNumDecrescente(lProdutos);
		
		leitor.close();
		
	}

}
