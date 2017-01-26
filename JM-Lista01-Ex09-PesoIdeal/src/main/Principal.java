package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a sua altura...:");
		double altura = leitor.nextDouble();
		
		System.out.print("Digite a seu peso.....:");
		double peso = leitor.nextDouble();
		
		IMC i = new IMC();	
		i.calcPesoIdeal(altura, peso);
		
		leitor.close();
	}

}
