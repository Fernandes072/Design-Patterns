package br.edu.ifs.designpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.observer.Observador;

public class Cliente implements Observador{
	
	private String nome;
	private List<String> pedidos = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void comprar(Produto produto){
		produto.comprar();
		pedidos.add(produto.toString());
	}
	
	public List<String> getPedidos(){
		return pedidos;
	}

}
