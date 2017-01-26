package main;

public class DoisNIntUmNReal {
	int n1, n2;
	float n3;
	
		
	public float prodDobrPriMetSeg(){
		float dobro = 0;
		float metade = 0;
		dobro = n1*2;
		metade = n2/2;
		
		float prod = dobro + metade;
		
		return prod;
		
	}
	
	public float somTriPriTer(){
		float som = (n1*3) + n3;
		
		return som;
		
	}
	
	public float terCub(){
		return (float) Math.pow(n3, 3);
		
	}
}
