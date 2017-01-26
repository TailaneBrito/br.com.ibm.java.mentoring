package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner lsexo = new Scanner(System.in);
		System.out.print("Digite F para Mulher e M para Homem.....:");
		String sexo = lsexo.next();
		
		String nsexo = sexo.toUpperCase();
		//System.out.println(nsexo.equals("F")||nsexo.equals("M"));
		
		while(!(nsexo.equals("F") || nsexo.equals("M"))){
			System.out.print("Digite F para Mulher e M para Homem.....:");
			sexo = lsexo.next();			
		}
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a sua altura...:");
		double altura = leitor.nextDouble();
		
		System.out.print("Digite a seu peso.....:");
		double peso = leitor.nextDouble();
		
		IMC i = new IMC();	
		i.calcPesoIdeal(nsexo,altura, peso);
		
		leitor.close();
		lsexo.close();
	}

}
