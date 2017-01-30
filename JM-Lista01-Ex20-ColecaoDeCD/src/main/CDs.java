package main;

import java.util.TreeMap;

public class CDs {
	public String nome;
	public double valor;
	public int quantidade;
	
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void colecaoCD(String nome, int quantidade, double valor){
		TreeMap t  = new TreeMap();
	}
