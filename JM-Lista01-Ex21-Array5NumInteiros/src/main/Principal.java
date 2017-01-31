package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vt = new Vetor();
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[5];
		
		
		for(int i = 0; i < 5; i++){
			
			System.out.print("Digite o " + i + "* numero...: ");
			vetor[i] = leitor.nextInt();
		}
		
		vt.lerVetor(vetor);
		
		leitor.close();
		
		
	}

}
