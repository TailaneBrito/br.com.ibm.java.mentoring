package main;

public class Vetor {
	public int[] vet = new int[10];
	
	public void lerVetor(int[] vet){
		int num;
		
		for(int i=9;i>=0;i--){
			num = vet[i];
			
			System.out.println("Valor na posicao " + i +
					" é = " + num);			
		}
	}
}
