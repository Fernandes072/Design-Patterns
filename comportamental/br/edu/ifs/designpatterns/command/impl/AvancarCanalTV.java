package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Televisao;

public class AvancarCanalTV implements Comando {
	
	private Televisao televisao;

	public AvancarCanalTV(Televisao televisao) {
		this.televisao = televisao;
	}

	@Override
	public void executar() {
		televisao.avancarCanal();
	}
	
}
