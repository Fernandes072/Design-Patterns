package br.edu.ifs.designpatterns.iterator;

public interface Iterador<T> {

	public T proximo();
	public boolean temProximo();
	
}
