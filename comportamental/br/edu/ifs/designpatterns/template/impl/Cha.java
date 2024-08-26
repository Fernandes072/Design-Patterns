package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cha extends Bebida{

	@Override
	protected List<String> meio() {
		List<String> meio = new ArrayList<>();
		meio.add("Adicionar um sachê de chá");
		return meio;
	}
	
}
