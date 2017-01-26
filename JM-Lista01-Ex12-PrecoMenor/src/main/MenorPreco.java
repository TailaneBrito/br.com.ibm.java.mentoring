package main;

import java.util.ArrayList;


public class MenorPreco {

	public void calcMenorPreco(ArrayList<Double> produtos){
	  
		double min = produtos.get(0);
		double max = produtos.get(0);
		
		
		for (int i = 0; i < produtos.size(); i++) {
			double num = produtos.get(i);
			
			if(num < min) min = num;
			if(num > max) max = num;
			
		}
		
		System.out.println("Voce deve comprar o produto de valor " + min);
		System.out.println("Voce deve comprar o produto de maior " + max);
		
		
	}
}
