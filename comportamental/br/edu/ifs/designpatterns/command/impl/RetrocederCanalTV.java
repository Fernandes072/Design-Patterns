package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Televisao;

public class RetrocederCanalTV implements Comando {
	
	private Televisao televisao;

	public RetrocederCanalTV(Televisao televisao) {
		this.televisao = televisao;
	}

	@Override
	public void executar() {
		televisao.retrocederCanal();
	}
	
}
