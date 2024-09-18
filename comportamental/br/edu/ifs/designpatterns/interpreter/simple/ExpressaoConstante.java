package br.edu.ifs.designpatterns.interpreter.simple;

import java.time.LocalTime;

import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.composed.ExpressaoTermo;

public class ExpressaoConstante extends ExpressaoTermo implements Expressao {
	
	private LocalTime horaProgramada;

	public ExpressaoConstante(LocalTime horaProgramada) {
		this.horaProgramada = horaProgramada;
	}

	@Override
	public Object interpretar() {
		return horaProgramada;
	}
	
	@Override
	public String toString() {
		return horaProgramada.toString();
	}
}
