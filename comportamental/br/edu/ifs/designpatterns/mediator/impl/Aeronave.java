package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Aeronave extends Colaborador {

	public Aeronave(String id, Mediador mediador) {
		super(id, mediador);
	}

	public String solicitarDecolagem() {
		return mediador.notificao("Decolagem", this);
	}

	public String solicitarPouso() {
		return mediador.notificao("Pouso", this);
	}
}