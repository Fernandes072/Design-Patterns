package br.edu.ifs.designpatterns.memento;

import java.util.Stack;

import br.edu.ifs.designpatterns.memento.impl.Jogo;

public class Armazenador {

	private Stack<Jogo> saves = new Stack<>();

	public void armazenar(Jogo save) {
		saves.push(save);
	}

	public Jogo recuperar() {
		if (saves.isEmpty()) {
			throw new IllegalStateException("Histórico vazio");
		}
		return saves.pop();
	}

}
