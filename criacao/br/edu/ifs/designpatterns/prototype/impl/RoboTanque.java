package br.edu.ifs.designpatterns.prototype.impl;

import br.edu.ifs.designpatterns.prototype.Robo;

public class RoboTanque extends Robo {

	public RoboTanque(int municao, int dano, String arma) {
		super(municao, dano, arma);
	}

	public RoboTanque(RoboTanque robo) {
		super(robo);
	}

	public Robo clonar() {
		return new RoboTanque(this);
	}
}
