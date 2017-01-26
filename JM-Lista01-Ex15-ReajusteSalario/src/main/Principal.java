package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Salario c = new Salario();
		
		Scanner l = new Scanner(System.in);
		
		System.out.print("Informe seu Salario...:");
		Double resp = l.nextDouble();
		
		c.reajusteSalario(resp);
		
		l.close();
		

	}

}
