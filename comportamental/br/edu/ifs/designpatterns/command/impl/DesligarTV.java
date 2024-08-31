package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Televisao;

public class DesligarTV implements Comando {
	
	private Televisao televisao;

	public DesligarTV(Televisao televisao) {
		this.televisao = televisao;
	}

	@Override
	public void executar() {
		televisao.desligarTelevisao();
	}

}
