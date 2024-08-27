package br.edu.ifs.designpatterns.flyweight.impl;

import br.edu.ifs.designpatterns.flyweight.Flyweight;

public class Bloco implements Flyweight {

	private int x;
	private int y;
	private int z;
	private TipoBloco tipoBloco;

	public Bloco(int x, int y, int z, TipoBloco tipoBloco) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.tipoBloco = tipoBloco;
	}

	public TipoBloco getTipo() {
		return tipoBloco;
	}

	public String mostrar() {
		return tipoBloco.getTipo() + ", " + tipoBloco.getQuebravel() + ", " + tipoBloco.getInflamavel() + ", "
				+ tipoBloco.getEmpilhavel() + ", x: "+x+", y: "+y+", z: "+z;
	}

}
