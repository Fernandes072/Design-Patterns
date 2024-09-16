package br.edu.ifs.designpatterns.state;

public class Mario {
	
	private Estado estado;
	
	public Mario() {
		estado = new MarioPequeno(this);
	}
	
	public void mudarEstado(Estado estado) {
		this.estado = estado;
	}

	public String atacar() {
		return estado.atacar();
	}

	public String obterEstado() {
		return estado.obterEstado();
	}
	
	public void pegarCogumelo() {
		estado.pegarCogumelo();
	}

	public void pegarFlor() {
		estado.pegarFlor();
	}

	public void pegarPena() {
		estado.pegarPena();
	}

	public void sofreDano() {
		estado.sofreDano();
	}
}
