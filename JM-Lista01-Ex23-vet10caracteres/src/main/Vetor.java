package main;

public class Vetor {
	String[] vetor = new String[]{"a","b","c","d","e","f","g","h","i","j"};
	private String[] consoante = new String[10];
	private String[] vogal = new String[10];
	private String vg=0;
	private String cs=0;
	private int ctv=0;
	private int ctc=0;
	
	public void vogConso(int[] vt){
		vetor = vt;
	
		for(int i=0; i< 10; i++){
			
			if(vetor[i].equals("a") || vetor[i].equals("e") || vetor[i].equals("i") || vetor[i].equals("o") || vetor[i].equals("u") ){
				vg = vetor[i];
				vogal[] = vg;
				
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
