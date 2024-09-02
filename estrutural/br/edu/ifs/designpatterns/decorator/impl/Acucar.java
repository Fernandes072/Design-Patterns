package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Acucar implements Component {

	private Component component;

	public Acucar(Component component) {
		this.component = component;
	}

	@Override
	public double custo() {
		return 0.3 + component.custo();
	}

	@Override
	public String getDescricao() {
		return component.getDescricao() + ", com açúcar";
	}

}
