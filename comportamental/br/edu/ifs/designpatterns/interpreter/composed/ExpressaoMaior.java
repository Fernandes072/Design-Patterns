package br.edu.ifs.designpatterns.interpreter.composed;

import java.time.LocalTime;

import br.edu.ifs.designpatterns.interpreter.Expressao;

public class ExpressaoMaior extends ExpressaoTermo implements Expressao {
	
	private ExpressaoTermo variavel;
	private ExpressaoTermo constante;

	public ExpressaoMaior(ExpressaoTermo variavel, ExpressaoTermo constante) {
		this.variavel = variavel;
		this.constante = constante;
	}



	@Override
	public Object interpretar() {
		LocalTime variavel = (LocalTime) this.variavel.interpretar();
		LocalTime constante = (LocalTime) this.constante.interpretar();
		if (variavel.compareTo(constante) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return variavel.toString() + " maior do que " + constante.toString();
	}
}
