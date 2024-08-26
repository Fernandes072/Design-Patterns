package br.edu.ifs.designpatterns.template;

import java.util.ArrayList;
import java.util.List;

public abstract class Bebida {

	public List<String> obterPreparo() {
		List<String> preparo = new ArrayList<>();
		preparo.addAll(inicio());
		preparo.addAll(meio());
		preparo.addAll(fim());
		return preparo;
	}

	private List<String> inicio() {
		List<String> inicio = new ArrayList<>();
		inicio.add("Preparar uma xícara");
		return inicio;
	}

	protected abstract List<String> meio();

	private List<String> fim() {
		List<String> fim = new ArrayList<>();
		fim.add("Adicionar água quente");
		return fim;
	}
	

}
