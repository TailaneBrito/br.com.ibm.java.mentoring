package main;

public class Vetor {
	public int[] vetor = new int[20];
	private int[] par = new int[10];
	private int[] impar = new int[10];
	private int contpar=0;
	private int contimpar=0;
	
	public void parImpar(int[] vt){
		vetor = vt;
	
		for(int i=0; i< 20; i++){
			
			if(vetor[i]%2==0){
				System.out.println(vetor[i] + " par");
				par[contpar] = vetor[i];
				contpar++;
			}else{
				System.out.println(vetor[i] + " impar ");
				impar[contimpar] = vetor[i];
				contimpar++;
			}
			
		}
		
	}
	
	public int[] mostraPar(){
		
		return par;
		
	}
	
	public int[] mostrarImpar(){
		
		return impar;
	}
	
}
