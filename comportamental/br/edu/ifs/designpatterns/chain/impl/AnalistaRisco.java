package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class AnalistaRisco implements Analisador{
	
	private Analisador sucessor;

	@Override
	public void definirSucessor(Analisador sucessor) {
		this.sucessor = sucessor;
	}
	
	@Override
	public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
		if (requisicao.getScore() < 700) {
			throw new IllegalStateException("Analista de risco: Reprovado! Score de crédito baixo.");
		}
		return sucessor.processarRequisição(requisicao);
	}

}
