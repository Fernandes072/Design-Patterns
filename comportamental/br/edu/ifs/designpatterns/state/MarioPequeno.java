package br.edu.ifs.designpatterns.state;

public class MarioPequeno implements Estado {
	
	private Mario mario;

	public MarioPequeno(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String atacar() {
		return "Salto";
	}

	@Override
	public String obterEstado() {
		return "Mario pequeno";
	}

	@Override
	public void pegarCogumelo() {
		mario.mudarEstado(new MarioSuper(mario));
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
		mario.mudarEstado(new MarioMorto(mario));
	}
}
