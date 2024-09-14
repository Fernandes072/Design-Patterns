package br.edu.ifs.designpatterns.memento.impl;

public class Jogo {

	private int saude;
	private int vidas;

	public Jogo(int saude, int vida) {
		this.saude = saude;
		this.vidas = vida;
	}

	public Jogo() {
		saude = 100;
		vidas = 3;
	}

	public Jogo salvar() {
		return new Jogo(saude, vidas);
	}

	public void causarDano(int dano) {
		saude -= dano;
		if (saude < 1) {
			vidas--;
			saude = 100;
		}
		if (vidas == 0) {
			throw new IllegalStateException("Fim de Jogo");
		}
	}

	public void restaurar(Jogo save) {
		saude = save.saude;
		vidas = save.vidas;
	}

	@Override
	public String toString() {
		return "{saúde: " + saude + ", vidas: " + vidas + "}";
	}
}
