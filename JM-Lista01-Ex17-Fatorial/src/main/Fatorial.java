package main;

public class Fatorial {

	public void fator(int num){
		int a = 0;
		int b=0;
		int c= 1;
		System.out.print(num + "! =");
		for(int i=num;i>=1;i--){
			
		    a = i;
		   	b = a * c;
			c = b;
			System.out.print(" " + i);		
		
		}
		
		System.out.println(" = " + c);
	}
	
	public static void main(String[] args) {
		Fatorial f = new Fatorial();
		f.fator(5);
	}
}
