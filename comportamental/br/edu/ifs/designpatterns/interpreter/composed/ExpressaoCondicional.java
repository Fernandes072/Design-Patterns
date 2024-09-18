package br.edu.ifs.designpatterns.interpreter.composed;

import br.edu.ifs.designpatterns.interpreter.Expressao;

public class ExpressaoCondicional implements Expressao {

	private ExpressaoTermo maior;
	private ExpressaoSequencial sequencia;

	public ExpressaoCondicional(ExpressaoTermo maior, ExpressaoSequencial sequencia) {
		this.maior = maior;
		this.sequencia = sequencia;
	}

	@Override
	public Object interpretar() {
		Boolean resultado = (Boolean) maior.interpretar();
		if (resultado) {
			sequencia.interpretar();
		}
		return null;
	}

	@Override
	public String toString() {
		return "se " + maior + " então:\n" + "execute:\n" + sequencia;
	}
}
