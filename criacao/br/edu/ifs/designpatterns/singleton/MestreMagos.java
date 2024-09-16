package br.edu.ifs.designpatterns.singleton;

public class MestreMagos {
	
	private static MestreMagos mestreMagos;
	private int nivelMagia;

	private MestreMagos() {
		nivelMagia = 1;
	}

	public static MestreMagos obterInstancia() {
		if(mestreMagos == null) {
			mestreMagos = new MestreMagos();
		}
		return mestreMagos;
	}

	public void elevarNivel() {
		nivelMagia++;
	}

	public int getNivelMagia() {
		return nivelMagia;
	}
}
