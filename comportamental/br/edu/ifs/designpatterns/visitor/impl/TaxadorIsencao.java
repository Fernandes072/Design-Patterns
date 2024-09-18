package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Taxador;

public class TaxadorIsencao implements Taxador {

	@Override
	public double taxarAlimento(Alimento alimento) {
		return alimento.getCusto();
	}

	@Override
	public double taxarCigarro(Cigarro cigarro) {
		return cigarro.getCusto() * 2.50;
	}

	@Override
	public double taxarCerveja(Cerveja cerveja) {
		return cerveja.getCusto() * 1.15;
	}

	@Override
	public double taxarVinho(Vinho vinho) {
		return vinho.getCusto() * 1.20;
	}
}
