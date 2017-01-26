package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntoDeNumeros {

	public void MenorMaiorSomaNum(ArrayList<Double> lista) {

		double min = lista.get(0);
		double max = lista.get(0);
		double sum=0;

		for (int i = 0; i < lista.size(); i++) {
			double num = lista.get(i);
			
			if (num < min)
				min = num;
			if (num > max)
				max = num;
			
			sum += lista.get(i);

		}
		
		System.out.println("Maior valor da lista        : " + max);
		System.out.println("Menor valor da lista        : " + min);
		System.out.println("Soma dos valores max+min    : " + (max + min));
		System.out.println("Soma da lista toda          : " + (sum));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoDeNumeros cj = new ConjuntoDeNumeros();
		Scanner l = new Scanner(System.in);
		ArrayList<Double> lista = new ArrayList<>();
		double n;
		
		do{
		
		System.out.println("Digite numeros, para sair digite 0");
		n = l.nextDouble();
		if(n!=0){
		lista.add(n);
		}
		
		}while(n != 0);
			
	
		
		cj.MenorMaiorSomaNum(lista);
		
		System.out.println("Programa finalizado");
		l.close();
		
		
		
		

	}

}
