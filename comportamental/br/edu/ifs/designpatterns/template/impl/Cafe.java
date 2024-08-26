package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cafe extends Bebida{

	@Override
	protected List<String> meio() {
		List<String> meio = new ArrayList<>();
		meio.add("Adicionar uma colher de café");
		return meio;
	}

}
