package br.edu.ifs.designpatterns.state;

public class MarioVoador implements Estado {
	
	private Mario mario;

	public MarioVoador(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String atacar() {
		return "Capa giratória";
	}

	@Override
	public String obterEstado() {
		return "Mario voador";
	}
	
	@Override
	public void pegarCogumelo() {
		return;
	}

	@Override
	public void pegarFlor() {
		return;
	}

	@Override
	public void pegarPena() {
		return;
	}

	@Override
	public void sofreDano() {
		mario.mudarEstado(new MarioSuper(mario));
	}
}
