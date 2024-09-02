package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Creme implements Component {
	
	private Component component;

	public Creme(Component component) {
		this.component = component;
	}

	@Override
	public double custo() {
		return 1 + component.custo();
	}

	@Override
	public String getDescricao() {
		return component.getDescricao() + ", com creme";
	}

}
