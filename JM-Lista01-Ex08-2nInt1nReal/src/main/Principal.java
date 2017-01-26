package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoisNIntUmNReal d = new DoisNIntUmNReal();
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor de n1..: ");
		d.n1 = leitor.nextInt();
		System.out.print("Digite o valor de n2..: ");
		d.n2 = leitor.nextInt();
		System.out.print("Digite o valor de n3..: ");
		d.n3 = leitor.nextFloat();
		
		System.out.println("n1 "+ d.n1 + " n2 " + d.n2 + " n3 " + d.n3 );
		
		System.out.println("o produto do dobro do primeiro com metade do segundo");
		System.out.println(d.prodDobrPriMetSeg());
		
		System.out.println("a soma do triplo do primeiro com o terceiro.");
		System.out.println(d.somTriPriTer());
		
		System.out.println("o terceiro elevado ao cubo.");
		System.out.println(d.terCub());
		leitor.close();
	}

}
