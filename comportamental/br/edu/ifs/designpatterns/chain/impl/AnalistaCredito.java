package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class AnalistaCredito implements Analisador {

	private Analisador sucessor;

	@Override
	public void definirSucessor(Analisador sucessor) {
		this.sucessor = sucessor;
	}

	@Override
	public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
		if (requisicao.getValor() > requisicao.getRenda() * 0.3) {
			throw new IllegalStateException("Analista de crédito: Reprovado! Renda insuficiente.");
		}
		return sucessor.processarRequisição(requisicao);
	}

}
