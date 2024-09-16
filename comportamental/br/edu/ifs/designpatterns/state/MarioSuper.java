package br.edu.ifs.designpatterns.state;

public class MarioSuper implements Estado {
	
	private Mario mario;

	public MarioSuper(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String atacar() {
		return "Super salto";
	}

	@Override
	public String obterEstado() {
		return "Super Mario";
	}
	
	@Override
	public void pegarCogumelo() {
		return;
	}

	@Override
	public void pegarFlor() {
		mario.mudarEstado(new MarioFogo(mario));
	}

	@Override
	public void pegarPena() {
		mario.mudarEstado(new MarioVoador(mario));
	}

	@Override
	public void sofreDano() {
		mario.mudarEstado(new MarioPequeno(mario));
	}
}
