package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Luz;

public class LigarLuz implements Comando {

	private Luz luz;

	public LigarLuz(Luz luz) {
		this.luz = luz;
	}

	@Override
	public void executar() {
		luz.ligarLuz();
	}
	
	@Override
	public String toString() {
		return "ligar " + luz.getComodo();
	}
}
