package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConverterGraus cv = new ConverterGraus();
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor em Farenheit..: ");
		double fa = leitor.nextDouble();
		
		System.out.println("O valor em Celsius é " + cv.convFaparaCel(fa));
		
		leitor.close();
	}

}
