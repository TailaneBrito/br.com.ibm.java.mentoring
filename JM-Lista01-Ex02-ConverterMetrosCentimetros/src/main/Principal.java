package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConversaoMetrosCentimetros m1 = new ConversaoMetrosCentimetros();
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o Valor em Métros : ");
		double metros = leitor.nextDouble();
		
		System.out.println(metros + " metros equivalem a " + m1.convMetrosCentimetros(metros) + " centrimetros ");
		
		leitor.close();

	}

}
