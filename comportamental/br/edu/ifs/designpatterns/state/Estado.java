package br.edu.ifs.designpatterns.state;

public interface Estado {
	
	public String atacar();
	
	public String obterEstado();
	
	public void pegarCogumelo();
	
	public void pegarFlor();
	
	public void pegarPena();
	
	public void sofreDano();
}
