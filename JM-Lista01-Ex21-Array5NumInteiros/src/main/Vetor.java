package main;

public class Vetor {
	public int[] vet = new int[5];
	
	public void lerVetor(int[] vet){
		int num;
		
		for(int i=0;i<5;i++){
			num = vet[i];
			System.out.println("Valor na posicao " + i +
					" é = " + num);
		}
	}
}
