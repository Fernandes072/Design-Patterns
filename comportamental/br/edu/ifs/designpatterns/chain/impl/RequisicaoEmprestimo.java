package br.edu.ifs.designpatterns.chain.impl;

public class RequisicaoEmprestimo {
	
	private int valor;
	private int renda;
	private int score;
	
	public RequisicaoEmprestimo(int valor, int renda, int score) {
		this.valor = valor;
		this.renda = renda;
		this.score = score;
	}

	public int getValor() {
		return valor;
	}

	public int getRenda() {
		return renda;
	}

	public int getScore() {
		return score;
	}

}
