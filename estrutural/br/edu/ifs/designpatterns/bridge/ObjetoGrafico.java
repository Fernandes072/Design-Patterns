package br.edu.ifs.designpatterns.bridge;

import java.util.List;

import br.edu.ifs.designpatterns.bridge.obj.Ponto;

public abstract class ObjetoGrafico {
	
	private Plataforma plataforma;
	private Ponto ponto;
	
	public ObjetoGrafico(Plataforma plataforma) {
		this.plataforma = plataforma;
		this.ponto = new Ponto(0,0);
	}
	
	public abstract int getVelocidade();
	
	public abstract List<Ponto> andar(boolean estado);
	
	public abstract List<Ponto> correr(boolean estado);
	
	public abstract List<Ponto> pular();
	
	public Ponto getPosicao() {
		return ponto;
	}
	
	protected Plataforma getPlataforma() {
		return plataforma;
	}
	
//	protected Ponto getPonto() {
//		return ponto;
//	}
	
	protected void atualizarPonto(Ponto ponto) {
		this.ponto = ponto;
	}
}
