package br.edu.ifs.designpatterns.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Oficina extends Colaborador {

	private List<Aeronave> aeronaves;

	public Oficina(String id, Mediador mediador) {
		super(id, mediador);
		aeronaves = new ArrayList<>();
	}

	public void adicionar(Aeronave aeronave) {
		aeronaves.add(aeronave);
	}

	public List<Aeronave> getAeronaves() {
		return aeronaves;
	}
}