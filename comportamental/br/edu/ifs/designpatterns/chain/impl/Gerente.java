package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class Gerente implements Analisador{
	
	private Analisador sucessor;

	@Override
	public void definirSucessor(Analisador sucessor) {
		this.sucessor = sucessor;
	}
	
	@Override
	public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
		return new Emprestimo(requisicao.getValor());
	}

}
