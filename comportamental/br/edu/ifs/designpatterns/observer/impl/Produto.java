package br.edu.ifs.designpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.observer.Sujeito;

public class Produto implements Sujeito{
	
	private String nome;
	private int quantidade;
	private List<Cliente> clientes = new ArrayList<>();

	public Produto(String nome) {
		this.nome = nome;
	}
	
	public boolean estaDisponivel() {
		return quantidade > 0;
	}
	
	public void comprar() {
		if (!estaDisponivel()) {
			throw new IllegalStateException("Produto indisponível");
		}
		quantidade--;
	}

	@Override
	public void inscrever(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void adicionar(int quantidade) {
		this.quantidade+=quantidade;
		notificar();
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public void notificar() {
		for (Cliente cliente : clientes) {
			cliente.comprar(this);
		}
	}
	
	@Override
	public String toString() {
		return nome;
	}

}
