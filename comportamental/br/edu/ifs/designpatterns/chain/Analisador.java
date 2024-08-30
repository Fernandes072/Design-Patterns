package br.edu.ifs.designpatterns.chain;

import br.edu.ifs.designpatterns.chain.impl.Emprestimo;
import br.edu.ifs.designpatterns.chain.impl.RequisicaoEmprestimo;

public interface Analisador {

	public void definirSucessor(Analisador analisador);
	public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao);

}
