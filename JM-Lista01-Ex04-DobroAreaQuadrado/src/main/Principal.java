package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrado q = new Quadrado();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = leitor.nextDouble();
		
		q.areaQuadrado(lado);
		System.out.println("O dobro da área é : " + q.dobroAreaQuadrado());
		
		leitor.close();
		

	}

}
