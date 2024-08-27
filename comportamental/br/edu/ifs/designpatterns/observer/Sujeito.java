package br.edu.ifs.designpatterns.observer;

import br.edu.ifs.designpatterns.observer.impl.Cliente;

public interface Sujeito {
	
	public void inscrever(Cliente cliente);
	public void notificar();
}
