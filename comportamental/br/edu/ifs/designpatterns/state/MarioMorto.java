package br.edu.ifs.designpatterns.state;

public class MarioMorto implements Estado {
	
	private Mario mario;

	public MarioMorto(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String atacar() {
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public String obterEstado() {
		return "Mario morto";
	}

	@Override
	public void pegarCogumelo() {
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public void pegarFlor() {
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public void pegarPena() {
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public void sofreDano() {
		throw new IllegalStateException("Mario está sem vida!");
	}
}
