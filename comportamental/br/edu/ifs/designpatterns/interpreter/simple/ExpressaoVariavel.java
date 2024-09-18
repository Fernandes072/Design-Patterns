package br.edu.ifs.designpatterns.interpreter.simple;

import java.time.LocalTime;

import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.composed.ExpressaoTermo;

public class ExpressaoVariavel extends ExpressaoTermo implements Expressao {
	
	private String variavel;
	private LocalTime horaAtual;

	public ExpressaoVariavel(String variavel, LocalTime horaAtual) {
		this.variavel = variavel;
		this.horaAtual = horaAtual;
	}

	@Override
	public Object interpretar() {
		return horaAtual;
	}
	
	@Override
	public String toString() {
		return variavel;
	}
}
