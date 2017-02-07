package main;

import java.util.Scanner;

public class Fibonacci {

	public void fibo(int num){
		int n1=1, n2, fibo=0;
		
		System.out.print(1 + " ");
		for (int i = 1; i <= num ; i++) {
			n2 = n1;
			n1 = fibo;
			fibo = n2 + n1;
			
			System.out.print(fibo + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.println("Digite um numero ");
		int n = l.nextInt();
		
		Fibonacci f = new Fibonacci();
		f.fibo(n);
		
		l.close();

	}

}
