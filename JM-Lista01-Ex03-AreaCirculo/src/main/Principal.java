package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCirculo a1 = new AreaCirculo();
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o Raio do C�rculo ");
		double raio = leitor.nextDouble();
		
        System.out.println("A �rea do Circulo � : " + a1.calculaAreaCirculo(raio));
		
		leitor.close();
	}

}
