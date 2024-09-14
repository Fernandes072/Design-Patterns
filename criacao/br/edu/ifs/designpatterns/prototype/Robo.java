package br.edu.ifs.designpatterns.prototype;

public abstract class Robo {

	private int municao;
	private int dano;
	private String arma;

	public Robo(int municao, int dano, String arma) {
		this.municao = municao;
		this.dano = dano;
		this.arma = arma;
	}
	
	public Robo(Robo robo) {
		this.municao = robo.municao;
		this.dano = robo.dano;
		this.arma = robo.arma;
	}

	public abstract Robo clonar();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Robo && obj != null) {
			Robo robo = (Robo) obj;
			return municao == robo.municao && dano == robo.dano && arma.equals(robo.arma);
		}
		return false;
	}
}
