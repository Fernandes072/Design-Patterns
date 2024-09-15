package br.edu.ifs.designpatterns.proxy.impl;

import br.edu.ifs.designpatterns.proxy.Arquivo;

public class ArquivoProxy implements Arquivo {

	private Arquivo arquivoReal;
	private Permissao permissao;

	public ArquivoProxy(String nome, Permissao permissao) {
		this.permissao = permissao;
		arquivoReal = new ArquivoReal(nome);
	}

	@Override
	public void criar() {
		if (!permissao.getEscrita()) {
			throw new IllegalStateException("Acesso negado!");
		}
		arquivoReal.criar();
	}

	@Override
	public void escrever(String texto) {
		if (!permissao.getEscrita()) {
			throw new IllegalStateException("Acesso negado!");
		}
		if (arquivoReal.recuperar().length() > 0) {
			texto = "\n" + texto;
		}
		arquivoReal.escrever(texto);
	}

	@Override
	public String recuperar() {
		if (!permissao.getLeitura()) {
			throw new IllegalStateException("Acesso negado!");
		}
		return arquivoReal.recuperar();
	}

	@Override
	public void remover() {
		if (!permissao.getEscrita()) {
			throw new IllegalStateException("Acesso negado!");
		}
		arquivoReal.remover();
	}
}
