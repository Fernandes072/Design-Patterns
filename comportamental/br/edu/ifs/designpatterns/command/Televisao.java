package br.edu.ifs.designpatterns.command;

public class Televisao {
	
	private String comodo;
	private boolean estaLigada;
	private int canal;

	public Televisao(String comodo) {
		this.comodo = comodo;
		this.canal = 1;
	}
	
	public boolean estaLigada() {
		return estaLigada;
	}
	
	public void ligarTelevisao() {
		estaLigada = true;
	}
	
	public void desligarTelevisao() {
		estaLigada = false;
	}
	
	public void avancarCanal() {
		verificarEstado();
		canal++;
	}
	
	public void retrocederCanal() {
		verificarEstado();
		canal--;
	}
	
	public int getCanal() {
		return canal;
	}
	
	private void verificarEstado() {
		if (!estaLigada) {
			throw new IllegalStateException("Televisão desligada");
		}
	}

}
