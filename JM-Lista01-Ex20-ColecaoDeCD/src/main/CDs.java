package main;

import java.util.ArrayList;

public class CDs {
	public String nome;
	public double valor;
	//public int quantidade; 
	
	private static double valorTotal;
	private static int contador;
	
	public CDs(String n, double v){
		//CDs cd ;
		setNome(n);
		setValor(v);
		
		valorTotal += valor;
		contador++;
		
				
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public void colecaoCD(CDs cd){	
		ArrayList<CDs> c = new ArrayList<>();
		c.add(cd);
	}
	
	private double mediaCD(){
		return  (valorTotal / contador);
	}
	
	public void verColecao(){
		System.out.println("Total investido na colecao de " + contador + " CDs .....: " + valorTotal);
		System.out.println("Media do valor por CD ...................: " + mediaCD());
	}
}	
