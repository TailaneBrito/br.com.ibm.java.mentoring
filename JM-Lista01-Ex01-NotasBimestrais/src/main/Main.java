package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Media4Bimestres m = new Media4Bimestres();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a Nota do Primeiro Bimestre: ");
		double nota1 = leitor.nextDouble();
		
		System.out.print("Digite a Nota do Segunto Bimestre: ");
		double nota2 = leitor.nextDouble();
		
		System.out.print("Digite a nota do Terceiro Bimestre: ");
		double nota3 = leitor.nextDouble();
		
		System.out.print("Digite a nota do Quarto Bimestre: ");
		double nota4 = leitor.nextDouble();
		
		
		System.out.println(m.media(nota1,nota2,nota3,nota4));
		
		
		leitor.close();

	}

}
