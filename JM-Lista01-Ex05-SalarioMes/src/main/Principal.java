package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite A quantidade de Horas/Mes....:");
		double horas = leitor.nextDouble();
		System.out.print("Digite O valor de suas valor/hora...:");
		double valor = leitor.nextDouble();
		
		System.out.println("Seu salário no fim do mês será: R$" + f1.salario(horas, valor));
		
		leitor.close();
		
	}

}
