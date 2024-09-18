package br.edu.ifs.designpatterns.interpreter.composed;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.simple.ExpressaoComando;

public class ExpressaoSequencial implements Expressao {

	private List<ExpressaoComando> expressaoComandos;

	public ExpressaoSequencial() {
		expressaoComandos = new ArrayList<>();
	}

	public void addExpressao(ExpressaoComando expressaoComando) {
		expressaoComandos.add(expressaoComando);
	}

	@Override
	public Object interpretar() {
		for (ExpressaoComando expressaoComando : expressaoComandos) {
			expressaoComando.interpretar();
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (ExpressaoComando expressaoComando : expressaoComandos) {
			s.append("\t");
			s.append(expressaoComando);
			s.append("\n");
		}
		return s.toString();
	}
}
