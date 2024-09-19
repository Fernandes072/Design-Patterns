package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Metereologia extends Colaborador {

	private boolean condicoesFavoraveis;

	public Metereologia(String id, Mediador mediador) {
		super(id, mediador);
		condicoesFavoraveis = false;
	}

	public void setCondicoesFavoraveis(boolean condicoesFavoraveis) {
		this.condicoesFavoraveis = condicoesFavoraveis;
	}

	public boolean getCondicoesFavoraveis() {
		return condicoesFavoraveis;
	}

	public String condicao() {
		if (condicoesFavoraveis) {
			return "autorizada";
		} else {
			return "negada";
		}
	}

	public String informarCondicoes() {
		return mediador.notificao("", this);
	}
}