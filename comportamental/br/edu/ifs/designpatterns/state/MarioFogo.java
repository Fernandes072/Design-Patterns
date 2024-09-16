package br.edu.ifs.designpatterns.state;

public class MarioFogo implements Estado {
	
	private Mario mario;

	public MarioFogo(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String atacar() {
		return "Bola de fogo";
	}

	@Override
	public String obterEstado() {
		return "Mario de fogo";
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
		mario.mudarEstado(new MarioVoador(mario));
	}

	@Override
	public void sofreDano() {
		mario.mudarEstado(new MarioSuper(mario));
	}
}
