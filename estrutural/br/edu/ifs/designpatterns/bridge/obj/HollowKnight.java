package br.edu.ifs.designpatterns.bridge.obj;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.bridge.ObjetoGrafico;
import br.edu.ifs.designpatterns.bridge.Plataforma;

public class HollowKnight extends ObjetoGrafico {

	public HollowKnight(Plataforma plataforma) {
		super(plataforma);
	}

	@Override
	public int getVelocidade() {
		return 15;
	}

	@Override
	public List<Ponto> andar(boolean estado) {
		double distancia = (double) getVelocidade() / getPlataforma().getFPS();
		return mover(estado, distancia);
	}

	@Override
	public List<Ponto> correr(boolean estado) {
		double distancia = (double) getVelocidade() / getPlataforma().getFPS();
		return mover(estado, distancia * 2);
	}
	
	public List<Ponto> mover(boolean estado, double distancia){
		Ponto novaPosicao = null;
		List<Ponto> trajetoria = new ArrayList<Ponto>();
		trajetoria.add(getPosicao());
		for (int i = 0; i < getPlataforma().getFPS(); i++) {
			if (estado) {
				novaPosicao = new Ponto(getPosicao().getX() + distancia, 0);
			} else {
				novaPosicao = new Ponto(getPosicao().getX() - distancia, 0);
			}
			atualizarPonto(novaPosicao);
			trajetoria.add(getPosicao());
		}
		return trajetoria;
	}

	@Override
	public List<Ponto> pular() {
		Ponto novaPosicao = null;
		double distancia = (double) getVelocidade() / getPlataforma().getFPS();
		List<Ponto> trajetoria = new ArrayList<Ponto>();
		trajetoria.add(getPosicao());
		for (int i = 0; i < getPlataforma().getFPS(); i++) {
			novaPosicao = new Ponto(0, getPosicao().getY() + distancia);
			atualizarPonto(novaPosicao);
			trajetoria.add(getPosicao());
		}
		trajetoria.add(novaPosicao);
		for (int i = 0; i < getPlataforma().getFPS(); i++) {
			novaPosicao = new Ponto(0, getPosicao().getY() - distancia);
			atualizarPonto(novaPosicao);
			trajetoria.add(getPosicao());
		}
		return trajetoria;
	}

}
