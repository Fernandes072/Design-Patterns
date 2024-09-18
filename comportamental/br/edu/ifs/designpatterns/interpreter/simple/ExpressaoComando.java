package br.edu.ifs.designpatterns.interpreter.simple;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.interpreter.Expressao;

public class ExpressaoComando implements Expressao {

	private Comando comando;

	public ExpressaoComando(Comando comando) {
		this.comando = comando;
	}

	@Override
	public Object interpretar() {
		comando.executar();
		return null;
	}
	
	@Override
	public String toString() {
		return comando.toString();
	}
}
