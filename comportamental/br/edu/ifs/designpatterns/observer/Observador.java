package br.edu.ifs.designpatterns.observer;

import br.edu.ifs.designpatterns.observer.impl.Produto;

public interface Observador {
	
	public void comprar(Produto produto);
}
