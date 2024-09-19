package br.edu.ifs.designpatterns.mediator;

public interface Mediador {

	public String notificao(String mensagem, Colaborador colaborador);

	public void adicionarColaborador(Colaborador colaborador);
}