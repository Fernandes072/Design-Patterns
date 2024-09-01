package br.edu.ifs.designpatterns.composite.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.composite.Componente;

public class Combo extends Componente {
	
	List<Componente> componentes;

	public Combo(String nome) {
		super(nome);
		componentes = new ArrayList<>();
	}

	@Override
	public double calcularPreco() {
		double total = 0;
		for (Componente componente : componentes) {
			total += componente.calcularPreco();
		}
		return total;
	}

	public void adicionar(Componente componente) {
		componentes.add(componente);
	}

}
