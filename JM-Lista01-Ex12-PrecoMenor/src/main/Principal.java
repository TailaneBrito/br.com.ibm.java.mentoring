package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
			
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o proco do produto 1 ...");
		double p1= leitor.nextDouble();
		
		System.out.print("Digite o proco do produto 2 ...");
		double p2 = leitor.nextDouble();
		
		System.out.print("Digite o proco do produto 3 ...");
		double p3 = leitor.nextDouble();
		
		ArrayList<Double> lProdutos = new ArrayList<>();	
		lProdutos.add(p1);
		lProdutos.add(p2);
		lProdutos.add(p3);
				
		MenorPreco i = new MenorPreco();	
		i.calcMenorPreco(lProdutos);
		
		leitor.close();
		
	}

}
