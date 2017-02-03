package main;

public class Principal {
	public static void main(String[] args) {
		int[] vt2 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] vpar = new int[10];
		int[] vimpar = new int[10];
		Vetor v = new Vetor();	
			
		v.parImpar(vt2);
		
		vpar = v.mostraPar();
		vimpar = v.mostrarImpar();
		
		System.out.println("\n par");
		for(int i = 0; i < 10; i++){
			System.out.print(vpar[i] + " ");
		}
		System.out.println("\n impar");
		for(int i = 0; i < 10; i++){
			System.out.print(vimpar[i] + " ");
		}
		
		
		
	}
}
