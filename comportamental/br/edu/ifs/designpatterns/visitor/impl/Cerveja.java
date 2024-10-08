package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Mercadoria;
import br.edu.ifs.designpatterns.visitor.Taxador;

public class Cerveja extends Mercadoria {

	public Cerveja(double custo) {
		super(custo);
	}

	@Override
	public Double aceitar(Taxador taxador) {
		return taxador.taxarCerveja(this);
	}
}
