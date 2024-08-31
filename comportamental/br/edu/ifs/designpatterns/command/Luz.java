package br.edu.ifs.designpatterns.command;

public class Luz {
	
	private String comodo;
	private boolean estaLigada;

	public Luz(String comodo) {
		this.comodo = comodo;
	}

	public boolean estaLigada() {
		return estaLigada;
	}
	
	public void ligarLuz() {
		estaLigada = true;
	}
	
	public void desligarLuz() {
		estaLigada = false;
	}

}
