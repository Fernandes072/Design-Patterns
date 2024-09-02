package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Cafe implements Component {

	public Cafe() {
	}

	@Override
	public double custo() {
		return 4;
	}

	@Override
	public String getDescricao() {
		return "Café";
	}

}
