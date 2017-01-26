package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cumprimentos c = new Cumprimentos();
		
		Scanner l = new Scanner(System.in);
		
		System.out.println("Qual turno você estuda?");
		System.out.println("Digite M [matutino], V [vespertino] ou N [noturno]");
		String resp = l.next();
		
		c.verTurno(resp);
		
		l.close();
		

	}

}
